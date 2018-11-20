package main;

import classes.Porta;

public class TestaPorta {
	public static void main(String[] args) {
		Porta porta1 = new Porta();
		porta1.aberta = false;
		porta1.pinta("cinza");
		porta1.abre();
		porta1.abre();
		porta1.fecha();
		porta1.abre();
		porta1.dimensaoX = 1.3;
		porta1.dimensaoY = 2.4;
		porta1.dimensaoZ = 3.5;
		
		porta1.estaAberta();
		
		porta1.imprime();
		
	}
}
