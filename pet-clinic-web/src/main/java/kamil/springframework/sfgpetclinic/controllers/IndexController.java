package kamil.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kamil on 15.03.2020.
 */
@Controller
public class IndexController {

    //to request to znaczy ze jak ktos wpisze po slashu index albo index.html to go przekieruje do wykonania metody index()
    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(){
        return "notimplemented";
    }
}
