package com.primeirotrampodev.lacofor.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuintoService {

    public List<Character> palavraList(String texto) {

        List<Character> palavraList = new ArrayList<>();

        Integer cont;

        for(cont = 0; cont < texto.length(); cont++) {
            palavraList.add(texto.charAt(cont));
        }

        return palavraList;
    }
}
