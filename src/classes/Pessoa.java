package classes;

public class Pessoa {
	String nome;
	int idade;
	
	void fazAniversario() {
		idade += 1;
	}
	
	public static void main(String args[]) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Diego";
		p1.idade = 34;
		p1.fazAniversario();
		System.out.printf("Nome: " + p1.nome + "\n" + "Idade: " + p1.idade);

	}
}
