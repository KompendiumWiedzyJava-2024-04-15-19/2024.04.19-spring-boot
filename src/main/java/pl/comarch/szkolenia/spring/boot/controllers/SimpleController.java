package pl.comarch.szkolenia.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.comarch.szkolenia.spring.boot.model.Car;
import pl.comarch.szkolenia.spring.boot.repositories.INameRepository;

@Controller
public class SimpleController {

    @Autowired
    private INameRepository nameRepository;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String test1() {
        System.out.println("cos zadzialalo !!!");
        return "index";
    }

    @RequestMapping(path = "/test2", method = RequestMethod.GET)
    public String test2(@RequestParam("p1") String nazwa,
                        @RequestParam("p2") String cos) {
        System.out.println("dziala test2 !!!");
        System.out.println(nazwa);
        System.out.println(cos);
        return "index";
    }

    @RequestMapping(path = "/test3/{imie}/{nazwisko}/{wiek}", method = RequestMethod.GET)
    public String test3(@PathVariable("imie") String imie,
                        @PathVariable("nazwisko") String nazwisko,
                        @PathVariable("wiek") int wiek) {
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(wiek);
        return "index";
    }

    @RequestMapping(path = "/test4", method = RequestMethod.GET)
    public String test4(Model model) {

        model.addAttribute("imie", this.nameRepository.getRandomName());

        model.addAttribute("imiona", this.nameRepository.getAllNames());
        return "names";
    }

    @RequestMapping(path = "/test5", method = RequestMethod.GET)
    public String test5() {
        Car car = new Car("BMW", "3",
                "KR11", 400.00, false);

        car.setBrand("Audi");

        System.out.println(car.getBrand());
        System.out.println(car);

        Car car2 = new Car("BMW", "3",
                "KR11", 400.00, false);

        Car car3 = new Car("BMW", "3",
                "KR11", 400.00, false);

        System.out.println(car2.equals(car3));

        return "index";
    }
}
