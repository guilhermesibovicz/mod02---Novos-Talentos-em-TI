package introducao.Exercicio1;

import java.util.Date;

public class Autor {
    private String nome;
    private Date dataNascimento;

@Deprecated
    public Autor(String nome, java.util.Date date) {
        this.nome = nome;
        this.dataNascimento = date;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
