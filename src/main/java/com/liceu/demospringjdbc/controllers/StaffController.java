package com.liceu.demospringjdbc.controllers;


import com.liceu.demospringjdbc.entities.Staff;
import com.liceu.demospringjdbc.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StaffController {

    @Autowired
    StaffService staffService;

    @PostMapping("/staff/login")
    public String doLogin(@RequestParam("email") String email, Model model) {
        // Recogemos la info del usuario a través del formulario
        Staff staff = staffService.getStaff(email);
        model.addAttribute("staff", staff);
        return "login";
    }

}
