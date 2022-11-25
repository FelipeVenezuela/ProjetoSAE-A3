
package model.dto;

/**
 *
 * @author Felipe V
 */
public class MateriaDTO {
    
    private String nome_materia, id_materia;

    public String getNome_materia() {
        return nome_materia;
    }

    public void setNome_materia(String nome_materia) {
        this.nome_materia = nome_materia;
    }

    /**
     * @return the id_materia
     */
    public String getId_materia() {
        return id_materia;
    }

    /**
     * @param id_materia the id_materia to set
     */
    public void setId_materia(String id_materia) {
        this.id_materia = id_materia;
    }
     
}
