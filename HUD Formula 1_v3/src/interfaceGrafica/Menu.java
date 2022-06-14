package interfaceGrafica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import componentes.Componentes;

@SuppressWarnings("serial")
public class Menu extends JFrame implements ActionListener{
	Componentes conexaoComponentes = new Componentes();
	
	JPanel panel1 = conexaoComponentes.criarJPanel(new JPanel(), 0, 0, 500, 350);
	
	JButton btnCriarCampeonato = conexaoComponentes.criarJButton(new JButton("Criar"), 350, 70, 100, 50);
	JButton btnCarregarCameponato = conexaoComponentes.criarJButton(new JButton("Carregar"), 350, 140, 100, 50);
	JButton btnSair = conexaoComponentes.criarJButton(new JButton("Sair"), 350, 210, 100, 50);
	
	
	public Menu() {
		editarFrame();
		addComponentes();
		editarComponentes();
	}
	
	public Menu(String iniciar) {
		
	}
	
	public void editarFrame() {
		this.setTitle("Menu");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(490, 200);
		this.setResizable(false);
		this.setSize(500, 350);
		this.setVisible(true);
		this.setLayout(null);	
	}
	
	public void addComponentes() {
		this.add(panel1);
		panel1.add(btnCriarCampeonato);
		panel1.add(btnCarregarCameponato);
		panel1.add(btnSair);
	}
	
	public void editarComponentes() {
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setLayout(null);
		
		btnCriarCampeonato.addActionListener(this);
		btnCarregarCameponato.addActionListener(this);
		btnSair.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Menu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSair){
			System.exit(0);
		}
		
		if (e.getSource() == btnCriarCampeonato) {
			OpcoesCampeonato frame = new OpcoesCampeonato();
			
			frame.setVisible(true);
			this.dispose();
		}
	}

}
