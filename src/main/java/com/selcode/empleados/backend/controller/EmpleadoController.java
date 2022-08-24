package com.selcode.empleados.backend.controller;

import com.selcode.empleados.backend.model.Empleado;
import com.selcode.empleados.backend.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @RequestMapping("/")
    public String index (Model model){
        model.addAttribute("listEmpleado", empleadoService.buscar());
        return "index";
    }

    @PostMapping("/guardar")
    public String save(Empleado empleado){
        empleadoService.guardar(empleado);
        return "redirect:/";
    }

    @GetMapping("/guardar/{id}")
    public String showSave(@PathVariable("id") String id, Model model){
        if(id != null && !"0".equals(id)){
            model.addAttribute("empleado",empleadoService.buscarPorId(id));
        }else{
            model.addAttribute("empleado",new Empleado());
        }
        return "guardar";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable("id") String id, Model model){
        empleadoService.eliminar(id);
        return "redirect:/";
    }


}
