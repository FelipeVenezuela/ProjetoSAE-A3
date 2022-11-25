
package model.dto;

/**
 *
 * @author Felipe V
 */
public class TurmaDTO {
    private String nomeTurma_cadastro, periodo_cadastro, id_turma;

    public String getNomeTurma_cadastro() {
        return nomeTurma_cadastro;
    }

    public void setNomeTurma_cadastro(String nomeTurma_cadastro) {
        this.nomeTurma_cadastro = nomeTurma_cadastro;
    }

    public String getPeriodo_cadastro() {
        return periodo_cadastro;
    }

    public void setPeriodo_cadastro(String periodo_cadastro) {
        this.periodo_cadastro = periodo_cadastro;
    }

    /**
     * @return the id_turma
     */
    public String getId_turma() {
        return id_turma;
    }

    /**
     * @param id_turma the id_turma to set
     */
    public void setId_turma(String id_turma) {
        this.id_turma = id_turma;
    }
    
    
}
