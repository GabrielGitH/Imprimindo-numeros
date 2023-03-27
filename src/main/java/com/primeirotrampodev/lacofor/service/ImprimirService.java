package com.primeirotrampodev.lacofor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImprimirService {


    public void listaDe1A10() {

        for (Integer cont = 1; cont <= 10; cont++) {
            System.out.println(cont);

        }
    }

}
