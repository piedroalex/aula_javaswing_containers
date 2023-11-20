package aula_javaswing_containers;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Pedro Alex
 */
public class ExemploJFrame {
	public static void main(String[] args) {
		//Criando o botão
		JButton button = new JButton("Clique aqui");
		
		//Criando o frame e adicionando o botão
		JFrame frame = new JFrame("Exemplo JFrame");
		frame.getContentPane().add(button);

		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
