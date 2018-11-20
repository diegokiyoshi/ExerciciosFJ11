
public class Fibonacci {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 20; i++) {
			System.out.println("Fibonacci de " + i + " é igual a: " + fibo(i));
		}
	}
	
	static long fibo(int n) {
		if(n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
}
