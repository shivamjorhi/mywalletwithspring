package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.MyWallet;
import com.cg.services.CountryService;

@RestController
@RequestMapping("/wallets")
public class MyWalletController {

    @Autowired CountryService service;

    @GetMapping(value="/")	
    public List<MyWallet> getAll() {
        return service.getAll();
    }
    
    
    @PostMapping(value="/new",consumes= {"application/json"})
    public String save(@RequestBody MyWallet wallet) {
        service.create(wallet);
        return "Account added!";
    }
    
    @PutMapping(value="/update",consumes= {"application/json"})
    public String update(@RequestBody MyWallet wallet) {
        service.update(wallet);
        return "Account updated";
    }    
    
    @DeleteMapping(value="/number/{accId}")	
    public Integer deleteAll(@PathVariable Integer accId) {
        return service.deleteAll(accId);
    }
}