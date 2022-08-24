package com.selcode.empleados.backend.dao;

import com.selcode.empleados.backend.model.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpleadoDao extends MongoRepository<Empleado, String> {
}
