/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vanes
 */
public class Turma {
    
    private Integer id_turma;
	private String nome_turma;
	private String periodo;
        private Professor id_professor; //chave estrangeira
	//private ArrayList<Professor> prof = new ArrayList<Professor>();

    public Integer getId_turma() {
        return id_turma;
    }

    public void setId_turma(Integer id_turma) {
        this.id_turma = id_turma;
    }

    public String getNome_turma() {
        return nome_turma;
    }

    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Professor getId_professor() {
        return id_professor;
    }

    public void setId_professor(Professor id_professor) {
        this.id_professor = id_professor;
    }

   
    
    public void cadastrarTurma(Turma turma){}        
        
    
}
