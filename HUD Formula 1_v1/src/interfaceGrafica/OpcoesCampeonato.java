package interfaceGrafica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import componentes.Componentes;

@SuppressWarnings("serial")
public class OpcoesCampeonato extends JFrame implements ActionListener{
	Componentes conexaoComponentes = new Componentes();
	
	JPanel panel1 = conexaoComponentes.criarJPanel(new JPanel(), 0, 0, 350, 260);
	
	JLabel lblNPilotos = Componentes.criarJLabel( new JLabel("Quantidade de Pilotos"), 105, -30, 200, 100);
	JLabel lblNEquipes = Componentes.criarJLabel( new JLabel("Quantidade de Equipes"), 105, 40, 200, 100);
	JLabel lblEquipesXPilotos = Componentes.criarJLabel( new JLabel("Pilotos por Equipes"), 105, 110, 200, 100);
	
	static JTextField txtFPilotos = Componentes.criarJTextField(new JTextField(), 135, 35, 50, 25);
	static JTextField txtFEquipes = Componentes.criarJTextField(new JTextField(), 135, 105, 50, 25);
	static JTextField txtFPxE = Componentes.criarJTextField(new JTextField(), 135, 175, 50, 25);
	
	public JButton btnNext = conexaoComponentes.criarJButton(new JButton("Avançar"), 235, 185, 100, 35);
	
	Color corBranca = Color.WHITE;
	
	public OpcoesCampeonato() {
		editarFrame();
		addComponentes();
		editarComponentes();
	}
	
	
	
	public void editarFrame() {
		this.setTitle("Opcoes");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocation(550, 250);
		this.setSize(350, 260);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(null);	
	}
	
	public void addComponentes() {
		this.add(panel1);
		
		panel1.add(txtFPilotos);
		panel1.add(txtFEquipes);
		panel1.add(txtFPxE);
		
		panel1.add(lblNPilotos);
		panel1.add(lblNEquipes);
		panel1.add(lblEquipesXPilotos);
		
		panel1.add(btnNext);
	}
	
	public void editarComponentes() {
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setLayout(null);
		
		lblNPilotos.setForeground(corBranca);
		lblNEquipes.setForeground(corBranca);
		lblEquipesXPilotos.setForeground(corBranca);
		
		btnNext.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNext) {
			CadastrarPilotos frame = new CadastrarPilotos();
			
			frame.setVisible(true);
			this.dispose();
			
		}
		
	}
}
