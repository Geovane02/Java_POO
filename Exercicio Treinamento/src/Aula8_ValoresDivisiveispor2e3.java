
public class Aula8_ValoresDivisiveispor2e3 {
	public static void main(String[] args) {
		
		//Verefique os 100 primeiros números divisiveis por 2 e 3.
		
		
		int i = 0;
		while(i<100) {
			
			if(i%2==0) {
				System.out.println("Os valores divisiveis por 2 "+i);
			}else {
				if(i%3==0) {
					System.out.println("Os valores divisiveis por 3 "+i);
									}
			}
			
			
			i++;
		}
		
		
		
		
	}
}
