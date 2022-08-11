package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Cars;

@Controller
@RequestMapping("/cars")
public class CarController {
    @GetMapping("/")
    public String getCarsView() {
        return "cars";
    }

    @GetMapping("/showCars")
    public String getShowCars() {
        return "showCars";
    }

    @GetMapping("/enterCars")
    public String getEnterCars(@RequestParam("brand") String brand,
                               @RequestParam("model") String model,
                               @RequestParam("gosNumber") String gosNumber) {
        Cars car = new Cars(brand, model, gosNumber);

        return "enterCars";
    }
}
