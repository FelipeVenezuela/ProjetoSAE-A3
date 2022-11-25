/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author vanes
 */
public class Avaliacao {
    private Integer id_avaliacao;
	private String data_aplicacao;
	private double nota_avaliacao;
	private boolean aprovado;
        private String especificacao;
        private Professor id_professor; //chave estrangeira
        private Aluno id_aluno; //chave estrangeira
        private Materia id_materia; //chave estrangeira
        
        
	/*private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private ArrayList<Materia> materias = new ArrayList<Materia>();
	private ArrayList<Professor> prof = new ArrayList<Professor>();*/	

    public Integer getId_avaliacao() {
        return id_avaliacao;
    }

    public void setId_avaliacao(Integer id_avaliacao) {
        this.id_avaliacao = id_avaliacao;
    }

    public String getData_aplicacao() {
        return data_aplicacao;
    }

    public void setData_aplicacao(String data_aplicacao) {
        this.data_aplicacao = data_aplicacao;
    }

    public double getNota_avaliacao() {
        return nota_avaliacao;
    }

    public void setNota_avaliacao(double nota_avaliacao) {
        this.nota_avaliacao = nota_avaliacao;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public Professor getId_professor() {
        return id_professor;
    }

    public void setId_professor(Professor id_professor) {
        this.id_professor = id_professor;
    }

    public Aluno getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(Aluno id_aluno) {
        this.id_aluno = id_aluno;
    }

    public Materia getId_materia() {
        return id_materia;
    }

    public void setId_materia(Materia id_materia) {
        this.id_materia = id_materia;
    }

    

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }
    
    public void cadastrarAvaliacao(Avaliacao avaliacao){}
    
        
        
    
}
