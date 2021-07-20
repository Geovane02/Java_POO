
public class DeclarandoArray {
	public static void main(String[] args) {
        //[] - são inseridos em uma variável que referecia um array
        int[] a = new int[4];
        a [2] = 20;
        System.out.printf("%s%8s\n","Indice", "Valores");
        for(int i = 0; i < a.length; i++) {
        	System.out.printf("%3d %10d \n", i, a[ i ]);
        	
        }
        
        
        
        //OUTRA MANEIRA DE FAZER UMA DECLARAÇÃO DE ARRAY
        
        int[] b;
        b = new int[10];
        //DECLARANDO VÁRIOS ARRAYS
        int[] r = new int[44], k = new int[23];
        
        
        
        
        

//{} - inicializar valores em um array sua declaração
        int[] iniciaValores = {12,32,54,6,8,89,64,64,6};
        System.out.printf("%s%8s\n","Indice", "Valores");
		
		for(int i = 0; i < iniciaValores.length;i++) {
			System.out.printf("%5d%8d\n", i , iniciaValores [i]);
		}
		
		
		
		
//DECLARA UM ARRAY DE INTEIROS
        int[] meuArray;

        //ALOCA MEMÓRIA PARA 10 INTEIROS
        meuArray = new int[10];

        //INICIALIZA O PRIMEIRO ELEMENTO
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        meuArray [5] = 952;
        meuArray [6] = 344;
        meuArray [7] = 233;
        meuArray [8] = 622;
        meuArray [9] = 8522;
        //meuArray [10] = 564; //ESTOURA A PILHA POIS NÃO EXISTE O ÍNDICE 10

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
        
        double soma = 0;
        for(int i = 0; i<10; i++) {
        	soma +=meuArray[i];
        	
        
        }
        System.out.println("O resultado da soma é"+soma);
    }


}
