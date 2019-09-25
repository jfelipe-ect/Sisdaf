package br.senac.rn.sisdaf.repository;
import br.senac.rn.sisdaf.model.Arma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArmaRepository extends JpaRepository<Arma, Long> {

    List<Arma> findBySerial(String serial);

    @Query("FROM Arma a WHERE a.serial LIKE %:serial%")
    List<Arma> findBySerialPart(@Param("serial") String serial);



}
