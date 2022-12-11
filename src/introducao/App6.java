package introducao;
import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.Exercicio3.Comprador;
import introducao.Exercicio3.ItemPedido;
import introducao.Exercicio3.Pedido;
import introducao.Exercicio3.Produto;

public class App6 {
    public static void main(String[] args) {
        
        Comprador zezinho = new Comprador();
        zezinho.setId(300);
        zezinho.setNome("Zezinho da Silva");
        zezinho.setEndereco("Rua Lalala 100");

        Pedido pedido1 = new Pedido();
        pedido1.setId(1l);
        Calendar calendar  = GregorianCalendar.getInstance();
        calendar.set(2022,04,29);
        pedido1.setData(calendar.getTime());
        pedido1.setCliente(zezinho);

        var produto1 = new Produto();
        produto1.setId(1001);
        produto1.setNome("Playtation 5");
        produto1.setValor(8000f);

        var produto2 = new Produto();
        produto2.setId(1002);
        produto2.setNome("Xbox Series X");
        produto2.setValor(5000f);

        var item1 = new ItemPedido();
        item1.setId(1);
        item1.setQuantidade(1);
        item1.setValorVenda(7500f);
        item1.setProduto(produto1); //ligação entre tipo itemPedido e Produto
        pedido1.getListaItens().add(item1); //ligação entre tipo Pedido e Produto

        var item2 = new ItemPedido();
        item2.setId(2);
        item2.setQuantidade(1);
        item2.setValorVenda(4000f);
        item2.setProduto(produto2);
        pedido1.getListaItens().add(item2);

        var result = pedido1.calcValorTotal();
        System.out.println(String.format("O total do pedido é: %.2f", result));

        Comprador juninho = new Comprador();
        juninho.setId(400);
        juninho.setNome("Juninho Lobo");
        juninho.setEndereco("Rua Tururu 112");

        Pedido pedido2 = new Pedido();
        pedido1.setId(2l);
        Calendar calendario  = GregorianCalendar.getInstance();
        calendar.set(2022,04,30);
        pedido2.setData(calendario.getTime());
        pedido2.setCliente(juninho);

        var produto3 = new Produto();
        produto3.setId(1003);
        produto3.setNome("Playtation 4");
        produto3.setValor(4300f);

        var produto4 = new Produto();
        produto4.setId(1004);
        produto4.setNome("Xbox One");
        produto4.setValor(2600f);

        var produto5 = new Produto();
        produto5.setId(1005);
        produto5.setNome("nintendo switch");
        produto5.setValor(2500f);

        var item3 = new ItemPedido();
        item3.setId(1);
        item3.setQuantidade(3);
        item3.setValorVenda(4300f);
        item3.setProduto(produto3); 
        pedido2.getListaItens().add(item3); 

        var item4 = new ItemPedido();
        item4.setId(2);
        item4.setQuantidade(2);
        item4.setValorVenda(2600f);
        item4.setProduto(produto4);
        pedido2.getListaItens().add(item4);

        var item5 = new ItemPedido();
        item5.setId(2);
        item5.setQuantidade(1);
        item5.setValorVenda(2500f);
        item5.setProduto(produto5);
        pedido2.getListaItens().add(item5);

        var resultado = pedido2.calcValorTotal();
        System.out.println(String.format("O total do pedido é: %.2f", resultado));

    }
}
