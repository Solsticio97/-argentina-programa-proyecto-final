
package com.portfolio.ArnalSol.Repository;

import com.portfolio.ArnalSol.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SkillsRepo extends JpaRepository<Skills, Long>{
    
}
