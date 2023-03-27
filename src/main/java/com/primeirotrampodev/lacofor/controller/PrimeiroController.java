package com.primeirotrampodev.lacofor.controller;

import com.primeirotrampodev.lacofor.service.PrimeiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/laco-for")
public class PrimeiroController {

    @Autowired
    private PrimeiroService primeiroService;

    @GetMapping("/metodo-umAdez")
    public List<Integer> contadorUmADez() {

        return primeiroService.resultadoFor();
    }
}
