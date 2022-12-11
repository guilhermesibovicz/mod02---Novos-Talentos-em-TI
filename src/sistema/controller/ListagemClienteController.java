package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

import sistema.entity.Cliente;
import sistema.service.ClienteService;
import sistema.view.FormularioCliente;
import sistema.view.ListagemCliente;

public class ListagemClienteController implements ActionListener{
    private ClienteService service = new ClienteService();
    private ListagemCliente view;

    public ListagemClienteController(ListagemCliente view){
        this.view = view;
    }

    public ArrayList<Cliente> getAllClientes(){
        return service.getAllClientes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent botaoClicado = (JComponent)e.getSource();
        switch (botaoClicado.getName()) {
            case "btnNovo":
                btnNovoClique();
            break;
            case "btnAlterar":
                btnAlterarClique();
            break;
            case "btnExcluir":
                btnExcluirClique();
            break;
        }
    }

    private void btnNovoClique(){
        //JOptionPane.showMessageDialog(null, "BOTAO NOVO"); 
        Cliente novoCliente = new Cliente();   
        FormularioCliente formulario = new FormularioCliente(novoCliente);
        service.save(novoCliente);
    }
    private void btnAlterarClique(){
        //JOptionPane.showMessageDialog(null, "BOTAO ALTERAR");   
        var clienteClicado = view.getCliente();
        if(clienteClicado != null) {
            FormularioCliente formulario = new FormularioCliente(clienteClicado);
            service.save(clienteClicado);     //PAREI AQUI OFHHHHHHHH
            view.atualizaTabela();
        }
    }
    private void btnExcluirClique(){
        JOptionPane.showMessageDialog(null, "BOTAO Excluir");
    }


}