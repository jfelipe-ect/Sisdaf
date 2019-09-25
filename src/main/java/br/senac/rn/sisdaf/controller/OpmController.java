package br.senac.rn.sisdaf.controller;

import br.senac.rn.sisdaf.model.Opm;
import br.senac.rn.sisdaf.service.OpmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/opms")

public class OpmController {

    @Autowired
    private OpmService service;

    @GetMapping
    public String listaTodos(Model model) {
        Opm opm = new Opm();
        model.addAttribute("opm", opm);
        List<Opm> opms = service.listaTodos();
        model.addAttribute("opms", opms);
        return "opms";
    }

    @PostMapping
    public String salva(Opm opm) {
        service.salva(opm);
        return "redirect:/opm";
    }

    @GetMapping("/{id}/remove")
    public String remove(@PathVariable("id") Long id) {
        service.removePorId(id);
        return "redirect:/opms";
    }

    @GetMapping("/{id}/edita")
    public String edita(@PathVariable("id") Long id, Model model) {
        Opm opm = service.listaPorId(id);
        model.addAttribute("opm", opm);
        List<Opm> opms = service.listaTodos();
        model.addAttribute("opms", opms);
        return "opms";
    }

}
