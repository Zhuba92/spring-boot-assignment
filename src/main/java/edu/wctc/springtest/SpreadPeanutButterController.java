package edu.wctc.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpreadPeanutButterController {

    @RequestMapping("/spread-peanut-butter")
    public String showOpenBread() {return "pages/spread-peanut-butter";}

}
