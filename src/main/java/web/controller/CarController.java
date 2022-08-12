package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Cars;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarServiceImpl carService = new CarServiceImpl();
    @GetMapping("/")
    public String getCarsView(Model model) {

        return "cars";
    }

    @GetMapping("/showCars")
    public String getShowCars(@RequestParam("count") int count, Model model) {
        return "showCars";
    }

    @GetMapping("/enterCars")
    public String getEnterCars(@ModelAttribute("cars") Cars car, Model model) {
        model.addAttribute("brandCar", car.getBrand());
        model.addAttribute("modelCar", car.getModel());
        model.addAttribute("gosNumberCar", car.getGosNumber());
//        Cars cars = new Cars(model.getAttribute("brandCar").toString(),
//                model.getAttribute("modelCar").toString(),
//                model.getAttribute("gosNumberCar").toString());
//        carService.addCar(cars);
//        System.out.println(cars);
        System.out.println(model.getAttribute("brandCar"));
        return "enterCars";
    }
}
