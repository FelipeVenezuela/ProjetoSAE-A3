/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Aluno;

/**
 *
 * @author vanes
 */
public class AlunoController {
    
    public boolean cadastrarAluno(String nome_aluno,double media,String situacao){
        if (nome_aluno != null && media >= 0 && situacao != null){
            Aluno aluno = new Aluno(nome_aluno, media, situacao);
            aluno.cadastrarAluno(aluno);
            return true;
            
        }
            return false;
        
    }
    
    //Dar continuidade na Controller, dupla Felipe e Matheus
}
