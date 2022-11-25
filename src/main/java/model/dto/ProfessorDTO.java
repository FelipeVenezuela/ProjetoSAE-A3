
package model.dto;

/**
 *
 * @author Felipe V
 */
public class ProfessorDTO {
    private String nome_cadastro, disciplina_cadastro, id;

    public String getNome_cadastro() {
        return nome_cadastro;
    }

    public void setNome_cadastro(String nome_cadastro) {
        this.nome_cadastro = nome_cadastro;
    }

    public String getDisciplina_cadastro() {
        return disciplina_cadastro;
    }

    public void setDisciplina_cadastro(String disciplina_cadastro) {
        this.disciplina_cadastro = disciplina_cadastro;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
}
