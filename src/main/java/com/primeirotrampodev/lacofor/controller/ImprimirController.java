package com.primeirotrampodev.lacofor.controller;

import com.primeirotrampodev.lacofor.service.ImprimirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imprimirDe1A10")
public class ImprimirController {

    @Autowired
    private ImprimirService imprimirService;

    @RequestMapping(value = "/listaDe1A10")
    public void listaDe1A10() {
        imprimirService.listaDe1A10();

    }
}
