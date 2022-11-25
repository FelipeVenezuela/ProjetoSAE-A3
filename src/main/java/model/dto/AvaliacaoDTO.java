/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dto;

/**
 *
 * @author Felipe V
 */
public class AvaliacaoDTO {
    
    private String especificacao, data, nota, situacao1, situacao2, id;

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getSituacao1() {
        return situacao1;
    }

    public void setSituacao1(String situacao1) {
        this.situacao1 = situacao1;
    }

    public String getSituacao2() {
        return situacao2;
    }

    public void setSituacao2(String situacao2) {
        this.situacao2 = situacao2;
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
