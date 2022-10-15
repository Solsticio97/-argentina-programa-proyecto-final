
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
public class Skills implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    
    private Long idSkil;
    private String nombreSkil;
    private String imgSkil;
    private int valorSkil;

    public Skills() {
    }

    public Skills(Long idSkil, String nombreSkil, String imgSkil, int valorSkil) {
        this.idSkil = idSkil;
        this.nombreSkil = nombreSkil;
        this.imgSkil = imgSkil;
        this.valorSkil = valorSkil;
    }
    
    
    
    
}
