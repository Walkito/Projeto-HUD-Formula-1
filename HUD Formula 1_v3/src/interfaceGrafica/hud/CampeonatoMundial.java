package interfaceGrafica.hud;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.IOException;

import javax.swing.*;

import componentes.Arrays;
import componentes.Componentes;
import font.Fontes;
import images.Imagens;
import interfaceGrafica.CadastrarEquipes;
import interfaceGrafica.CadastrarPilotos;
import interfaceGrafica.EquipesXPilotos;
import interfaceGrafica.OpcoesCampeonato;

@SuppressWarnings("serial")
public class CampeonatoMundial extends JFrame implements ActionListener{
	Componentes conexaoComponentes = new Componentes();
	Imagens conexaoImagens = new Imagens();
	Arrays conexaoArrays = new Arrays();
	Fontes conexaoFontes = new Fontes();
	CadastrarPilotos conexaoCadastrarPilotos = new CadastrarPilotos("Iniciar");
	CadastrarEquipes conexaoCadastrarEquipes = new CadastrarEquipes("Iniciar");
	EquipesXPilotos conexaoEquipesXPilotos = new EquipesXPilotos("Iniciar");

	String[] teste = {"Sergio Perez", "Lewis Hamilton", "Charles LeClerc", "Lance Stroll", "Fernando Alonso", "Kevin Magnussen", "Max Verstappen", "Enzo Fittipaldi", "Pietro Fittipaldi", "George Russell"};
	String[] teste2 = {"Red Bull Racing RBPT", "Ferrari", "Mercedes", "McLaren Mercedes", "Alpine Renault",};
	
