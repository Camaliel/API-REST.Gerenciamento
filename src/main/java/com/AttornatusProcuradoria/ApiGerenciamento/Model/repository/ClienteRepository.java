package com.AttornatusProcuradoria.ApiGerenciamento.Model.repository;

import com.AttornatusProcuradoria.ApiGerenciamento.Model.Entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    public Iterable<Cliente> findByNomeContainingIgnoreCase(String parteNome);

}
