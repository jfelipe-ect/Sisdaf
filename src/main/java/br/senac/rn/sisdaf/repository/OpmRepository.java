package br.senac.rn.sisdaf.repository;

import br.senac.rn.sisdaf.model.Opm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OpmRepository extends JpaRepository<Opm, Long> {

    List<Opm> findByFone(String fone);

    @Query("FROM Opm o WHERE o.nome LIKE %:nome%")
    List<Opm> findByNomePart(@Param("nome") String nome);

}
