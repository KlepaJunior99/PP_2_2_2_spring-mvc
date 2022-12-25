package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int init) {
        List<String> messages = new ArrayList<>();
        Service service = new Service();
        List<Car> carList = service.createFiveCars(
                "Lada Kalina", 2190, 180,
                "Toyota Land Cruiser", 300, 210,
                "Ford Raptor", 500, 225,
                "Mercedes Benz", 300, 240,
                "Range Rover", 150, 214);
        if (init >= 5) {
            messages.add(service.getAllCar(carList).toString());
            model.addAttribute("messages", messages);
        } else if (init == 1) {
            messages.add(service.getOneCar(carList).toString());
            model.addAttribute("messages", messages);
        } else if (init == 2) {
            messages.add(service.getTwoCar(carList).toString());
            model.addAttribute("messages", messages);
        } else if (init == 3) {
            messages.add(service.getThreeCar(carList).toString());
            model.addAttribute("messages", messages);
        } else if (init == 4) {
            messages.add(service.getFourCar(carList).toString());
            model.addAttribute("messages", messages);
        }
        return "cars";
    }
}