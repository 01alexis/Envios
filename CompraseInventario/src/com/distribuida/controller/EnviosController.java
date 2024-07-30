package com.distribuida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.distribuida.dao.EnviosDAO;
import com.distribuida.entities.Envios;

@Controller
@RequestMapping("/envios")
public class EnviosController {
    
    @Autowired
    private EnviosDAO enviosDAO;
    
    @GetMapping("/findAll")
    public String findAll(Model model) {
        model.addAttribute("envios", enviosDAO.findAll());
        return "listar-envios"; // Nombre de la vista para listar envíos
    }

    @GetMapping("/findOne")
    public String findOne(@RequestParam("idEnvios") @Nullable Integer idEnvios,
                          @RequestParam("opcion") @Nullable Integer opcion,
                          Model model) {
        if (idEnvios != null) {
            Envios envio = enviosDAO.findOne(idEnvios);
            model.addAttribute("envio", envio);
        }
        if (opcion != null && opcion == 1) {
            return "add-envio"; // Nombre de la vista para agregar un nuevo envío
        } else {
            return "del-envio"; // Nombre de la vista para eliminar un envío
        }
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Envios envio) {
        if (envio.getIdEnvios() == 0) {
            enviosDAO.add(envio); // Agregar nuevo envío
        } else {
            enviosDAO.up(envio); // Actualizar envío existente
        }
        return "redirect:/envios/findAll";
    }

    @GetMapping("/del")
    public String del(@RequestParam("idEnvios") @Nullable Integer idEnvios) {
        if (idEnvios != null) {
            enviosDAO.del(idEnvios);
        }
        return "redirect:/envios/findAll";
    }
}
