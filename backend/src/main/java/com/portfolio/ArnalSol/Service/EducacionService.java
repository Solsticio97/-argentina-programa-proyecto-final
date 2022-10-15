package com.portfolio.ArnalSol.Service;

import com.portfolio.ArnalSol.Entity.Educacion;
import com.portfolio.ArnalSol.Exception.UserNotFoundException;
import com.portfolio.ArnalSol.Repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class EducacionService {
    
 private final EducacionRepo educacionRepo;
    
    
    @Autowired
    public EducacionService (EducacionRepo educacionRepo){
    
        this.educacionRepo= educacionRepo;
    }
    
    
    
    public Educacion agregarEducacion(Educacion educacion){
    
        return educacionRepo.save(educacion);
    }
    
  
    
    public List<Educacion> verEducacion(){
    
        return educacionRepo.findAll();
    }
    
    
 
    
    public Educacion editarEducacion(Educacion educacion){
    
        return educacionRepo.save(educacion);
     
    }
     
    
   
    public Educacion buscarEducacion(Long id) {
       return educacionRepo.findById(id).orElseThrow(()->new UserNotFoundException("educacion no encontrada"));
    }

   
    public void eliminarEducacion(Long id) {
      educacionRepo.deleteById(id);
    }
}
