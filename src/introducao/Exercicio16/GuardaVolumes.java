package introducao.Exercicio16;

import java.util.ArrayList;

public class GuardaVolumes {

    private ArrayList<Item> listaItens = new ArrayList<>();
    
    public ArrayList<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public String gerarListaItens(){

        StringBuilder guardaVolumes = new StringBuilder();
        for(int i=0; i < listaItens.size(); i++){
            guardaVolumes.append("\n " + listaItens.get(i).getNome());
            guardaVolumes.append(" - " );
            guardaVolumes.append(listaItens.get(i).getProprietario().getNome());
        }
        return guardaVolumes.toString();
    }

    public static void main(String[] args) {
        GuardaVolumes guarda = new GuardaVolumes();

        Proprietario prop1 = new Proprietario();
        prop1.setNome("Zezinho");
        Proprietario prop2 = new Proprietario();
        prop2.setNome("Mariazinha");

        Item item1 = new Item();
        item1.setNome("Chave de casa");
        guarda.getListaItens().add(item1);
        item1.setProprietario(prop1);

        Item item2 = new Item();
        item2.setNome("Celular");
        guarda.getListaItens().add(item2);
        item2.setProprietario(prop1);

        Item item3 = new Item();
        item3.setNome("Chave de casa");
        guarda.getListaItens().add(item3);
        item3.setProprietario(prop2);

        Item item4 = new Item();
        item4.setNome("Celular");
        guarda.getListaItens().add(item4);
        item4.setProprietario(prop2);

        Item item5 = new Item();
        item5.setNome("Carteira");
        guarda.getListaItens().add(item5);
        item5.setProprietario(prop2);

        Item item6 = new Item();
        item6.setNome("Escova de cabelos");
        guarda.getListaItens().add(item6);
        item6.setProprietario(prop2);

        var guardaTudo = guarda.gerarListaItens();
        System.out.println(guardaTudo);
    }
}
