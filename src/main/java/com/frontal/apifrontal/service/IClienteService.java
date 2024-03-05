package com.frontal.apifrontal.service;

import com.frontal.apifrontal.model.dto.ClienteDto;
import com.frontal.apifrontal.model.entity.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> listAll();

    Cliente save(ClienteDto cliente);

    Cliente findById(Integer id);

    void delete (Cliente cliente);

    boolean existsById(Integer id);

}
