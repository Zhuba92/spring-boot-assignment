package edu.wctc.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AssembleController {

    @RequestMapping("/assemble")
    public String showAssemble() {return "pages/assemble";}
}
