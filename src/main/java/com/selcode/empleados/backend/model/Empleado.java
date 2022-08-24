package com.selcode.empleados.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;
import java.lang.annotation.ElementType;

@Data
@Document(collection = "empleado")
public class Empleado {

    @Id
    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String telefono;
}
