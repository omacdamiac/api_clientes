package com.frontal.apifrontal.service.impl;

import com.frontal.apifrontal.model.dao.ClienteDAO;
import com.frontal.apifrontal.model.dto.ClienteDto;
import com.frontal.apifrontal.model.entity.Cliente;
import com.frontal.apifrontal.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteImplService implements IClienteService {

    @Autowired
    private ClienteDAO clienteDAO;


    @Override
    public List<Cliente> listAll() {
        return (List) clienteDAO.findAll();
    }

    @Transactional
    @Override
    public Cliente save(ClienteDto clienteDto) {
        Cliente cliente = Cliente.builder()
                .idCliente(clienteDto.getIdCliente())
                .nombre(clienteDto.getNombre())
                .apellido(clienteDto.getApellido())
                .correo(clienteDto.getCorreo())
                .fechaRegistro(clienteDto.getFechaRegistro())
                .build();
        return clienteDAO.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDAO.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDAO.delete(cliente);

    }

    @Override
    public boolean existsById(Integer id) {
        return clienteDAO.existsById(id);
    }
}
