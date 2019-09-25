package br.senac.rn.sisdaf.repository;

import br.senac.rn.sisdaf.model.Policial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicialRepository extends JpaRepository<Policial, Long> {

    List<Policial> findByNome(String nome);

    @Query("FROM Policial p WHERE p.nome LIKE %:nome%")
    List<Policial> findByNomePart(@Param("nome") String nome);

}
