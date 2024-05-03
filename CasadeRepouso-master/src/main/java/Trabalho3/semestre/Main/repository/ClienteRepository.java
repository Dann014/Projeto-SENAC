package Trabalho3.semestre.Main.repository;

import Trabalho3.semestre.Main.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
