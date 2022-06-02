package interfaceGrafica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import componentes.Componentes;

@SuppressWarnings("serial")
public class CadastrarPilotos extends JFrame implements ActionListener {
	Componentes conexaoComponentes = new Componentes();
	
	@SuppressWarnings("rawtypes")
	public static DefaultListModel nomePilotos = new DefaultListModel();
	
	int numeroPilotos = Integer.parseInt(OpcoesCampeonato.txtFPilotos.getText());
	int limite = numeroPilotos - 1;
	
	JPanel panel1 = conexaoComponentes.criarJPanel(new JPanel(), 0, 0, 500, 500);
	
	JTextField txtFPiloto = Componentes.criarJTextField(new JTextField(), 155, 45, 170 , 25);
	JLabel titulo = Componentes.criarJLabel(new JLabel("Insira o nome do piloto"), 175, 5, 170, 50 );
	JButton btnInserir = conexaoComponentes.criarJButton(new JButton("Inserir"), 155, 75, 80, 50);
	JButton btnExcluir = conexaoComponentes.criarJButton(new JButton("Excluir"), 245, 75, 80, 50);
	JButton btnVoltar = conexaoComponentes.criarJButton(new JButton("Voltar"), 0, 0, 90, 50);
	JButton btnAvancar = conexaoComponentes.criarJButton(new JButton("Avançar"), 395, 0, 90, 50);
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	JList lista = conexaoComponentes.criarJList(new JList(nomePilotos), 40, 150, 400, 300);
	JScrollPane scroll = new JScrollPane();
	
	public CadastrarPilotos() {
		editarFrame();
		addComponentes();
		editarComponentes();
	}
	
	public CadastrarPilotos(String nome) {
		
	}
	
	public void editarFrame() {
		this.setTitle("Cadastar Pilotos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(550, 250);
		this.setResizable(false);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setLayout(null);	
	}
	
	public void addComponentes() {
		this.add(panel1);
		panel1.setLayout(null);
		panel1.add(txtFPiloto);
		panel1.add(titulo);
		panel1.add(btnInserir);
		panel1.add(btnAvancar);
		panel1.add(btnExcluir);
		panel1.add(btnVoltar);
		panel1.add(scroll);
		
		scroll.setVisible(true);
		scroll.setBounds(40, 150, 400, 300);
		
	}
		
	public void editarComponentes() {
		panel1.setBackground(Color.DARK_GRAY);
		
		titulo.setForeground(Color.WHITE);
		
		btnInserir.addActionListener(this);
		btnExcluir.addActionListener(this);
		btnVoltar.addActionListener(this);
		btnAvancar.addActionListener(this);
		
		btnAvancar.setVisible(false);
		scroll.setViewportView(lista);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnInserir) {
			if(nomePilotos.size() <= limite) {
				nomePilotos.addElement(this.txtFPiloto.getText());
				txtFPiloto.setText("");
			} else {
				JOptionPane.showMessageDialog(null, "Número máximo de pilotos atingidos!!");
			}
			
			if(nomePilotos.size() == limite+1) {
				btnAvancar.setVisible(true);
			} 
		}
		
		if(e.getSource() == btnExcluir) {
			nomePilotos.removeElementAt(lista.getSelectedIndex());
		}
		
		if(e.getSource() == btnVoltar) {
			Menu frame = new Menu();
			
			frame.setVisible(true);
			this.dispose();
		}
		
		if(e.getSource() == btnAvancar) {
			CadastrarEquipes frame = new CadastrarEquipes();
			
			frame.setVisible(true);
			this.dispose();
		}
}
	}
