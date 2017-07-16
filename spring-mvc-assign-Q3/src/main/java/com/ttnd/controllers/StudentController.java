package com.ttnd.controllers; /**
 * Created by Lenovo-1 on 16-07-2017.
 */

import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @RequestMapping("/")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index","message","hello");
        return modelAndView;
    }
}