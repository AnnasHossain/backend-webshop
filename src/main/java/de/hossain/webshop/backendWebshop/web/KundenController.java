package de.hossain.webshop.backendWebshop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KundenController {

    @GetMapping(path = "/")
    public ModelAndView showKundenAnlegenPage() {
        return new ModelAndView("Kundenanlegen");
        // hier kommt die unter templates angelegte Html
    }


}
