package com.frontal.apifrontal.model.dao;

import com.frontal.apifrontal.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {


}
