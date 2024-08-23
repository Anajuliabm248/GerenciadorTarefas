package br.ulbra.miniprojeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciadorTarefas {

    public ArrayList tarefa;

    public GerenciadorTarefas() {
        tarefa = new ArrayList();
    }

    public void addNovo(String nota) {
        tarefa.add(nota);

        if (nota.equals("") || nota.equals(null)) {
            JOptionPane.showMessageDialog(null, "Por favor, informe a descrição da tarefa.");
        } else {
        }
    }

    public String vizualizar() {
        String notas = "";

        if (tarefa.isEmpty()) {
            return "Não foram lançadas tarefas.";
        } else {
            for (int i = 0; i < tarefa.size(); i++) {
                notas += (i + 1) + " - " + tarefa.get(i) + "\n";
            }
        }
        return notas;
    }

    public void excluir(int i) {
        if (tarefa.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia.");
        } else if (i >= tarefa.size() || i < 0) {
            JOptionPane.showMessageDialog(null, "tarefa não existe.");
        } else {
            tarefa.remove(i);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        }
    }

    public void alterar(int i, String novoElemento) {
        if (tarefa.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia.");
        } else if (i >= tarefa.size() || i < 0) {
            JOptionPane.showMessageDialog(null, "Tarefa não existe.");
        } else {
            tarefa.set(i, novoElemento);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        }
    }
}
