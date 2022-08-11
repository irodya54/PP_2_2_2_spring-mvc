package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cars")
public class CarController {
    @GetMapping("/")
    public String getCarsView(Model model) {

        return "cars";
    }

    @GetMapping("/showCars")
    public String getShowCars() {
        return "showCars";
    }

    @GetMapping("/enterCars")
    public String getEnterCars() {
        return "enterCars";
    }
}
