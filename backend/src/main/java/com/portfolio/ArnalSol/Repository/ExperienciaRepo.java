package com.portfolio.ArnalSol.Repository;

import com.portfolio.ArnalSol.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia, Long>{
    
}
