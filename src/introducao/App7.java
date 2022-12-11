package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.Exercicio4.EmpresaCliente;
import introducao.Exercicio4.Funcionario;
import introducao.Exercicio4.PessoaFisica;
import introducao.Exercicio4.PessoaJuridica;
import introducao.Exercicio4.Pessoa;

public class App7 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        EmpresaCliente empresa1 = new EmpresaCliente();

        funcionario1.setCPF("555.555.555-55");
        funcionario1.setFuncao("Atendimento");
        funcionario1.setCracha(102030);
        funcionario1.setNome("Guilherme");
        funcionario1.setTelefone("5566-7788");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2000,05,10);
        funcionario1.setDataNascimento(calendario.getTime());

        empresa1.setNome("Gui do Cell");
        empresa1.setCNPJ("989.989.898.89");
        empresa1.setLocalizacao("Rua Guilherme Sibovicz - 17 ");
        empresa1.setTelefone("5656-5656");
        empresa1.setNumeroFuncionario(7);
        calendario.set(2022,05,10);
        empresa1.setDataCriacao(calendario.getTime());

        //POLMORFISMO - POLI = varias MORFISMOS = formas de existir 
        PessoaFisica pessoa1 = funcionario1;
        System.out.println(pessoa1.getDataNascimento());  
        System.out.println(pessoa1.getCPF()); 
        System.out.println(pessoa1.getNome()); 
        System.out.println(pessoa1.getTelefone());

        PessoaJuridica pessoa2 = empresa1;
        System.out.println(pessoa2.getDataCriacao());  
        System.out.println(pessoa2.getCNPJ()); 
        System.out.println(pessoa2.getNome()); 
        System.out.println(pessoa2.getTelefone());

        Pessoa pessoa3 = pessoa1;
        System.out.println(pessoa3.getNome());  
        System.out.println(pessoa3.getTelefone()); 

        Pessoa pessoa4 = pessoa2;
        System.out.println(pessoa4.getNome());  
        System.out.println(pessoa3.getTelefone());

        Funcionario funcionario2 = (Funcionario)pessoa3;
        System.out.println(funcionario2.getFuncao());
        System.out.println(funcionario2.getCracha());
        
        EmpresaCliente empresa2 = (EmpresaCliente)pessoa4;
        System.out.println(empresa2.getLocalizacao());
        System.out.println(empresa2.getNumeroFuncionario());

    }
}
