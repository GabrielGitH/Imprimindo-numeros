package com.primeirotrampodev.lacofor.controller;

import com.primeirotrampodev.lacofor.service.QuintoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/laco-for")
public class QuintoController {

    @Autowired
    private QuintoService quintoService;

    @GetMapping("/palavras-list")
    public List<Character> palavraList(@RequestParam("texto") String texto) {

        return quintoService.palavraList(texto);
}


}
