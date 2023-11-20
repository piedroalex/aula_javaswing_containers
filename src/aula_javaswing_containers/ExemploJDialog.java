package aula_javaswing_containers;

import javax.swing.JButton;
import javax.swing.JDialog;

/**
 * @author Pedro Alex
 */
public class ExemploJDialog {
	public static void main(String[] args) {
		//Criando o botão
		JButton showDialogButton = new JButton("Botão");

		//Criando o dialog e adicionando um botão
        JDialog dialog = new JDialog();
        dialog.setTitle("Título do Diálogo");
        dialog.add(showDialogButton);
        dialog.setSize(200, 100);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
}
