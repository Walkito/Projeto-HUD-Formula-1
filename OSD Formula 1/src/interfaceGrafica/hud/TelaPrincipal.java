package interfaceGrafica.hud;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame implements ActionListener{
	
	public TelaPrincipal() {
		editarFrame();
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
		// TODO Auto-generated method stub
		
	}

}
