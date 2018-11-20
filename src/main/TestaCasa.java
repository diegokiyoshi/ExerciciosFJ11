package main;

import classes.Casa;
import classes.Porta;

public class TestaCasa {
	public static void main(String[] args) {
		Casa casa1 = new Casa();
		casa1.porta1 = new Porta();
		casa1.pintaCasa("Azul");
		casa1.porta1.aberta = true;
		casa1.porta1.abre();
		casa1.porta1.fecha();
		casa1.porta1.pinta("marrom");
		casa1.porta1.estaAberta();
		
		casa1.porta2 = new Porta();
		//casa1.pintaCasa("Azul");
		casa1.porta2.aberta = false;
		casa1.porta2.fecha();
		casa1.porta2.abre();
		casa1.porta2.pinta("amarelo");
		casa1.porta2.estaAberta();
		
		casa1.porta3 = new Porta();
		//casa1.pintaCasa("Azul");
		casa1.porta3.aberta = false;
		casa1.porta3.fecha();
		casa1.porta3.abre();
		casa1.porta3.pinta("Branco");
		casa1.porta3.estaAberta();
		
		System.out.println("Quantidade de portas abertas: " + casa1.quantasPortasEstaoAbertas());
	}
	
}
