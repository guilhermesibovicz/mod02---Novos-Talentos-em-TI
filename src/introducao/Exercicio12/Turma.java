package introducao.Exercicio12;

import java.util.ArrayList;

public class Turma {
    private String serie;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    private ArrayList<Crianca> listaCriancas = new ArrayList<>();

    public ArrayList<Crianca> getListaCriancas() {
        return listaCriancas;
    }

    public void setListaCriancas(ArrayList<Crianca> listaCriancas) {
        this.listaCriancas = listaCriancas;
    }
    
    public int contaMeninos(){
        int contaMeninos = 0;
        for(int i=0; i < getListaCriancas().size(); i++){
            if(getListaCriancas().get(i).getSexo().equals("Masculino")){
                contaMeninos += 1;
            }
            //if(getListaCriancas().get(i).getSexo().toLowerCase("Masculino"))
            //if(getListaCriancas().get(i).getSexo().toUpperCase("Masculino"))
            //if(getListaCriancas().get(i).getSexo().equalsIgnoreCase("Masculino"))
        }
        return contaMeninos;
    }
    
    public int contaMeninas(){
        int contaMeninas = 0;
        for(int i=0; i < getListaCriancas().size(); i++){
            if(getListaCriancas().get(i).getSexo().equals("Feminino")){
                contaMeninas += 1;
            }
        }
        return contaMeninas;
    }

    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.setSerie("5 série");

        Crianca crianca1 = new Crianca();
        crianca1.setNome("Zezinho");
        crianca1.setSexo("Masculino");
        turma1.getListaCriancas().add(crianca1);

        Crianca crianca2 = new Crianca();
        crianca2.setNome("Mariazinha");
        crianca2.setSexo("Feminino");
        turma1.getListaCriancas().add(crianca2);

        Crianca crianca3 = new Crianca();
        crianca3.setNome("Aninha");
        crianca3.setSexo("Feminino");
        turma1.getListaCriancas().add(crianca3);

        Crianca crianca4 = new Crianca();
        crianca4.setNome("Julinha");
        crianca4.setSexo("Feminino");
        turma1.getListaCriancas().add(crianca4);

        int totalMeninos = turma1.contaMeninos(); 
        System.out.println("Total de meninos : " + totalMeninos);

        int totalMeninas = turma1.contaMeninas();
        System.out.println("Total de meninas: " + totalMeninas);
    }
}
