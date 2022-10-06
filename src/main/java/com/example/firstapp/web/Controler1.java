package com.example.firstapp.web;

import com.example.firstapp.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Controler1 {
    List<Person> personList = new ArrayList<>();

    @GetMapping("/")
    public String main(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        return "main";
    }

    @GetMapping("/add-person")
    public String addPerson(Model m) throws IOException {
        m.addAttribute("newPerson",new Person("",""));
        return "add-person";
    }
    @PostMapping("/add-person")
    public String addPerson(Model m, @ModelAttribute Person newPerson) throws IOException {
        personList.add(newPerson);
        m.addAttribute("newPerson",new Person("",""));
        return "person-list";
    }

    @GetMapping("/person-list")
    public String personList(Model m) throws IOException {
        List<Person> ps = new ArrayList<>();

        m.addAttribute("persons",ps);
        return "person-list";
    }
}
