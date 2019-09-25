package br.senac.rn.sisdaf.service;

import br.senac.rn.sisdaf.model.Opm;
import br.senac.rn.sisdaf.repository.OpmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpmService {

    @Autowired
    private OpmRepository repository;

    public List<Opm> listaTodos() {
        return repository.findAll();
    }

    public Opm salva(Opm opm) {
        return repository.save(opm);
    }

    public void removePorId(Long id) {
        repository.deleteById(id);
    }

    public Opm listaPorId(Long id) {
        return repository.findById(id).get();
    }

}
