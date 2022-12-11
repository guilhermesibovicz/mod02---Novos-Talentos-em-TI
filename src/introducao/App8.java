package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.Exercicio5.Agenda;
import introducao.Exercicio5.Agendamento;
import introducao.Exercicio5.Medico;
import introducao.Exercicio5.Paciente;

public class App8 {
    public static void main(String[] args) {
        
        Paciente paciente1 = new Paciente();
        Medico medico1 = new Medico();

        paciente1.setId(10);
        paciente1.setNome("Laiz");
        paciente1.setTelefone("8888-8888"); 

        var paciente2 = new Paciente();
        paciente2.setId(10);
        paciente2.setNome("Guilherme");
        paciente2.setTelefone("9999-9999");

        var paciente3 = new Paciente();
        paciente3.setId(12);
        paciente3.setNome("Yasmim");
        paciente3.setTelefone("4444-4444");

        var paciente4 = new Paciente();
        paciente4.setId(13);
        paciente4.setNome("Mariana");
        paciente4.setTelefone("1111-1111");

        medico1.setId(1001);
        medico1.setNome("Alecsander");
        medico1.setCRM("5476");
        Agenda agenda1 = new Agenda();
        agenda1.setId(2000);
        agenda1.setMedico(medico1);

        var medico2 = new Medico();
        medico2.setId(1001);
        medico2.setNome("Cecília");
        medico2.setCRM("6735");
        Agenda agenda2 = new Agenda();
        agenda2.setId(2001);
        agenda2.setMedico(medico2);

        Calendar calendario = GregorianCalendar.getInstance();
        var agendamento1 = new Agendamento();
        agendamento1.setId(1);
        agendamento1.setMedico(medico1);
        agendamento1.setPaciente(paciente1);
        calendario.set(2022, 05, 19 , 13, 00);
        agendamento1.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento1);

        var agendamento2 = new Agendamento();
        agendamento2.setId(2);
        agendamento2.setMedico(medico2);
        agendamento2.setPaciente(paciente1);
        calendario.set(2022, 05, 19 , 14, 00);
        agendamento2.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento2);

        var agendamento3 = new Agendamento();
        agendamento3.setId(3);
        agendamento3.setMedico(medico1);
        agendamento3.setPaciente(paciente2);
        calendario.set(2022, 05, 19 , 15, 00);
        agendamento3.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento3);

        var agendamento4 = new Agendamento();
        agendamento4.setId(4);
        agendamento4.setMedico(medico2);
        agendamento4.setPaciente(paciente2);
        calendario.set(2022, 05, 19 , 16, 00);
        agendamento4.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento4);

        var agendamento5 = new Agendamento();
        agendamento5.setId(5);
        agendamento5.setMedico(medico1);
        agendamento5.setPaciente(paciente3);
        calendario.set(2022, 05, 19 , 17, 00);
        agendamento5.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento5);

        var agendamento6 = new Agendamento();
        agendamento6.setId(6);
        agendamento6.setMedico(medico2);
        agendamento6.setPaciente(paciente3);
        calendario.set(2022, 05, 19 , 18, 00);
        agendamento6.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento6);

        var agendamento7 = new Agendamento();
        agendamento7.setId(7);
        agendamento7.setMedico(medico1);
        agendamento7.setPaciente(paciente4);
        calendario.set(2022, 05, 19 , 19, 00);
        agendamento7.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento7);

        var agendamento8 = new Agendamento();
        agendamento8.setId(8);
        agendamento8.setMedico(medico2);
        agendamento8.setPaciente(paciente4);
        calendario.set(2022, 05, 19 , 20, 00);
        agendamento8.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento8);

        agenda1.imprimirAgenda();
        agenda2.imprimirAgenda();
    }
}