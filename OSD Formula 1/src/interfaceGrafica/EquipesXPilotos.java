package interfaceGrafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import componentes.Componentes;

@SuppressWarnings("serial")
public class EquipesXPilotos extends JFrame implements ActionListener{
	static Componentes conexaoComponentes = new Componentes();
	CadastrarPilotos conexaoCP = new CadastrarPilotos("Iniciar");
	CadastrarEquipes conexaoCE = new CadastrarEquipes("Iniciar");

	@SuppressWarnings("rawtypes")
	static DefaultListModel listaRelacao = new DefaultListModel();
	@SuppressWarnings("rawtypes")
	static List listaExcluidos = new ArrayList();
	@SuppressWarnings("rawtypes")
	static List listaExcluidos2 = new ArrayList();
	
	Object[] items = {};
	
	Object[] items2 = {};
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	DefaultComboBoxModel boxModel = new DefaultComboBoxModel();
	@SuppressWarnings({ "rawtypes", "unchecked" })
	DefaultComboBoxModel boxModel2 = new DefaultComboBoxModel();
	
	JPanel panel1 = conexaoComponentes.criarJPanel(new JPanel(), 0, 0, 500, 500);
		
	@SuppressWarnings({ "rawtypes", "unchecked" })
	JComboBox boxPilotos = conexaoComponentes.criarJCBox(new JComboBox(boxModel), 82, 45, 100, 20);
	@SuppressWarnings({ "unchecked", "rawtypes" })
	JComboBox boxEquipes = conexaoComponentes.criarJCBox(new JComboBox(boxModel2), 300, 45, 100, 20);
	
	JLabel lblTitulo = Componentes.criarJLabel(new JLabel("Adicione os pilotos em suas equipes"), 80, -85, 500, 200);
	JLabel lblX = Componentes.criarJLabel(new JLabel("X"), 233, -44, 500, 200);
	
	JButton btnAdicionar = conexaoComponentes.criarJButton(new JButton("Adicionar"), 135, 85, 95, 20);
	JButton btnExcluir = conexaoComponentes.criarJButton(new JButton("Excluir"), 255,85,95,20);
	@SuppressWarnings({ "unchecked", "rawtypes" })
	JList lista = conexaoComponentes.criarJList(new JList(listaRelacao), 40, 150, 400, 300);
	JScrollPane scroll = new JScrollPane();
	
	public EquipesXPilotos() {
		editarFrame();
		addComponentes();
		editarComponentes();
	}
	
	public EquipesXPilotos(String iniciar) {
		
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
	
	@SuppressWarnings("unchecked")
	public void addComponentes() {
		this.add(panel1);
		
		panel1.add(boxPilotos);
		panel1.add(boxEquipes);
		panel1.add(lblTitulo);
		panel1.add(lblX);
		panel1.add(btnAdicionar);
		panel1.add(btnExcluir);
		panel1.add(scroll);
		
		scroll.setVisible(true);
		scroll.setBounds(40, 130, 400, 320);
		scroll.setViewportView(lista);
		
		for(int i = 0; i < conexaoCP.numeroPilotos; i++) {
			boxModel.addElement(CadastrarPilotos.nomePilotos.get(i));
		}
		
		for(int i = 0; i < conexaoCE.numeroEquipes; i++) {
			boxModel2.addElement(CadastrarEquipes.nomeEquipes.get(i));
		}
	}
	
	@SuppressWarnings("unchecked")
	public void adicionarLista() {
		String nome = boxPilotos.getSelectedItem().toString();
		int indexP = boxPilotos.getSelectedIndex();
		String equipe = boxEquipes.getSelectedItem().toString();
		int indexE = boxEquipes.getSelectedIndex();
		
		int contadorEquipe = 0;
		
		listaRelacao.addElement(nome + " - " + equipe);
		
		for (int i = 0; i < listaRelacao.size(); i++) {
			if (listaRelacao.get(i).toString().indexOf(equipe) != -1) {
				contadorEquipe += 1;
			}
		}	
		
		if(contadorEquipe == Integer.parseInt(OpcoesCampeonato.txtFPxE.getText())) {
			listaExcluidos2.add(equipe);
			boxModel2.removeElementAt(indexE);
			contadorEquipe = 0;
		}
		
		listaExcluidos.add(nome);
		boxModel.removeElementAt(indexP);
		
		}
	
	@SuppressWarnings("unchecked")
	public void removerLista() {
		int contadorEquipe = 0;
		
		int index = lista.getSelectedIndex();
		String str = String.valueOf(lista.getSelectedValue());
		String dividir[] = str.split("-");
		
		String nome = dividir[0];
		String equipe = dividir[1];
				
		for(int i = 0; i < listaExcluidos.size(); i++) {
			if((listaExcluidos.get(i).toString() + " ").equals(nome) ) {
				boxModel.addElement(listaExcluidos.get(i));
				listaExcluidos.remove(i);
			}			
		}
		
		for(int i = 0; i < listaExcluidos2.size(); i++) {
			if((" " + listaExcluidos2.get(i).toString()).equals(equipe) ) {
				boxModel2.addElement(listaExcluidos2.get(i));
				listaExcluidos2.remove(i);
			}
		}
		
		listaRelacao.removeElementAt(index);
	}
	
	public void editarComponentes() {
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setLayout(null);
				
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
		
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Arial", Font.BOLD, 28));
		

		scroll.setViewportView(lista);
		
		btnAdicionar.addActionListener(this);
		btnExcluir.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new EquipesXPilotos();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAdicionar) {
			adicionarLista();
		}
		
		if(e.getSource() == btnExcluir) {
			removerLista();
		}
	}
	
}
