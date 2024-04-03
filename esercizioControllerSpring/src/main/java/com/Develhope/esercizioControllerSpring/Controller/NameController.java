package com.Develhope.esercizioControllerSpring.Controller;

import com.Develhope.esercizioControllerSpring.Service.NameService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es1")
public class NameController {
    @Autowired
    public NameService nameService;
    //prende un elemento già esistente
    @GetMapping("/nome")
    public String nome(@RequestParam String nome){
        return nome;
    }
    //crea nuovo elemento
    @PostMapping ("/nomeInverso")
    public String nomeInvertito(@RequestParam String nome){
        return nameService.nomeAlContrario(nome);
    }

}
