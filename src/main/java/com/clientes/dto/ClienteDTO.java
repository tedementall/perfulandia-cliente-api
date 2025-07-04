package com.clientes.dto;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO extends RepresentationModel<ClienteDTO> {
    private Integer idCliente;
    private Integer idUsuario;
    private String nombreCompleto;
    private String rut;
    private String direccion;
    private String telefono;
}