package com.ttnd.controllers; /**
 * Created by Lenovo-1 on 16-07-2017.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class StudentController {

   @RequestMapping(value = "/index.html",method = RequestMethod.GET)
   ModelAndView index(){
       return new ModelAndView("index");
   }

   @RequestMapping(value = "/submitForm.html",method = RequestMethod.POST)
   @ResponseBody
   ModelAndView submitForm(StudentCO studentCO){
       ModelAndView modelAndView=new ModelAndView("welcome");
       modelAndView.addObject("fname",studentCO.getFname());
       modelAndView.addObject("lname",studentCO.getLname());
       return modelAndView;


   }
}