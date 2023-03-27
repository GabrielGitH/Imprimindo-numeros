package com.primeirotrampodev.lacofor.controller;

import com.primeirotrampodev.lacofor.service.SegundoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/somandode1a100")
public class SegundoController {

    @Autowired
    private SegundoService segundoService;

    @GetMapping("/soma")
    public Integer SomandoDe1A100() {

        return segundoService.somaDe1a100();
    }
}
