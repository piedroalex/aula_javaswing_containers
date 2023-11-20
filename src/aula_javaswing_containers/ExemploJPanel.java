package aula_javaswing_containers;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Pedro Alex
 */
public class ExemploJPanel {
	public static void main(String[] args) {
		//Criando os botões
		JButton button1 = new JButton("Botão 1");
        JButton button2 = new JButton("Botão 2");

        //Criando o painel e adicionando os botões
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);

        //Criando o frame e adicionando o painel
        JFrame frame = new JFrame("Exemplo JPanel");
        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
