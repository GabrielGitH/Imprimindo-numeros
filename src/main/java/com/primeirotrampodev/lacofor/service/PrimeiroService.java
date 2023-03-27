package com.primeirotrampodev.lacofor.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrimeiroService {

    public List<Integer> resultadoFor() {

        List<Integer> resultado =  new ArrayList<>();

        for(Integer cont = 1; cont <=10; cont++) {
            resultado.add(cont);

        }

        return resultado;
    }
}
