package br.senac.rn.sisdaf.service;


import br.senac.rn.sisdaf.model.Arma;
import br.senac.rn.sisdaf.repository.ArmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmaService {

    @Autowired
    private ArmaRepository repository;

    public List<Arma> listaTodos() {
        return repository.findAll();
    }

    public Arma salva(Arma arma) {
        return repository.save(arma);
    }

    public void removePorId(Long id) {
        repository.deleteById(id);
    }

    public Arma listaPorId(Long id) {
        return repository.findById(id).get();
    }

}
