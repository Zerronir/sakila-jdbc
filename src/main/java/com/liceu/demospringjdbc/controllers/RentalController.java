package com.liceu.demospringjdbc.controllers;

import com.liceu.demospringjdbc.entities.Film;
import com.liceu.demospringjdbc.entities.Staff;
import com.liceu.demospringjdbc.services.FilmService;
import com.liceu.demospringjdbc.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RentalController {
    @Autowired
    FilmService filmService;

    @GetMapping("/rental")
    public String rental(Model model) {
        List<Film> films = filmService.findAll();
        System.out.println(films);
        if(films != null) model.addAttribute("films", films);
        return "rental";
    }

    // Entramos en una tienda a ver su stock para alquilar
    @GetMapping("/rental/store/stock")
    public String rentalStock(Model model) {
        List<Film> availableFilms;
        //model.addAttribute("films", availableFilms);
        return "stockCheck";
    }

}
