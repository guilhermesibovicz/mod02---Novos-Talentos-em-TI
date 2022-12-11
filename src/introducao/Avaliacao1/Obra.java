package introducao.Avaliacao1;

import java.util.ArrayList;

public class Obra {
    public String dadosDaObra() {
        StringBuilder dados = new StringBuilder();

        for (int i = 0; i < listaFases.size(); i++) {
            var umaFase = listaFases.get(i);
            dados.append("\n\nObra do(a) ");
            dados.append(umaFase.getNome());

            var encarregados = umaFase.getEncarregado();
                dados.append("\n\nDados do encarregado: " + encarregados.getNome());
                dados.append("\nNúmero: " + encarregados.getNumero());
                dados.append("\nSalário: " + encarregados.getSalario());
                dados.append("\nFormação: " + encarregados.getFormacao());

            for(int x = 0; x < umaFase.getListaItens().size(); x++){
                var umItem = umaFase.getListaItens().get(x);
                var umProduto = umItem.getProduto();
                dados.append("\n\nMaterial: " + umProduto.getNome());
                dados.append(" - Preço: ");
                dados.append(umProduto.getPreco());
                dados.append(" - Quantidade: ");
                dados.append(umItem.getQuantidade());
            }

            for(int j = 0; j < umaFase.getListaConstrutores().size(); j++){
                var construtores = umaFase.getListaConstrutores().get(j);
                dados.append("\n\nDados do construtor: " + construtores.getNome());
                dados.append("\nNúmero: " + construtores.getNumero());
                dados.append("\nSalário: " + construtores.getSalario());
                dados.append("\nTerceirizado: " + construtores.isTerceirizado());
            }
        }
        return dados.toString();
    }

    public float calcularValorTotalDaObra() {
        float acumulador = 0;
        for(int i = 0; i < listaFases.size(); i++){
            var umaFase = listaFases.get(i);
            acumulador += umaFase.calcularValorDaFaseDaObra();
        }
        return acumulador;
    }

    private ArrayList<FaseDaObra> listaFases = new ArrayList<>();

    public ArrayList<FaseDaObra> getListaFases() {
        return listaFases;
    }

    public void setListaFases(ArrayList<FaseDaObra> listaFases) {
        this.listaFases = listaFases;
    }

}
