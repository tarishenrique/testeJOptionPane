package testejoptionpane;

import javax.swing.JOptionPane;

/**
 * @author taris
 */
public class TesteJOptionPane {

    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Bem vindo\nao\nJava");

        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");

        String mensagem = String.format("Olá %s ! Bem vindo a Programação em Java", nome);

        JOptionPane.showMessageDialog(null, mensagem);
        JOptionPane.showMessageDialog(null, mensagem, "Aviso", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, mensagem, "Aviso", JOptionPane.ERROR_MESSAGE);

        // Obter entradas de dados através do JOptionPane
        String numero1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro: ");
        String numero2 = JOptionPane.showInputDialog("Digite o segundo número inteiro: ");

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

        int soma = num1 + num2;

        JOptionPane.showMessageDialog(null, "A soma é " + soma, "Soma de dois números inteiros",
                JOptionPane.PLAIN_MESSAGE);

        int resposta = JOptionPane.showConfirmDialog(null, "Você estuda no IFBA?");
        System.out.println(resposta);
        if (resposta == 0) {
            JOptionPane.showMessageDialog(null, "Obrigado por responder " + nome + ", Seja bem vindo ao IFBA.");
            int estudante = JOptionPane.showConfirmDialog(null, "Você está gostando do curso?",
                    "Pesquisa de Satisfação", JOptionPane.YES_NO_OPTION);

            if (estudante == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Ficamos felizes que você gostando do curso.");
            } else if (estudante == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Por favor preencha o formulário e nos dê sugestões de melhora.");
            }
        } else if (resposta == 1) {
            JOptionPane.showMessageDialog(null,
                    "Obrigado por responder " + nome + ", Você será bem vindo no IFBA o quanto antes.");

        } else {
            JOptionPane.showMessageDialog(null,
                    "Obrigado por responder " + nome + ", Escolha SIM ou NÃO na próxima oportunidade.");
        }

    }

}
