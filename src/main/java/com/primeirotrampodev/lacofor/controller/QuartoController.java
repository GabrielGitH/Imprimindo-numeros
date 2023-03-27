package com.primeirotrampodev.lacofor.controller;

import com.primeirotrampodev.lacofor.service.QuartoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/numeros-divisores")
public class QuartoController {

    @Autowired
    private QuartoService quartoService;

    @GetMapping("/dividindo")
    private List<Integer> divisor(@RequestParam("numero") Integer numero) {

        return quartoService.divisores(numero);

    }


}
