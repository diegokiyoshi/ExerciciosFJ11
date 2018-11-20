package classes;

public class Porta {
	public boolean aberta;
	public String cor;
	public double dimensaoX;
	public double dimensaoY;
	public double dimensaoZ;
	
	public void abre() {
		if(aberta == false) {
			System.out.println("A porta está fechada e será aberta");
			aberta = true;
		} else {
			System.out.println("A porta já está aberta");
		}
	}
	
	public void fecha() {
		if(aberta == true) {
			System.out.println("A porta está aberta e será fechada");
			aberta = false;
		} else {
			System.out.println("A porta já está fechada");
		}
	}
	
	public void pinta(String cor) {
		this.cor = cor;
		System.out.println("A porta será pintada na cor: " + this.cor);
	}
	
	public boolean estaAberta() {
		if(aberta == true) {
			//System.out.println("A porta está aberta\n");
			return true;
		} else {
			//System.out.println("A porta está fechada\n");
			return false;
		}
	}
	
	public void imprime() {
		String dadosPorta = "Dimensao X: " + this.dimensaoX;
		dadosPorta += "\nDimensao Y: " + this.dimensaoY;
		dadosPorta += "\nDimensao Z: " + this.dimensaoZ;
		System.out.println(dadosPorta);
	}
}
