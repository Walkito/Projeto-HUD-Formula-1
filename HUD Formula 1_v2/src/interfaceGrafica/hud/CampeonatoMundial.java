package interfaceGrafica.hud;

import java.awt.Color;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

import componentes.Arrays;
import componentes.Componentes;
import font.Fontes;
import images.Imagens;
import interfaceGrafica.OpcoesCampeonato;

@SuppressWarnings("serial")
public class CampeonatoMundial extends JFrame implements ActionListener{
	Componentes conexaoComponentes = new Componentes();
	Imagens conexaoImagens = new Imagens();
	Arrays conexaoArrays = new Arrays();
	Fontes conexaoFontes = new Fontes();
	
	String[] teste = {"Sebastian Hulkenberg", "Lewis Hamilton", "Charles LeClerc", "Lance Stroll", "Fernando Alonso", "Kevin Magnussen", "Max Verstappen", "Enzo Fittipaldi", "Pietro Fittipaldi", "George Russell"};
	String[] teste2 = {"Red Bull Racing RBPT", "Ferrari", "Mercedes", "McLaren Mercedes", "Alpine Renault",};
	
	JPanel panel1 = conexaoComponentes.criarJPanel(new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(conexaoImagens.fundoChampions.getImage(), 0, 0, this);
		}}, 0, 0, 1366, 740);

	JPanel panel2 = conexaoComponentes.criarJPanel(new JPanel(), 45, 45, 1270, 615);
	JPanel panel3 = conexaoComponentes.criarJPanel(new JPanel(), 45, 45, 1270, 615);
	JPanel panel4 = conexaoComponentes.criarJPanel(new JPanel(), 450, 122, 1, 430);
	
	JLabel titulo = Componentes.criarJLabel(new JLabel("FORMULA 1 WORLD CHAMPIONSHIP"), 430, 0, 1000, 100);
	JLabel classificacao = Componentes.criarJLabel(new JLabel("CLASSIFICATION"), 427, 45, 1000, 100);
	JLabel points = Componentes.criarJLabel(new JLabel("POINTS"), 1105, 45, 1000, 100);
	JLabel dif = Componentes.criarJLabel(new JLabel("DIF"), 1215, 45, 1000, 100);
	
	JLabel teste1 = Componentes.criarJLabel(new JLabel(conexaoImagens.alemanha), 455, 121, 33, 20);
	JLabel teste4 = Componentes.criarJLabel(new JLabel(conexaoImagens.redbull), 765, 122, 33, 20);
	
	public CampeonatoMundial() throws FontFormatException, IOException{
		editarFrame();
		addComponentes();
		editarComponentes();
		addDif();
		addPoints();
		addPilotos();
		addPos();
		addEquipes();
	}
	
	public void addComponentes() {
		this.add(panel1);
		panel1.add(panel2);
		panel2.setBackground(new Color(22, 23, 32));
		
		panel2.add(titulo);
		panel2.add(classificacao);
		panel2.add(points);
		panel2.add(dif);
		panel2.add(teste1);
		panel2.add(teste4);
		
		panel2.add(panel4);
	}
	
	public void editarComponentes() throws FontFormatException, IOException {	
		titulo.setFont(conexaoFontes.textoTitulo);
		titulo.setForeground(Color.WHITE);
		
		classificacao.setFont(conexaoFontes.textoTituloGrande);
		classificacao.setForeground(Color.LIGHT_GRAY);
		
		points.setFont(conexaoFontes.textoNormalPequeno);
		points.setForeground(Color.LIGHT_GRAY);
		
		dif.setFont(conexaoFontes.textoNormalPequeno);
		dif.setForeground(Color.LIGHT_GRAY);
		
		panel4.setBackground(Color.DARK_GRAY);
	}
	
	public void editarFrame() {
		this.setTitle("Campeonato Mundial");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocation(50, 60);
		this.setResizable(false);
		this.setSize(1366, 740);
		this.setLayout(null);	
		this.setVisible(true);
	}
	
	public void addDif() {
		int totalPilotos = 10; //Integer.parseInt(OpcoesCampeonato.txtFPilotos.getText());
		int y = 85;
		
		for(int i = 0; i < totalPilotos; i++) {
			JLabel labelDif = Componentes.criarJLabel(new JLabel("0"), 1219, y, 100, 100);
			labelDif.setFont(conexaoFontes.textoNormal);
			labelDif.setForeground(Color.WHITE);
			conexaoArrays.listaDif.add(labelDif);
			y+=45;
			
			panel2.add(conexaoArrays.listaDif.get(i));
		}
	
		panel2.repaint();
	}
	
	public void addPoints() {
		int totalPilotos = 10; //Integer.parseInt(OpcoesCampeonato.txtFPilotos.getText());
		int y = 85;
		
		for(int i = 0; i < totalPilotos; i++) {
			JLabel labelPoints = Componentes.criarJLabel(new JLabel("0"), 1124, y, 100, 100);
			labelPoints.setFont(conexaoFontes.textoNormal);
			labelPoints.setForeground(new Color(136, 137, 146));
			conexaoArrays.listaPoints.add(labelPoints);
			y+=45;
			
			panel2.add(conexaoArrays.listaPoints.get(i));
		}
		
		panel2.repaint();
	}
	
	public void addPilotos() {
		int totalPilotos = 10; //Integer.parseInt(OpcoesCampeonato.txtFPilotos.getText());
		int x = 500;
		int y = 126;
		int y2 = 123;
		
		for(int i =0; i < totalPilotos; i++) {
			String dividir [] = teste[i].split(" ");
			
			JLabel labelNomes = Componentes.criarJLabel(new JLabel(dividir[0]), x, y, 1, 1);			
			labelNomes.setFont(conexaoFontes.textoNormalPequeno);
			labelNomes.setForeground(new Color(174, 175, 184));
			conexaoArrays.listaNomes.add(labelNomes);
			
			int largura = (int) conexaoArrays.listaNomes.get(i).getPreferredSize().getWidth();
			int altura = (int) conexaoArrays.listaNomes.get(i).getPreferredSize().getHeight();
			
			conexaoArrays.listaNomes.get(i).setBounds(x, y, largura, altura);
			y+=45;
			
			panel2.add(conexaoArrays.listaNomes.get(i));
			
			JLabel labelSobreNomes = Componentes.criarJLabel(new JLabel(dividir[1]), x, y2, 1, 1);			
			labelSobreNomes.setFont(conexaoFontes.textoNormalNegrito);
			labelSobreNomes.setForeground(Color.WHITE);
			labelSobreNomes.setText(labelSobreNomes.getText().toUpperCase());
			conexaoArrays.listaSobrenomes.add(labelSobreNomes);
			
			int largura2 = (int) conexaoArrays.listaSobrenomes.get(i).getPreferredSize().getWidth();
			int altura2 = (int) conexaoArrays.listaSobrenomes.get(i).getPreferredSize().getHeight();
			int x2= x + largura + 7;
					
			conexaoArrays.listaSobrenomes.get(i).setBounds(x2, y2, largura2, altura2);
			y2+=45;
			
			panel2.add(conexaoArrays.listaSobrenomes.get(i));
		}
		
		panel2.repaint();
	}
	
	public void addPos() {
		int totalPilotos = 10; //Integer.parseInt(OpcoesCampeonato.txtFPilotos.getText());
		int x = 420;
		int y = 85;
		int posicao = 1;
		
		for(int i =0; i < totalPilotos; i++) {
			JLabel labelPos = Componentes.criarJLabel(new JLabel(String.valueOf(posicao)), x, y, 100, 100);
			labelPos.setFont(conexaoFontes.textoNormalMedio);
			labelPos.setForeground(new Color(136, 137, 146));
			posicao+= 1;
			
			if(posicao > 10) {
				labelPos.setBounds(x-5, y, 100,100);
			}
			
			y+=45;
			panel2.add(labelPos);
		}
		
		panel2.repaint();
	}
	
	public void addEquipes() {
		int totalEquipes = 5; //Integer.parseInt(OpcoesCampeonato.txtFEquipes.getText());
		int x = 810;
		int y = 85;
		
		for(int i = 0; i < totalEquipes; i++) {
			JLabel labelEquipes = Componentes.criarJLabel(new JLabel(teste2[i]), x, y, 500, 100);
			labelEquipes.setFont(conexaoFontes.textoNormalEquipes);
			labelEquipes.setForeground(new Color(136, 137, 146));
			labelEquipes.setText(labelEquipes.getText().toUpperCase());
			y+=45;
			
			panel2.add(labelEquipes);
		}
		
		panel2.repaint();
	}
	
	public static void main(String[] args) throws FontFormatException, IOException{
		new CampeonatoMundial();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
