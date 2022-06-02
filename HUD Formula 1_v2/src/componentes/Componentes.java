package componentes;

import javax.swing.*;

public class Componentes {
	
	public static JLabel criarJLabel(JLabel label, int x, int y, int largura, int altura) {
		label.setBounds(x, y, largura, altura);
		label.setVisible(true);
		
		return label;
	}
	
	public JButton criarJButton(JButton btn, int x, int y, int largura, int altura) {
		btn.setBounds(x, y, largura, altura);
		btn.setVisible(true);
		
		return btn;
	}
	
	public static JTextField criarJTextField(JTextField txtF, int x, int y, int largura, int altura) {
		txtF.setBounds(x, y, largura, altura);
		txtF.setVisible(true);
		
		return txtF;
	}
	
	public JPanel criarJPanel(JPanel panel, int x, int y, int largura, int altura) {
		panel.setBounds(x, y, largura, altura);
		panel.setVisible(true);
		panel.setLayout(null);
		
		return panel;
	}
	
	@SuppressWarnings("rawtypes")
	public JList criarJList(JList list, int x, int y, int largura, int altura) {
		list.setBounds(x, y, largura, altura);
		list.setVisible(true);
		
		return list;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox criarJCBox(JComboBox box, int x, int y, int largura, int altura) {
		box.setBounds(x, y, largura, altura);
		box.setVisible(true);
		
		return box;
	}
	
	public JTextArea criarJTArea(JTextArea txt, int x, int y, int largura, int altur) {
		txt.setBounds(x, y, largura, altur);
		txt.setVisible(true);
		
		return txt;
	}
	
}
