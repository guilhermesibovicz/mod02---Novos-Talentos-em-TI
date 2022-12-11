package introducao.Exercicio5;

import java.util.ArrayList;

public class Agenda {
    private long id;
    private Medico medico;
    private ArrayList<Agendamento> listaAgendamentos = new ArrayList<>();

    public long getId() {
        return id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public ArrayList<Agendamento> getListaAgendamentos() {
        return listaAgendamentos;
    }

    public void setListaAgendamentos(ArrayList<Agendamento> listaAgendamentos) {
        this.listaAgendamentos = listaAgendamentos;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void imprimirAgenda(){
        System.out.println("Agenda número " + this.getId());
        System.out.println("Médico: " + this.getMedico());
        System.out.println("Id médico: " + this.getMedico().getId());
        System.out.println("CRM médico: " + this.getMedico().getCRM());
        for(var umAgendamento : this.getListaAgendamentos()) {
            System.out.println("+Agendamento ID: " + umAgendamento.getId());
            System.out.println("+Agendamento Horário: " + umAgendamento.getDataHora());
            System.out.println("++Paciente ID: " + umAgendamento.getPaciente().getId());
            System.out.println("++Paciente Nome: " + umAgendamento.getPaciente().getNome());
            System.out.println("++Paciente Tel: " + umAgendamento.getPaciente().getTelefone());

        }
    }
}
