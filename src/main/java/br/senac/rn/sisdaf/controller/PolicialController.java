package br.senac.rn.sisdaf.controller;


import br.senac.rn.sisdaf.model.Policial;
import br.senac.rn.sisdaf.service.PolicialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Policial")
public class PolicialController {

    @Autowired
    private PolicialService service;

    @GetMapping
    public String listaTodos(Model model) {
        Policial policial = new Policial();
        model.addAttribute("policial", policial);
        List<Policial> policiais = service.listaTodos();
        model.addAttribute("policiais", policiais);
        return "policiais";
    }

    @PostMapping
    public String salva(Policial policial) {
        service.salva(policial);
        return "redirect:/policiais";
    }

    @GetMapping("/{id}/remove")
    public String remove(@PathVariable("id") Long id) {
        service.removePorId(id);
        return "redirect:/popliciais";
    }

    @GetMapping("/{id}/edita")
    public String edita(@PathVariable("id") Long id, Model model) {
        Policial policial = service.listaPorId(id);
        model.addAttribute("policial", policial);
        List<Policial> policiais = service.listaTodos();
        model.addAttribute("policiais", policiais);
        return "policiais";
    }

}
