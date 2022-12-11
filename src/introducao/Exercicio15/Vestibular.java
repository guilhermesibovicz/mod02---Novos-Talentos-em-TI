package introducao.Exercicio15;

import java.util.ArrayList;

public class Vestibular {

    private ArrayList<Vestibulando> listaVestibulandos = new ArrayList<>();
    
    public ArrayList<Vestibulando> getListaVestibulandos() {
        return listaVestibulandos;
    }

    public void setListaVestibulandos(ArrayList<Vestibulando> listaVestibulandos) {
        this.listaVestibulandos = listaVestibulandos;
    }

    public String gerarListaAprovados(){
        
        StringBuilder aprovado = new StringBuilder();
        var umVestibulando = listaVestibulandos;
        for(int i=0; i < getListaVestibulandos().size(); i++){
            if(umVestibulando.get(i).getNota() >=7){
                aprovado.append("\nAprovado: " + umVestibulando.get(i).getNome());
            }
            /*else{
                aprovado.append("\nReprovado: " + umVestibulando.get(i).getNome());
            }
            */
        }
        return aprovado.toString();
        
    }

    public static void main(String[] args) {
        Vestibular acafe = new Vestibular();

        Vestibulando vest1 = new Vestibulando();
        vest1.setNome("Zezinho");
        vest1.setNota(7);
        acafe.getListaVestibulandos().add(vest1);

        Vestibulando vest2 = new Vestibulando();
        vest2.setNome("Pedrinho");
        vest2.setNota(5);
        acafe.getListaVestibulandos().add(vest2);

        Vestibulando vest3 = new Vestibulando();
        vest3.setNome("Huguinho");
        vest3.setNota(10);
        acafe.getListaVestibulandos().add(vest3);

        Vestibulando vest4 = new Vestibulando();
        vest4.setNome("Luizinho");
        vest4.setNota(8);
        acafe.getListaVestibulandos().add(vest4);

        var resultado = acafe.gerarListaAprovados();
        System.out.print(resultado);
    }
}
