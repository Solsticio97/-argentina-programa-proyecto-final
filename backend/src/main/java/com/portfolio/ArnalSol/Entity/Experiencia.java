package com.portfolio.ArnalSol.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Experiencia implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    
    private long idExp;
    private String lugarExp;
    private String inicioExp;
    private String finExp;
    private String nombreCargoExp;

    public Experiencia() {
    }

    public Experiencia(long idExp, String lugarExp, String inicioExp, String finExp, String nombreCargoExp) {
        this.idExp = idExp;
        this.lugarExp = lugarExp;
        this.inicioExp = inicioExp;
        this.finExp = finExp;
        this.nombreCargoExp = nombreCargoExp;
    }

    

    
    
    
}
