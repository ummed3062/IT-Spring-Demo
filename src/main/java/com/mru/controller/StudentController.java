package com.mru.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mru.service.Add;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Student";
    }

    @PostMapping("/add/{a}") // /add/20
    public int add(@PathVariable int a) { // int a = 20

        return 10 + a; // 10 + 20 = 30
    }

    // @PostMapping("/add") // /add/20
    // public int add(@RequestBody Add add){ // int a = 20

    // return // 10 + 20 = 30
    // }

    @GetMapping("/students/{id}/studenId/{sId}")
    public String getStudent(@PathVariable Long id, @PathVariable Long sId) {
        System.out.println("Student ID: " + id);
        System.out.println("Student ID: " + sId);
        return "Student ID: " + id + ", Student ID: " + sId;
    }

    


    //http://localhost:9090/api/add/20/30
    @GetMapping("/add/{a}/{b}")
    int add(@PathVariable int a, @PathVariable int b) {
        return a+b;
    }

    //http://localhost:9090/api/students?name=Ummed&age=25
    @GetMapping("/students")
    public String searchStudent(@RequestParam String name, @RequestParam int age) {

        return name + ", Age: " + age;
    }



    @PostMapping("/students")
    String details(@RequestBody Student student) {

        int id = student.getId();
        String name = student.getName();
        int age = student.getAge();
        String department = student.getDepartment();
        String address = student.getAddress();


        
        return "Details: ID: " + id + ", Name: " + name + ", Age: " + age + ", Department: " + department + ", Address: " + address;
    }

















}
