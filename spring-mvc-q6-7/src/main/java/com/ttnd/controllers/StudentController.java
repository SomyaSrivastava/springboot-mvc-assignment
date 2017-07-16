package com.ttnd.controllers; /**
 * Created by Lenovo-1 on 16-07-2017.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/index")
public class StudentController {

    @RequestMapping("/demo1/{fname}/{lname}")
    @ResponseBody
    String demo1(@PathVariable("fname") String fname,@PathVariable("lname") String lname) {
    return fname+" "+lname;
    }


    @RequestMapping("/demo/{fname}/{lname}")
    @ResponseBody
    String demo(@PathVariable Map<String,String> reqMap) {

        return reqMap.get("fname")+" "+reqMap.get("lname");
    }
}