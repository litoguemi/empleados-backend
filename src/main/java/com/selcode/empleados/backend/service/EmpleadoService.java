package com.selcode.empleados.backend.service;

import com.selcode.empleados.backend.model.Empleado;

import java.util.List;

public interface EmpleadoService {

    List<Empleado> buscar();
    Empleado buscarPorId(String id);
    Empleado guardar(Empleado empleado);
    void eliminar(String id);
}
