
package model.dto;

/**
 *
 * @author Felipe V
 */
public class AlunoDTO {
    private String nome_aluno, media_aluno, situacao_aluno, id_aluno;

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getMedia_aluno() {
        return media_aluno;
    }

    public void setMedia_aluno(String media_aluno) {
        this.media_aluno = media_aluno;
    }

    public String getSituacao_aluno() {
        return situacao_aluno;
    }

    public void setSituacao_aluno(String situacao_aluno) {
        this.situacao_aluno = situacao_aluno;
    }

    /**
     * @return the id_aluno
     */
    public String getId_aluno() {
        return id_aluno;
    }

    /**
     * @param id_aluno the id_aluno to set
     */
    public void setId_aluno(String id_aluno) {
        this.id_aluno = id_aluno;
    }
    
}
