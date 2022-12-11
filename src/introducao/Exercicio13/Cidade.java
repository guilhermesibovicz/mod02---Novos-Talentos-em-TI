package introducao.Exercicio13;

import java.util.ArrayList;

public class Cidade {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private ArrayList<Municipe> listaMunicipes = new ArrayList<>();

    public ArrayList<Municipe> getListaMunicipes() {
        return listaMunicipes;
    }

    public void setListaMunicipes(ArrayList<Municipe> listaMunicipes) {
        this.listaMunicipes = listaMunicipes;
    }
    
    public int contaApartamento(){
        
        int apartamento = 0;
        for(int i=0; i < getListaMunicipes().size(); i++){
            if(getListaMunicipes().get(i).getTipo().getNome().equals("Apartamento")){
                apartamento += 1;
            }
        }
        return apartamento;
    }

    public int contaCasa(){
        int casa = 0;
        for(int i=0; i < listaMunicipes.size(); i++){
            if(listaMunicipes.get(i).getTipo().getNome().equals("Casa")){
                casa += 1;
            }
        }
        return casa;
    }
    

    public static void main(String[] args) {
        Cidade cid1 = new Cidade();
        cid1.setNome("Joinville");  

        TipoResidencia tipo1 = new TipoResidencia();   
        tipo1.setNome("Apartamento"); 
        TipoResidencia tipo2 = new TipoResidencia();
        tipo2.setNome("Casa");     

        Municipe mun1 = new Municipe();
        mun1.setNome("Zezinho");
        cid1.getListaMunicipes().add(mun1);
        mun1.setTipo(tipo1);
        
        Municipe mun2 = new Municipe();
        mun2.setNome("Mariazinha");
        cid1.getListaMunicipes().add(mun2);
        mun2.setTipo(tipo1);

        Municipe mun3 = new Municipe();
        mun3.setNome("huguinho");
        cid1.getListaMunicipes().add(mun3);
        mun3.setTipo(tipo1);

        Municipe mun4 = new Municipe();
        mun4.setNome("Guizinho");
        cid1.getListaMunicipes().add(mun4);
        mun4.setTipo(tipo2);

        Municipe mun5 = new Municipe();
        mun5.setNome("Luizinho");
        cid1.getListaMunicipes().add(mun5);
        mun5.setTipo(tipo2);

        
        var totalApartamentos = cid1.contaApartamento();
        System.out.println("Pessoas que moram em apartamento: " + totalApartamentos);

        var totalCasas = cid1.contaCasa();
        System.out.println("Pessoas que moram em casa: " + totalCasas);

    }


}
