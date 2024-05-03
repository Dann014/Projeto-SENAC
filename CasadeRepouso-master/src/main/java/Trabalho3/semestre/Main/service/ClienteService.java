package Trabalho3.semestre.Main.service;

import Trabalho3.semestre.Main.controller.ClienteController;
import Trabalho3.semestre.Main.entidades.Cliente;
import Trabalho3.semestre.Main.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record ClienteService(ClienteRepository clienteRepository) {

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void deletar(Long id){
        clienteRepository.deleteById(id);
    }

    public Cliente buscarCliente(Long id){
        return clienteRepository.findById(id).orElse(null);
    }
    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }
}
