
public class ImprimeX {
	public static void main(String[] args) {
		int x = 1;
		for(int i = x; i > 1; i --) {
			if(x > 1) { 
				if(x % 2 == 0) {
					x = x / 2;
				}else{
					x = 3 * x + 1;
				}
			} 
			System.out.println(x);
			if(x == 1) {
				i = 1;
				System.out.println(x);
			}
		
		}
	}
}
