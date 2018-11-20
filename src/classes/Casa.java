package classes;

public class Casa {
	public String cor;
	public Porta porta1;
	public Porta porta2;
	public Porta porta3;
	
	public void pintaCasa(String cor) {
		this.cor = cor;	
		System.out.println("A casa será pintada na cor " + this.cor);
	}
	
	public int quantasPortasEstaoAbertas() {
		int contPortasAbertas = 0;
		
		if(porta1.estaAberta() == true) {
			contPortasAbertas += 1;
		}
		
		if(porta2.estaAberta() == true) {
			contPortasAbertas += 1;
		}
		
		if(porta3.estaAberta() == true) {
			contPortasAbertas += 1;
		}
		
		return contPortasAbertas;
	}
}	

