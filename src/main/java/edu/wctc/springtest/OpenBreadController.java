package edu.wctc.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OpenBreadController {

    @RequestMapping("/open-bread")
    public String showAssemble() {return "pages/open-bread";}

}
