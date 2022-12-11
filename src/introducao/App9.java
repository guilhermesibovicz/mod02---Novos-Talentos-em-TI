package introducao;

import introducao.Exercicio6.EquipeVendas;
import introducao.Exercicio6.Gerente;
import introducao.Exercicio6.Vendedor;

public class App9 {
    public static void main(String[] args) {
        var vendedor1 = new Vendedor();
        vendedor1.setId(1);
        vendedor1.setNome("Andrew");
        vendedor1.setPercComissao(2);
        vendedor1.setMetaVendas(1000);
        vendedor1.setTelefone("5555-5432");

        var vendedor2 = new Vendedor();
        vendedor2.setId(2);
        vendedor2.setNome("Eduardo");
        vendedor2.setPercComissao(2);
        vendedor2.setMetaVendas(1000);
        vendedor2.setTelefone("7855-5892");

        var vendedor3 = new Vendedor();
        vendedor3.setId(3);
        vendedor3.setNome("Miguel");
        vendedor3.setPercComissao(2);
        vendedor3.setMetaVendas(1000);
        vendedor3.setTelefone("1547-5875");

        var vendedor4 = new Vendedor();
        vendedor4.setId(4);
        vendedor4.setNome("Roberto");
        vendedor4.setPercComissao(2);
        vendedor4.setMetaVendas(1000);
        vendedor4.setTelefone("1234-6784");

        var vendedor5 = new Vendedor();
        vendedor5.setId(5);
        vendedor5.setNome("Mateus");
        vendedor5.setPercComissao(2);
        vendedor5.setMetaVendas(1000);
        vendedor5.setTelefone("5681-1542");

        var gerente1 = new Gerente();
        gerente1.setId(1000);
        gerente1.setNome("Kauã");
        gerente1.setSetor("Diretoria");
        gerente1.setTelefone("4758-1425");
        
        var gerente2 = new Gerente();
        gerente2.setId(1001);
        gerente2.setNome("Lucas");
        gerente1.setSetor("Diretoria");
        gerente1.setTelefone("6958-3625");

        EquipeVendas equipe1 = new EquipeVendas();
        equipe1.setGestor(gerente1);
        equipe1.getListaVendedores().add(vendedor1);
        vendedor1.setEquipe(equipe1);
        equipe1.getListaVendedores().add(vendedor2);
        vendedor2.setEquipe(equipe1);
        equipe1.getListaVendedores().add(vendedor3);
        vendedor3.setEquipe(equipe1);

        var retorno = equipe1.listarEquipe();
        System.out.println(retorno);

        EquipeVendas equipe2 = new EquipeVendas();
        equipe2.setGestor(gerente2);
        equipe2.getListaVendedores().add(vendedor4);
        vendedor4.setEquipe(equipe2);
        equipe2.getListaVendedores().add(vendedor5);
        vendedor5.setEquipe(equipe2);

        retorno = equipe2.listarEquipe();
        System.out.println(retorno);
    }
}
