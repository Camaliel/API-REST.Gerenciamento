package com.AttornatusProcuradoria.ApiGerenciamento.Controllers;

import com.AttornatusProcuradoria.ApiGerenciamento.Model.Entities.Cliente;
import com.AttornatusProcuradoria.ApiGerenciamento.Model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/API/CLIENTES")
public class clienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public Cliente cliente(@Valid Cliente cliente) {
        clienteRepository.save(cliente);
        return cliente;
    }

    @GetMapping
    private Iterable<Cliente> obterCliente() {
        return clienteRepository.findAll();
    }
    @GetMapping(path = "/nome/{parteNome}")
    private Iterable<Cliente> obterClientePorNome(@PathVariable String parteNome) {
        return clienteRepository.findByNomeContainingIgnoreCase(parteNome);
    }
    @GetMapping(path = "/{id}")
    private Optional<Cliente>obterClienteporId(@PathVariable int id){
        return clienteRepository.findById(id);
    }
    @PutMapping
    public Cliente alterarCliente(@Valid Cliente cliente) {
        clienteRepository.save(cliente);
        return cliente;
    }
    @DeleteMapping(path = "/{id}")
    public void excluirCliente(@PathVariable int id){
        clienteRepository.deleteById(id);
    }
}

