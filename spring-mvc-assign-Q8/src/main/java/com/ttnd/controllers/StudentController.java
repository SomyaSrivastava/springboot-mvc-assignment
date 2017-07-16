package com.ttnd.controllers; /**
 * Created by Lenovo-1 on 16-07-2017.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/demo")
public class StudentController {

   @RequestMapping(value = "/index.html",method = RequestMethod.GET)
   ModelAndView index(){
    return new ModelAndView("index");
   }

   @RequestMapping(value = "/submitForm.html",method = RequestMethod.POST)
   @ResponseBody
   String submitForm(@RequestParam("firstname") String fname,@RequestParam("lastname") String lname){
    return fname+"-"+lname;
   }
}