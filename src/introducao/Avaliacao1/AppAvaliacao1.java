package introducao.Avaliacao1;

public class AppAvaliacao1 {
    public static void main(String[] args) {
        Obra obra1 = new Obra();

        FaseDaObra fase1 = new FaseDaObra();
        fase1.setNome("Fundação");
        obra1.getListaFases().add(fase1);

        FaseDaObra fase2 = new FaseDaObra();
        fase2.setNome("Primeiro andar");
        obra1.getListaFases().add(fase2);

        ItemDeConstrucao item1 = new ItemDeConstrucao();
        item1.setQuantidade(500);
        fase2.getListaItens().add(item1);

        ItemDeConstrucao item2 = new ItemDeConstrucao();
        item2.setQuantidade(800);
        fase2.getListaItens().add(item2);

        ItemDeConstrucao item3 = new ItemDeConstrucao();
        item3.setQuantidade(900);
        fase1.getListaItens().add(item3);

        ItemDeConstrucao item4 = new ItemDeConstrucao();
        item4.setQuantidade(1000);
        fase1.getListaItens().add(item4);

        MaterialDeConstrucao mat1 = new MaterialDeConstrucao();
        mat1.setNome("Viga de madeira");
        mat1.setPreco(20f);
        item1.setProduto(mat1);
        
        MaterialDeConstrucao mat2 = new MaterialDeConstrucao();
        mat2.setNome("Saco de cimento");
        mat2.setPreco(80f);
        item2.setProduto(mat2);
        item3.setProduto(mat2);

        MaterialDeConstrucao mat3 = new MaterialDeConstrucao();
        mat3.setNome("Vergalhão de aço");
        mat3.setPreco(50f);
        item4.setProduto(mat3);

        Engenheiro eng1 = new Engenheiro();
        eng1.setNome("Rick Sanchez");
        eng1.setNumero(1234);
        eng1.setSalario(10000f);
        eng1.setFormacao("Engenheiro Civil");
        fase2.setEncarregado(eng1);

        Engenheiro eng2 = new Engenheiro();
        eng2.setNome("Emmett Brown");
        eng2.setNumero(4321);
        eng2.setSalario(15000f);
        eng2.setFormacao("Engenheiro Civil");
        fase1.setEncarregado(eng2);

        Construtor cons1 = new Construtor();
        cons1.setNome("Huguinho");
        cons1.setNumero(1111);
        cons1.setSalario(3000f);
        cons1.setTerceirizado(false);
        fase2.getListaConstrutores().add(cons1);

        Construtor cons2 = new Construtor();
        cons2.setNome("Luizinho");
        cons2.setNumero(2222);
        cons2.setSalario(2500f);
        cons2.setTerceirizado(true);
        fase2.getListaConstrutores().add(cons2);

        Construtor cons3 = new Construtor();
        cons3.setNome("Zezinho");
        cons3.setNumero(3333);
        cons3.setSalario(3000f);
        cons3.setTerceirizado(false);
        fase1.getListaConstrutores().add(cons3);

        var dadosObra = obra1.dadosDaObra();
        System.out.println(dadosObra);

        var valorTotalDaObra = obra1.calcularValorTotalDaObra();
        System.out.println("\nO valor total das obras são de: R$ " + valorTotalDaObra);

    }
}
