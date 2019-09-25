package br.senac.rn.sisdaf.service;

import br.senac.rn.sisdaf.model.Policial;
import br.senac.rn.sisdaf.repository.PolicialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicialService {

    @Autowired
    private PolicialRepository repository;

    public List<Policial> listaTodos() {
        return repository.findAll();
    }

    public Policial salva(Policial policial) {
        return repository.save(policial);
    }

    public void removePorId(Long id) {
        repository.deleteById(id);
    }

    public Policial listaPorId(Long id) {
        return repository.findById(id).get();
    }

}
