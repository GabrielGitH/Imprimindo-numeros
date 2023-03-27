package com.primeirotrampodev.lacofor.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuartoService {

    public List<Integer> divisores(Integer numero) {

        List<Integer> resultado =new ArrayList<>();

        for(Integer cont = 1; cont <= numero; cont++) {

            if(numero % cont == 0){
                resultado.add(cont);
                //System.out.println(cont);


            }
        }

        return resultado;

    }
}

