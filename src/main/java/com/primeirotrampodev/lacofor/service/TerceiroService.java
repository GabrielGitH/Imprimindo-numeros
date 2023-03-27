package com.primeirotrampodev.lacofor.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TerceiroService {

    public List<Integer> contadorDe0A50() {


        List<Integer> resultado = new ArrayList<>();

        for(Integer cont = 0; cont <= 50; cont += 5) {
            resultado.add(cont);
        }

        return resultado;
    }
}

