package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.Cars;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService service;


    @GetMapping("showCars")
    public String showAllCars(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("count", count);
        model.addAttribute("allCars", service.getCarsListByCount(count));

        return "cars/showCars";
    }

    @GetMapping("/enterCar")
    public String addCar(Model model) {
        model.addAttribute("car", new Cars());
        return "cars/enterCar";
    }

    @PostMapping()
    public String postMethodCar(@ModelAttribute("car") Cars car) {
        service.addCar(car);
        return "redirect:/cars/showCars";
    }


}
