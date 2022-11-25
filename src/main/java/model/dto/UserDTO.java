

package model.dto;

/**
 *
 * @author Felipe V
 */
public class UserDTO {
    private String nome_cadastro, cpf_cadastro, login_cadastro, senha_cadastro;
    private String login_user, senha_user;

 
    public String getNome_cadastro() {
        return nome_cadastro;
    }

    public void setNome_cadastro(String nome_cadastro) {
        this.nome_cadastro = nome_cadastro;
    }

    public String getCpf_cadastro() {
        return cpf_cadastro;
    }

    public void setCpf_cadastro(String cpf_cadastro) {
        this.cpf_cadastro = cpf_cadastro;
    }

    public String getLogin_cadastro() {
        return login_cadastro;
    }

    public void setLogin_cadastro(String login_cadastro) {
        this.login_cadastro = login_cadastro;
    }

    public String getSenha_cadastro() {
        return senha_cadastro;
    }

    public void setSenha_cadastro(String senha_cadastro) {
        this.senha_cadastro = senha_cadastro;
    }

    public String getLogin_user() {
        return login_user;
    }

    public void setLogin_user(String login_user) {
        this.login_user = login_user;
    }

    public String getSenha_user() {
        return senha_user;
    }

    public void setSenha_user(String senha_user) {
        this.senha_user = senha_user;
    }
      
}
