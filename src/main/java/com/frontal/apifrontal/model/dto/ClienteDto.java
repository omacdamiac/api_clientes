package com.frontal.apifrontal.model.dto;


import lombok.Data;
import lombok.ToString;
import lombok.Builder;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@Builder
public class ClienteDto implements Serializable {

    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String correo;
    private Date fechaRegistro;

}
