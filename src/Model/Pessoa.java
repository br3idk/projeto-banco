package Model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFormattedTextField;

public class Pessoa {
    
    private String nome;
    private String CPF;
    private Date aniversario;
    private int idade;
    
    public Pessoa(String nome, String CPF, String aniversario) throws ParseException {
        this.nome = nome;
        this.CPF = CPF;
        TransformaData(aniversario);
        CalcularIdade();
        
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
    
    public int getIdade() {
        return idade;
    }
    
    
    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    JFormattedTextField txtData = new JFormattedTextField(format);
    
    private void TransformaData(String aniversario) throws ParseException {
        
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        this.aniversario = formatoData.parse(aniversario);
        
    }
    
    private void CalcularIdade() {
        
        Date hoje = new Date(); //Data atual
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(hoje);
        
        //Dados da data atual
        int diaHoje = calendario.get(Calendar.DAY_OF_MONTH);
        int mesHoje = calendario.get(Calendar.MONTH) + 1; //Porque ele conta janeiro como "0"
        int anoHoje = calendario.get(Calendar.YEAR);
        
        //Dados do aniversário
        int diaAniversario = calendario.get(Calendar.DAY_OF_MONTH);
        int mesAniversario = calendario.get(Calendar.MONTH) + 1;
        int anoAniversario = calendario.get(Calendar.YEAR);
        
        this.idade = anoHoje - anoAniversario;
        
        if (mesHoje < mesAniversario) {
            this.idade--;
            
        } else if (mesHoje == mesAniversario && diaHoje < diaAniversario) {
            this.idade--;
            
        } if (idade < 0) {
            this.idade = 0;
        }    
    }
}
    

