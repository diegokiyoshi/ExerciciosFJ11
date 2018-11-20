package classes;

public class Porta {
	public boolean aberta;
	public String cor;
	public double dimensaoX;
	public double dimensaoY;
	public double dimensaoZ;
	
	public void abre() {
		if(aberta == false) {
			System.out.println("A porta est� fechada e ser� aberta");
			aberta = true;
		} else {
			System.out.println("A porta j� est� aberta");
		}
	}
	
	public void fecha() {
		if(aberta == true) {
			System.out.println("A porta est� aberta e ser� fechada");
			aberta = false;
		} else {
			System.out.println("A porta j� est� fechada");
		}
	}
	
	public void pinta(String cor) {
		this.cor = cor;
		System.out.println("A porta ser� pintada na cor: " + this.cor);
	}
	
	public boolean estaAberta() {
		if(aberta == true) {
			//System.out.println("A porta est� aberta\n");
			return true;
		} else {
			//System.out.println("A porta est� fechada\n");
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
