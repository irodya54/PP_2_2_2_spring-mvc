package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.dao.CarDaoImpl;
import web.model.Cars;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarDaoImpl dao;

    public CarController(CarDaoImpl dao) {
        this.dao = dao;
    }

    @GetMapping("showCars")
    public String showAllCars(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("allCars", dao.getCarsListByCount(count));

        return "cars/showCars";
    }

    @GetMapping("/enterCar")
    public String addCar(Model model) {
        model.addAttribute("car", new Cars());
        return "cars/enterCar";
    }

    @PostMapping()
    public String postMethodCar(@ModelAttribute("car") Cars car) {
        dao.addCar(car);
        return "redirect:/cars/showCars";
    }


}
