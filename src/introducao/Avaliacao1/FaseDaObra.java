package introducao.Avaliacao1;

import java.util.ArrayList;

public class FaseDaObra {
    private String nome;
    private Engenheiro encarregado;

    public Engenheiro getEncarregado() {
        return encarregado;
    }

    public void setEncarregado(Engenheiro encarregado) {
        this.encarregado = encarregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float calcularValorDaFaseDaObra(){
        float acumulador = 0;
        for(int j = 0; j < getListaItens().size(); j++){
            var umItem = getListaItens().get(j).getProduto().getPreco();
            var qtdItens =getListaItens().get(j).getQuantidade();
            acumulador +=   qtdItens * umItem;
        } 
       
       for(int x = 0; x < getListaConstrutores().size(); x++){
            var umSalarioConst = getListaConstrutores().get(x).getSalario();
            acumulador += umSalarioConst;
        } 

       acumulador += getEncarregado().getSalario();
        return acumulador;
    }

    private ArrayList<ItemDeConstrucao> listaItens = new ArrayList<>();

    public ArrayList<ItemDeConstrucao> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemDeConstrucao> listaItens) {
        this.listaItens = listaItens;
    }

    private ArrayList<Construtor> listaConstrutores = new ArrayList<>();

    public ArrayList<Construtor> getListaConstrutores() {
        return listaConstrutores;
    }

    public void setListaConstrutores(ArrayList<Construtor> listaConstrutores) {
        this.listaConstrutores = listaConstrutores;
    }


}
