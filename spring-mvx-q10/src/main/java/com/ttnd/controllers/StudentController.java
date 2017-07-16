package com.ttnd.controllers; /**
 * Created by Lenovo-1 on 16-07-2017.
 */

import com.sun.tracing.dtrace.ModuleAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class StudentController {

    @ModelAttribute
    void addObject(Model model){
        model.addAttribute("heading","Spring mvc demo");
    }
   @RequestMapping(value = "/index.html",method = RequestMethod.GET)
   ModelAndView index(){
       return new ModelAndView("index");
   }

   @RequestMapping(value = "/submitForm.html",method = RequestMethod.POST)
   @ResponseBody
   ModelAndView submitForm(@ModelAttribute("studentCO") StudentCO studentCO){
       ModelAndView modelAndView=new ModelAndView("welcome");
       return modelAndView;


   }
}