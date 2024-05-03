package Trabalho3.semestre.Main.service;

import Trabalho3.semestre.Main.entidades.Reserva;
import Trabalho3.semestre.Main.repository.ReservaRepository;
import org.springframework.stereotype.Service;

@Service
public record ReservaService(ReservaRepository reservaRepository) {
    public Reserva salvar(Reserva reserva){
        return reservaRepository.save(reserva);
    }
}
