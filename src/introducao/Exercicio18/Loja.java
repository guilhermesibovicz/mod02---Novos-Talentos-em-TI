package introducao.Exercicio18;

import java.util.ArrayList;

public class Loja {

    private ArrayList<Setor> listaSetores = new ArrayList<>();
    
    public ArrayList<Setor> getListaSetores() {
        return listaSetores;
    }
    public void setListaSetores(ArrayList<Setor> listaSetores) {
        this.listaSetores = listaSetores;
    }

    public String gerarCatalogo(){
        var setor = listaSetores;
        
        StringBuilder loja = new StringBuilder();
        loja.append("Produtos da loja");

        //for(var umSetor : listaSetores){}
        for(int i = 0; i < setor.size(); i++){
            var umSetor = setor.get(i);
            loja.append("\n\nSetor de " + umSetor.getNome());
            for(int j=0; j < umSetor.getListaProdutos().size(); j++){
                var umProduto = umSetor.getListaProdutos();
                loja.append("\nProduto: " + umProduto.get(j).getNome());
                loja.append(" no preço de: " + umProduto.get(j).getPreco());
                
            }
        }
        return loja.toString();
    }
    public static void main(String[] args) {
        Loja loja1 = new Loja();        

        Setor setor1 = new Setor();
        setor1.setNome("Cama");
        loja1.getListaSetores().add(setor1);

        Setor setor2 = new Setor();
        setor2.setNome("Mesa");
        loja1.getListaSetores().add(setor2);

        Setor setor3 = new Setor();
        setor3.setNome("Banho");
        loja1.getListaSetores().add(setor3);

        Produto prod1 = new Produto();
        prod1.setNome("Travesseiro");
        prod1.setPreco(70f);
        setor1.getListaProdutos().add(prod1);
        
        Produto prod2 = new Produto();
        prod2.setNome("Cobertor");
        prod2.setPreco(250f);
        setor1.getListaProdutos().add(prod2);
        
        Produto prod3 = new Produto();
        prod3.setNome("Toalha");
        prod3.setPreco(100f);
        setor2.getListaProdutos().add(prod3);

        Produto prod4 = new Produto();
        prod4.setNome("Toalha de banho");
        prod4.setPreco(60f);
        setor3.getListaProdutos().add(prod4);

        Produto prod5 = new Produto();
        prod5.setNome("Toalha de rosto");
        prod5.setPreco(30f);
        setor3.getListaProdutos().add(prod5);

        Fornecedor forn1 = new Fornecedor();
        forn1.setNome("Karsten");
        prod1.setFornecedor(forn1);
        prod2.setFornecedor(forn1);
        prod3.setFornecedor(forn1);

        Fornecedor forn2 = new Fornecedor();
        forn2.setNome("Dohler");
        prod4.setFornecedor(forn2);
        prod5.setFornecedor(forn2);

        var catalogo = loja1.gerarCatalogo();
        System.out.println(catalogo);
        
    }
}
