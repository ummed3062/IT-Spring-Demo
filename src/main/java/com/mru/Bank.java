package com.mru;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bankapi")
public class Bank {
    

    @GetMapping("/credit")
    String credit(){
        return "Credit successfully";
    }

    @GetMapping("debit")
    String debit(){

        return "Debit...";
    }

    @GetMapping("balance")
    String balance(){
        return "1000000";
    }
}
