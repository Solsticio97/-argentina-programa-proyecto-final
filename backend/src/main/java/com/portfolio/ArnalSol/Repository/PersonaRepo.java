package com.portfolio.ArnalSol.Repository;


import com.portfolio.ArnalSol.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PersonaRepo extends JpaRepository<Persona, Long>{
    
}
