package testejoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author taris
 */
public class TesteJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Welcome\nto\nJava");

        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");

        String mensagem = String.format("Olá %s ! Bem vindo a Programação em Java", nome);

        JOptionPane.showMessageDialog(null, mensagem);

    }

}
