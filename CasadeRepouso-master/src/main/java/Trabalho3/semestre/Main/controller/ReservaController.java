package Trabalho3.semestre.Main.controller;

import Trabalho3.semestre.Main.entidades.Reserva;
import Trabalho3.semestre.Main.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reserva")
public record ReservaController(ReservaService reservaService) {


    @Autowired
    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping
    public Reserva salvar(@RequestBody Reserva reserva){
        return reservaService.salvar(reserva);
    }
}
