package com.primeirotrampodev.lacofor.controller;

import com.primeirotrampodev.lacofor.service.TerceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/laco-for")
public class TerceiroController {

    @Autowired
    private TerceiroService terceiroService;

    @GetMapping("/multiplos-cinco")
    private List<Integer> multiplosDeCinco() {

        return terceiroService.contadorDe0A50();
    }
}
