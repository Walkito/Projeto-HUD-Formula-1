package interfaceGrafica.hud;

import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

import componentes.Componentes;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame implements ActionListener{
	Componentes conexaoComponentes = new Componentes();
	
	JButton campeonato = conexaoComponentes.criarJButton(new JButton("Campeonato"), 60, 80, 110, 50);
	
	public TelaPrincipal() {
		editarFrame();
		addComponentes();
	}
	
	public void addComponentes() {
		add(campeonato);
		campeonato.addActionListener(this);
	}
	
	public void editarFrame() {
		this.setTitle("Tela Principal");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(550, 250);
		this.setResizable(false);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setLayout(null);	
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == campeonato) {
			try {
				CampeonatoMundial f = new CampeonatoMundial();
			} catch (FontFormatException | IOException e1) {
				e1.printStackTrace();
			}
			
			
		}
		
	}
}
