package aula_javaswing_containers;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Pedro Alex
 */
public class ExemploJScrollPane {
	public static void main(String[] args) {
		//Criando um textarea
		JTextArea textArea = new JTextArea(20, 40);
		
		//Criando um scrollpane e adicionado o textarea
		JScrollPane scrollPane = new JScrollPane(textArea);

		//Criando um frame e adicionando um scrollpane
		JFrame frame = new JFrame("Exemplo JScrollPane");
		frame.getContentPane().add(scrollPane);
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
