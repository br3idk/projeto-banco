package Model;

import java.util.Date;

public class Pessoa {
    
    private String nome;
    private String CPF;
    private Date aniversario;
    
    public Pessoa(String nome, String CPF, Date aniversario) {
        this.nome = nome;
        this.CPF = CPF;
        this.aniversario = aniversario;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCPF() {
        return CPF;
    }
    
    public void setCPF() {
        this.CPF = CPF;
    }
    
    public Date getAniversario() {
        return aniversario;
}
    public void setAniversario() {
        this.aniversario = aniversario;
    }

}
    

