package aula_javaswing_containers;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author Pedro Alex
 */
public class ExemploJMenuBar {
	public static void main(String[] args) {
		// Criar itens de menu
		JMenuItem newItem = new JMenuItem("Novo");
		JMenuItem openItem = new JMenuItem("Abrir");

		// Cria um menu e adiciona itens de menu
		JMenu fileMenu = new JMenu("Arquivo");
		fileMenu.add(newItem);
		fileMenu.add(openItem);

		// Cria uma barra de menus e adiciona os menus
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(fileMenu);

		// Cria um frame e adiciona a barra de menus
		JFrame frame = new JFrame("Exemplo de JMenuBar");
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
	}
}
