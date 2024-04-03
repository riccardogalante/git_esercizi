package com.Develhope.esercizioControllerSpring.Service;

import org.springframework.stereotype.Service;

@Service
public class NameService {
    public String nomeAlContrario(String nome){
        return new StringBuilder(nome).reverse().toString();

    }
}