	JPanel panel1 = conexaoComponentes.criarJPanel(new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(conexaoImagens.fundoChampions.getImage(), 0, 0, this);
		}}, 0, 0, 1366, 740);

	JPanel panel2 = conexaoComponentes.criarJPanel(new JPanel(),  445, 45, 870, 615);
	
	JPanel panel3 = conexaoComponentes.criarJPanel(new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(conexaoImagens.fundoPrimeiro.getImage(), 0, 0, this);
		}}, 45, 45, 400, 615);
	
	JPanel panel4 = conexaoComponentes.criarJPanel(new JPanel(), 55, 122, 1, 430);
	
	
	JLabel titulo = Componentes.criarJLabel(new JLabel("FORMULA 1 WORLD CHAMPIONSHIP"), 31, 0, 1000, 100);
	JLabel classificacao = Componentes.criarJLabel(new JLabel("DRIVERS CHAMPIONSHIP"), 31, 45, 1000, 100);
	JLabel points = Componentes.criarJLabel(new JLabel("POINTS"), 725, 45, 1000, 100);
	JLabel dif = Componentes.criarJLabel(new JLabel("DIF"), 815, 45, 1000, 100);
	
	JLabel teste4 = Componentes.criarJLabel(new JLabel(conexaoImagens.redbull), 382, 122, 33, 20);
	JLabel teste5 = Componentes.criarJLabel(new JLabel(conexaoImagens.fotoPrimeiro), -55, -10, 500, 733);
	JLabel teste6 = Componentes.criarJLabel(new JLabel("Sergio"), 20,  365, 200, 203);
	JLabel teste7 = Componentes.criarJLabel(new JLabel("PEREZ"), 17, 408, 200, 203);
	JLabel teste8 = Componentes.criarJLabel(new JLabel("1st"), 167, 467, 200, 203);
	
	public CampeonatoMundial() throws FontFormatException, IOException{
		editarFrame();
		addComponentes();
		editarComponentes();
		addDif();
		addPoints();
		addPilotos();
		addPos();
		addEquipes();
		painelPrimeiro();
	}
	
	public void addPaises(String piloto, int y) {
		String paisDoPiloto = conexaoCadastrarPilotos.paisesPilotos.get(piloto);
		int x = 61;
		int a = 33;
		int b = 20;
		int dif = 3;
		JLabel pais = Componentes.criarJLabel(new JLabel(), x, y, a, b);
		panel2.add(pais);
		
		switch(paisDoPiloto) {
			case "África":
				pais.setIcon(conexaoImagens.africa);
				y -= dif;
				pais.setBounds(x, y, a, b);
			break;
			case "Alemanha":
				pais.setIcon(conexaoImagens.alemanha);
				y -= dif;
				pais.setBounds(x,  y,  a, b);
			break;
			case "Angola":
				pais.setIcon(conexaoImagens.angola);
				y -= dif;
				pais.setBounds(x, y, a, b);
			break;
			case "Argentina":
				pais.setIcon(conexaoImagens.argentina);
				y -= dif;
				pais.setBounds(x, y, a, b);
			break;
			case "Austrália":
				pais.setIcon(conexaoImagens.argentina);
				y -= dif;
				pais.setBounds(x, y, a, b);
			break;
			case "Austria":
				pais.setIcon(conexaoImagens.austria);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Azerbaijão":
				pais.setIcon(conexaoImagens.azerbeijao);
				y -= dif;
				pais.setBounds(x,  y,  a, b);
				break;
			case "Bahrain":
				pais.setIcon(conexaoImagens.bahrain);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Bélgica":
				pais.setIcon(conexaoImagens.belgica);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Bolívia":
				pais.setIcon(conexaoImagens.bolivia);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Brasil":
				pais.setIcon(conexaoImagens.brasil);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Bulgária":
				pais.setIcon(conexaoImagens.bulgaria);
				y -= dif;
				pais.setBounds(x,  y,  a, b);
				break;
			case "Camarões":
				pais.setIcon(conexaoImagens.camaroes);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Canadá":
				pais.setIcon(conexaoImagens.canada);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Chile":
				pais.setIcon(conexaoImagens.chile);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "China":
				pais.setIcon(conexaoImagens.china);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Colombia":
				pais.setIcon(conexaoImagens.colombia);
				y -= dif;
				pais.setBounds(x,  y,  a, b);
				break;
			case "Coréia do Sul":
				pais.setIcon(conexaoImagens.koreia);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Costa do Marfim":
				pais.setIcon(conexaoImagens.costaMarfim);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Costa Rica":
				pais.setIcon(conexaoImagens.costaRica);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Croácia":
				pais.setIcon(conexaoImagens.croacia);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Dinamarca":
				pais.setIcon(conexaoImagens.dinamarca);
				y -= dif;
				pais.setBounds(x,  y,  a, b);
				break;
			case "Ecuardo":
				pais.setIcon(conexaoImagens.ecuador);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Egito":
				pais.setIcon(conexaoImagens.egito);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Escócia":
				pais.setIcon(conexaoImagens.escocia);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Espanha":
				pais.setIcon(conexaoImagens.espanha);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Estados Unidos":
				pais.setIcon(conexaoImagens.eua);
				y -= dif;
				pais.setBounds(x,  y,  a, b);
				break;
			case "Finlândia":
				pais.setIcon(conexaoImagens.finlandia);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "França":
				pais.setIcon(conexaoImagens.franca);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "País de Gales":
				pais.setIcon(conexaoImagens.gales);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Gana":
				pais.setIcon(conexaoImagens.gana);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Grécia":
				pais.setIcon(conexaoImagens.grecia);
				y -= dif;
				pais.setBounds(x,  y,  a, b);
				break;
			case "Holanda":
				pais.setIcon(conexaoImagens.holanda);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Hungria":
				pais.setIcon(conexaoImagens.hungria);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Índia":
				pais.setIcon(conexaoImagens.india);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Inglaterra":
				pais.setIcon(conexaoImagens.inglaterra);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Irlanda":
				pais.setIcon(conexaoImagens.irlanda);
				y -= dif;
				pais.setBounds(x,  y,  a, b);
				break;
			case "Israel":
				pais.setIcon(conexaoImagens.israel);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Itália":
				pais.setIcon(conexaoImagens.italia);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Japão":
				pais.setIcon(conexaoImagens.japao);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "México":
				pais.setIcon(conexaoImagens.mexico);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Mônaco":
				pais.setIcon(conexaoImagens.monaco);
				y -= dif;
				pais.setBounds(x,  y,  a, b);
				break;
			case "Noruega":
				pais.setIcon(conexaoImagens.noruega);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Paraguai":
				pais.setIcon(conexaoImagens.paraguai);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Peru":
				pais.setIcon(conexaoImagens.peru);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Polônia":
				pais.setIcon(conexaoImagens.polonia);
				y -= dif;
				pais.setBounds(x,  y,  a, b);
				break;
			case "Portugal":
				pais.setIcon(conexaoImagens.portugal);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "República Tcheca":
				pais.setIcon(conexaoImagens.tcheca);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Rússia":
				pais.setIcon(conexaoImagens.russia);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Suécia":
				pais.setIcon(conexaoImagens.suecia);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Suíça":
				pais.setIcon(conexaoImagens.suica);
				y -= dif;
				pais.setBounds(x,  y,  a, b);
				break;
			case "Uruguai":
				pais.setIcon(conexaoImagens.uruguai);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
			case "Venezuela":
				pais.setIcon(conexaoImagens.venezuela);
				y -= dif;
				pais.setBounds(x, y, a, b);
				break;
		}
	}
	
	public void painelPrimeiro() {
		JLabel nomeEquipe = new RotateLabel("Red Bull");
		nomeEquipe.setFont(conexaoFontes.equipeGrande);
		nomeEquipe.setForeground(new Color(255, 255, 255, 100));
		nomeEquipe.setText(nomeEquipe.getText().toUpperCase());
		
		int x = -171;
		int y = 20;
		
		nomeEquipe.setBounds(x, y, 500, 900);
		
		teste6.setFont(conexaoFontes.nomeGrande);
		teste6.setForeground(Color.WHITE);
		
		teste7.setFont(conexaoFontes.sobreNomeGrande);
		teste7.setForeground(Color.WHITE);
		
		teste8.setFont(conexaoFontes.sobreNomeGrande);
		teste8.setForeground(Color.WHITE);
		
		panel3.add(nomeEquipe);
		panel3.repaint();
	}
	
	public void addComponentes() {
		this.add(panel1);
		panel1.add(panel2);
		panel2.setBackground(new Color(22, 23, 32));
		panel1.add(panel3);
		
		
		panel2.add(titulo);
		panel2.add(classificacao);
		panel2.add(points);
		panel2.add(dif);
		panel2.add(teste4);
		panel2.add(panel4);
		
		panel3.add(teste6);
		panel3.add(teste7);
		panel3.add(teste8);
		panel3.add(teste5);
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
		
		panel3.setBackground(Color.WHITE);
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
		int totalPilotos = Integer.parseInt(OpcoesCampeonato.txtFPilotos.getText());
		int y = 85;
		int x = 819;
		
		for(int i = 0; i < totalPilotos; i++) {
			JLabel labelDif = Componentes.criarJLabel(new JLabel("0"), x, y, 100, 100);
			labelDif.setFont(conexaoFontes.textoNormal);
			labelDif.setForeground(Color.WHITE);
			conexaoArrays.listaDif.add(labelDif);
			y+=45;
			
			panel2.add(conexaoArrays.listaDif.get(i));
		}
	
		panel2.repaint();
	}
	
	public void addPoints() {
		int totalPilotos = Integer.parseInt(OpcoesCampeonato.txtFPilotos.getText());
		int y = 85;
		int x = 746;
		
		for(int i = 0; i < totalPilotos; i++) {
			JLabel labelPoints = Componentes.criarJLabel(new JLabel("0"), x, y, 100, 100);
			labelPoints.setFont(conexaoFontes.textoNormal);
			labelPoints.setForeground(new Color(136, 137, 146));
			conexaoArrays.listaPoints.add(labelPoints);
			y+=45;
			
			panel2.add(conexaoArrays.listaPoints.get(i));
		}
		
		panel2.repaint();
	}
	
	public void addPilotos() {
		int totalPilotos = Integer.parseInt(OpcoesCampeonato.txtFPilotos.getText());
		int x = 103;
		int y = 126;
		int y2 = 123;
		
		for(int i =0; i < totalPilotos; i++) {
			String dividir [] = ((String) CadastrarPilotos.nomePilotos.getElementAt(i)).split(" ");
			
			JLabel labelNomes = Componentes.criarJLabel(new JLabel(dividir[0]), x, y, 1, 1);			
			labelNomes.setFont(conexaoFontes.textoNormalPequeno);
			labelNomes.setForeground(new Color(174, 175, 184));
			conexaoArrays.listaNomes.add(labelNomes);
			
			int largura = (int) conexaoArrays.listaNomes.get(i).getPreferredSize().getWidth();
			int altura = (int) conexaoArrays.listaNomes.get(i).getPreferredSize().getHeight();
			
			conexaoArrays.listaNomes.get(i).setBounds(x, y, largura, altura);
			
			addPaises((String) CadastrarPilotos.nomePilotos.getElementAt(i), y);
			
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
		int totalPilotos = Integer.parseInt(OpcoesCampeonato.txtFPilotos.getText());
		int x = 25;
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
		int totalPilotos = Integer.parseInt(OpcoesCampeonato.txtFPilotos.getText());
		int totalEquipes = Integer.parseInt(OpcoesCampeonato.txtFEquipes.getText());
		int x = 428;
		int y = 85;
		
		for(int a = 0; a < EquipesXPilotos.listaRelacao.size(); a++) {
			for(int i = 0; i < totalPilotos; i++) {
				String piloto = CadastrarPilotos.nomePilotos.get(i).toString();
				
				for(int j = 0; j < totalEquipes; j++) {
					String equipe = CadastrarEquipes.nomeEquipes.get(j).toString();
					String pilotoEquipe = piloto + " " + "-" + " " + equipe;
										
					if(pilotoEquipe.equals(EquipesXPilotos.listaRelacao.get(a))) {
						JLabel labelEquipes = Componentes.criarJLabel(new JLabel(equipe), x, y, 500, 100);
						labelEquipes.setFont(conexaoFontes.textoNormalEquipes);
						labelEquipes.setForeground(new Color(136, 137, 146));
						labelEquipes.setText(labelEquipes.getText().toUpperCase());
						y+=45;
						panel2.add(labelEquipes);
						panel2.repaint();
						
					} else {
						
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws FontFormatException, IOException{
		new CampeonatoMundial();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	private class RotateLabel extends JLabel {
	      public RotateLabel(String text) {
	         super(text);
	         Font font = new Font("Verdana", Font.ITALIC, 10);
	         FontMetrics metrics = new FontMetrics(font){};
	         Rectangle2D bounds = metrics.getStringBounds(text, null);
	         setBounds(0, 0, (int) bounds.getWidth(), (int) bounds.getHeight());
	      }
	      @Override
	      public void paintComponent(Graphics g) {
	         Graphics2D gx = (Graphics2D) g;
	         gx.rotate(4.71, getX() + getWidth()/2, getY() + getHeight()/3);
	         super.paintComponent(g);
	      }
	   }
}
