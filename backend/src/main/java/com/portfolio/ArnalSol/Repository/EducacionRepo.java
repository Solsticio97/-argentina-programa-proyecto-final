
package com.portfolio.ArnalSol.Repository;

import com.portfolio.ArnalSol.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepo extends JpaRepository<Educacion, Long>{

 
    
}
