package com.portfolio.ArnalSol.Service;

import com.portfolio.ArnalSol.Entity.Persona;
import com.portfolio.ArnalSol.Exception.UserNotFoundException;
import com.portfolio.ArnalSol.Repository.PersonaRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Transactional
@Service
public class PersonaService {
       private final PersonaRepo personaRepo;
   
    @Autowired
    public PersonaService (PersonaRepo personaRepo){
    
       this.personaRepo = personaRepo;
    }
   
    public Persona addPersona(Persona persona){
    
        return personaRepo.save(persona);
    }
    
    public List<Persona> traerPersona(){
    
        return personaRepo.findAll();
    }
    
    
    public Persona editarPersona(Persona persona){
    
        return personaRepo.save(persona);
     
    }
    
    public void eliminarPersona(long id){
    
        personaRepo.deleteById(id);
    } 
    
     public Persona buscarPersonaPorId (long id){
    
        return personaRepo.findById(id).orElseThrow(() ->new UserNotFoundException("Usuario no encontrado"));
    }
    
     
    public Persona crearPersona(Persona persona) {
        return personaRepo.save(persona);
    }
 
}
