package com.ttnd.controllers;

import org.springframework.stereotype.Component;

/**
 * Created by Lenovo-1 on 16-07-2017.
 */

public class StudentCO {
    String lname;
    String fname;

    public StudentCO() {
    }

    public StudentCO(String lname, String fname) {
        this.lname = lname;
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
