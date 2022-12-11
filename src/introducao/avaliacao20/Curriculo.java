package introducao.avaliacao20;

import java.util.ArrayList;

public class Curriculo {
    private Pessoa pessoa;
    private ArrayList<Formacao> listaFormacoes = new ArrayList<>();
    private ArrayList<ExperienciaProfissional> listaExperienciasProfissionais = new ArrayList<>();

    public ArrayList<ExperienciaProfissional> getListaExperienciasProfissionais() {
        return listaExperienciasProfissionais;
    }
    public void setListaExperienciasProfissionais(ArrayList<ExperienciaProfissional> listaExperienciasProfissionais) {
        this.listaExperienciasProfissionais = listaExperienciasProfissionais;
    }

    public ArrayList<Formacao> getListaFormacoes() {
        return listaFormacoes;
    }
    public void setListaFormacoes(ArrayList<Formacao> listaFormacoes) {
        this.listaFormacoes = listaFormacoes;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String gerarCurriculo() {
        StringBuilder dados = new StringBuilder();
        
        dados.append("Nome: " + getPessoa().getNome() + "\n");
        dados.append("Data de nascimento: " + getPessoa().getDataNascimento() + "\n");
        
        for(int i = 0; i < listaFormacoes.size(); i++){
            var umaForm = listaFormacoes.get(i);
            dados.append("Formação: " + umaForm.getNome() + "\n");
            dados.append("Ano de conclusão: " + umaForm.getAnoConclusao() + "\n");
        }

        for (var umaExp : listaExperienciasProfissionais) {
            dados.append("Experiências: " + umaExp.getNome() + "\n");
            dados.append("Ano de conclusão: " + umaExp.getAnoConclusao() + "\n");
        }
        return dados.toString();
    }

    public int contarNumExperienciasProfissionais() {
        int contador = 0;
        for(int i = 0; i < listaExperienciasProfissionais.size(); i++){
            var contaExp = listaExperienciasProfissionais.size();
            contador = contaExp;
        }
        return contador;
    } 
}
