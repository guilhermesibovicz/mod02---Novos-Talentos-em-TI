package introducao.Exercicio11;

import java.util.ArrayList;

public class Aluno {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private ArrayList<Nota> listaNotas = new ArrayList<>();

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public float calcMediaNotas(){
        float total = 0;
        float media = 0;
        //size retorna o número de itens no ArrayList
        for (int i=0; i < getListaNotas().size(); i++){
            total += getListaNotas().get(i).getValor();
        }
        //SAIR DO FOR PARA CALCULAR A MÉDIA
        media = total / getListaNotas().size();
        return media;
    }

    public static void main(String[] args) {
        Aluno zezinho = new Aluno();
        zezinho.setNome("Zezinho da Silva");
        
        Nota nota1 = new Nota();
        nota1.setValor(5f);
        zezinho.getListaNotas().add(nota1);


        Nota nota2 = new Nota();
        nota2.setValor(7);
        zezinho.getListaNotas().add(nota2);

        Nota nota3 = new Nota();
        nota3.setValor(6);
        zezinho.getListaNotas().add(nota3);
        
        float guardamedia = zezinho.calcMediaNotas();
        System.out.println("Média: " + guardamedia);
    }

}
