package font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

public class Fontes {
	private final String F1Normal = "Formula1-Regular_web_0.ttf";
	private final String F1Negrito = "Formula1-Bold_web_0.ttf";
	public Font textoNormal;
	public Font textoNormalPequeno;
	public Font textoNormalMedio;
	public Font textoNormalEquipes;
	public Font textoNormalNegrito;
	public Font textoTitulo;
	public Font textoTituloGrande;
	
	public Fontes() throws FontFormatException, IOException{
	textoNormal = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(F1Normal)).deriveFont(Font.PLAIN, 22);
	textoNormalPequeno = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(F1Normal)).deriveFont(Font.PLAIN, 14);
	textoNormalMedio = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(F1Normal)).deriveFont(Font.PLAIN, 16);
	textoNormalEquipes = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(F1Normal)).deriveFont(Font.PLAIN, 16);
	textoNormalNegrito = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(F1Negrito)).deriveFont(Font.BOLD, 20);
	textoTitulo = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(F1Negrito)).deriveFont(Font.BOLD, 26);
	textoTituloGrande = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(F1Negrito)).deriveFont(Font.BOLD, 34);
	}
	
}
