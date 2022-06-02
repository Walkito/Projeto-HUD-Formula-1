package interfaceGrafica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import componentes.Componentes;

@SuppressWarnings("serial")
public class CadastrarEquipes extends JFrame implements ActionListener {
	Componentes conexaoComponentes = new Componentes();
	
	@SuppressWarnings("rawtypes")
	static DefaultListModel nomeEquipes = new DefaultListModel();
	
	int numeroEquipes = Integer.parseInt(OpcoesCampeonato.txtFEquipes.getText());
	int limite = numeroEquipes - 1;
	
	JPanel panel1 = conexaoComponentes.criarJPanel(new JPanel(), 0, 0, 500, 500);
	
	JTextField txtFPiloto = Componentes.criarJTextField(new JTextField(), 155, 45, 170 , 25);
	JLabel titulo = Componentes.criarJLabel(new JLabel("Insira o nome da equipe"), 175, 5, 170, 50 );
	JButton btnInserir = conexaoComponentes.criarJButton(new JButton("Inserir"), 155, 75, 80, 50);
	JButton btnExcluir = conexaoComponentes.criarJButton(new JButton("Excluir"), 245, 75, 80, 50);
	JButton btnVoltar = conexaoComponentes.criarJButton(new JButton("Voltar"), 0, 0, 90, 50);
	JButton btnAvancar = conexaoComponentes.criarJButton(new JButton("Avançar"), 395, 0, 90, 50);
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	JList lista = conexaoComponentes.criarJList(new JList(nomeEquipes), 40, 150, 400, 300);
	JScrollPane scroll = new JScrollPane();
	
	public CadastrarEquipes() {
		editarFrame();
		addComponentes();
		editarComponentes();
	}
	
	public CadastrarEquipes(String str){
		
	}
	
	public void editarFrame() {
		this.setTitle("Cadastar Equipes");
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
		panel1.add(btnExcluir);
		panel1.add(btnAvancar);
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
		
		scroll.setViewportView(lista);
		
		btnAvancar.setVisible(false);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnInserir) {
			if(nomeEquipes.size() <= limite) {
				nomeEquipes.addElement(this.txtFPiloto.getText());
				txtFPiloto.setText("");
			} else {
				JOptionPane.showMessageDialog(null, "Número máximo de pilotos atingidos!!");
			}
			
			if(nomeEquipes.size() == limite+1) {
				btnAvancar.setVisible(true);
			}
		}
		
		if(e.getSource() == btnExcluir) {
			nomeEquipes.removeElementAt(lista.getSelectedIndex());
		}
		
		if(e.getSource() == btnVoltar) {
			Menu frame = new Menu();
			
			frame.setVisible(true);
			this.dispose();
		}
		
		if(e.getSource() == btnAvancar) {
			EquipesXPilotos frame = new EquipesXPilotos();
			
			frame.setVisible(true);
			this.dispose();
		}
}
	}
