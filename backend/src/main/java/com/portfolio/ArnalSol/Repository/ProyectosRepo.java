
package com.portfolio.ArnalSol.Repository;

import com.portfolio.ArnalSol.Entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProyectosRepo extends JpaRepository<Proyectos, Long>{
    
}
