
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
public class Educacion implements Serializable {
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private long idEdu;
    private String institucionEdu;
    private String inicioEdu;
    private String finEdu;
    private String tituloEdu;

    
    
    
   
    public Educacion() {
    }

    public Educacion(long idEdu, String institucionEdu, String inicioEdu, String finEdu, String tituloEdu) {
        this.idEdu = idEdu;
        this.institucionEdu = institucionEdu;
        this.inicioEdu = inicioEdu;
        this.finEdu = finEdu;
        this.tituloEdu = tituloEdu;
    }
    
    
}
