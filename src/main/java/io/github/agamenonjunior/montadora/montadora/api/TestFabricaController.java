package io.github.agamenonjunior.montadora.montadora.api;

import io.github.agamenonjunior.montadora.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFabricaController {

    @Autowired
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
            var carro = new HondaHRV(motor);
            carro.darIgnicao(chave);
    }

}
