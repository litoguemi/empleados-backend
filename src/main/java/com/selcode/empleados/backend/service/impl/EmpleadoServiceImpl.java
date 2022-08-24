package com.selcode.empleados.backend.service.impl;

import com.selcode.empleados.backend.dao.EmpleadoDao;
import com.selcode.empleados.backend.model.Empleado;
import com.selcode.empleados.backend.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    EmpleadoDao empleadoDao;

    @Override
    public List<Empleado> buscar() {
        return empleadoDao.findAll();
    }

    @Override
    public Empleado buscarPorId(String id) {
        Optional<Empleado> empleadoOptional = empleadoDao.findById(id);
        if(empleadoOptional.isPresent()){
            return empleadoOptional.get();
        }
        return null;
    }

    @Override
    public Empleado guardar(Empleado empleado) {
        return empleadoDao.save(empleado);
    }

    @Override
    public void eliminar(String id) {
        empleadoDao.deleteById(id);
    }
}
