package introducao.Exercicio17;

import java.util.ArrayList;

public class Cardapio {
    private ArrayList<ItemCardapio> listaItensCardapio = new ArrayList<>();
    
    public ArrayList<ItemCardapio> getListaItensCardapio() {
        return listaItensCardapio;
    }

    public void setListaItensCardapio(ArrayList<ItemCardapio> listaItensCardapio) {
        this.listaItensCardapio = listaItensCardapio;
    }
    
    public String gerarCadapio(){
        StringBuilder disponivel = new StringBuilder();
        disponivel.append("-Cardápio-");
        
        var umCardapio = listaItensCardapio;
        for (int i=0; i < umCardapio.size(); i++) {
            if(umCardapio.get(i).isDisponivel() == true){

                disponivel.append("\nNome do Prato: " + umCardapio.get(i).getPrato().getNome());
                disponivel.append("\nValor: " + umCardapio.get(i).getPrato().getPreco());
            }           
        }
        return disponivel.toString();
    }

    public static void main(String[] args) {
        Cardapio card = new Cardapio();

        Prato prato1 = new Prato();
        prato1.setNome("Bifão");
        prato1.setPreco(10f);

        Prato prato2 = new Prato();
        prato2.setNome("Feijoada");
        prato2.setPreco(30f);

        Prato prato3 = new Prato();
        prato3.setNome("Dobradinha");
        prato3.setPreco(50f);

        Prato prato4 = new Prato();
        prato4.setNome("Hamburguer");
        prato4.setPreco(20f);

        ItemCardapio item1 = new ItemCardapio();
        card.getListaItensCardapio().add(item1);
        item1.setPrato(prato1);
        item1.setDisponivel(true);

        ItemCardapio item2 = new ItemCardapio();
        card.getListaItensCardapio().add(item2);
        item2.setPrato(prato2);
        item2.setDisponivel(true);

        ItemCardapio item3 = new ItemCardapio();
        card.getListaItensCardapio().add(item3);
        item3.setPrato(prato3);
        item3.setDisponivel(false);

        ItemCardapio item4 = new ItemCardapio();
        card.getListaItensCardapio().add(item4);
        item4.setPrato(prato4);
        item4.setDisponivel(true);

        var cardapio = card.gerarCadapio();
        System.out.println(cardapio);
    }
}
