
package model;

import java.util.ArrayList;

public class Aluno {
    
	private Integer id_aluno;
	private String nome_aluno;
        private double media;
	private String situacao;
        private Turma id_turma; //chave estrangeira
        
        
        
	/*private ArrayList<Turma> turmas = new ArrayList<Turma>();
        private ArrayList<Materia> materias = new ArrayList<Materia>();
	private ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();*/

    public Aluno(String nome_aluno, double media, String situacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Integer getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(Integer id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public Turma getId_turma() {
        return id_turma;
    }

    public void setId_turma(Turma id_turma) {
        this.id_turma = id_turma;
    }

   
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
        
    public void cadastrarAluno(Aluno aluno){}
    
    public Aluno(){}
}

    


