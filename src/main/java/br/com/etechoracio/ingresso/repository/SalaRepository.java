package br.com.etechoracio.ingresso.repository;

import br.com.etechoracio.ingresso.entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface SalaRepository extends JpaRepository<Sala, Long> {

    @Query(value = "SELECT * FROM TBL_SALA where ID_SALA = :idSala and DT_EXCLUSAO is null", nativeQuery = true)
    Optional<Sala> buscarSalaPorId(@Param("idSala") Long idSala);

}
