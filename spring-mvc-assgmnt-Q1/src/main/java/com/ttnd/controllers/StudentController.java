package com.ttnd.controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class StudentController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {

        return new ModelAndView("index","message","Hello from index.jsp");
    }
}
