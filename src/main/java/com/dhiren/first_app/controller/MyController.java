package com.dhiren.first_app.controller;

import com.dhiren.first_app.model.Person;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class MyController {

   @GetMapping("/")
   public String welcome(){
      return "Successful";
   }

   @GetMapping("/persons")
   public List<Person> names(){
      List<Person> persons = new ArrayList<>();
      persons.add(new Person("Daren","Evans","Pune"));
      persons.add(new Person("Manav","Singh","Agra"));
      persons.add(new Person("Shubh","Kher","Pune"));
      persons.add(new Person("Shiv","Khanna","Agra"));
      return persons;
      //mvn spring-boot:build-image -DskipTests
   }

}
