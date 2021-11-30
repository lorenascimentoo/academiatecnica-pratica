package com.atp.atp64.repository;

import java.util.List;

import com.atp.atp64.model.Cliente;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClienteRepository extends PagingAndSortingRepository<Cliente,Integer>{
    @Override
    default Iterable<Cliente> findAll() {
        return findAll(Sort.by(Sort.Direction.ASC, "id"));
    }
    List<Cliente> findByNome(String nome);
}
