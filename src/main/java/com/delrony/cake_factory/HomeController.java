package com.delrony.cake_factory;

import com.delrony.cake_factory.data.CatalogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    private CatalogRepository catalogRepository;

    @Autowired
    public HomeController(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("catalogs", this.catalogRepository.findAll());

        return "home";
    }
}
