package com.primeirotrampodev.lacofor.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SegundoService {

    public Integer somaDe1a100() {


        Integer resultado = 0;

        for(Integer cont = 1; cont <=100; cont++) {
            resultado += cont;
        }

        return resultado;
    }
}
