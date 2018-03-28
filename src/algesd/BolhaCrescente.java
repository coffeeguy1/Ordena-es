package algesd;

import java.util.Arrays;

public class BolhaCrescente {
	public static void bolha(int vet[])
    {
       for(int i=1; i<= vet.length-1; i++)
          for(int j=0; j<vet.length-1; j++)
             if(vet[j]>vet[j+1])
             {
                int aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
             }
    }
	
	public static void bolha(char vet[])
	{
		for(int i=1; i<= vet.length-1; i++)
			for(int j=0; j<vet.length-i; j++)
				if(vet[j] > vet[j+1])
				{
					char aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
				
	}
	
	public static void bolha(String vet[])
	{
		for(int i=1; i<= vet.length-1; i++)
			for(int j=0; j<vet.length-i; j++)
				if(vet[j].compareTo(vet[j+1]) > 0)
				{
					String aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
				
	}
	
	
		
	public static void main(String[] args) {
		int vet[] = {2,7,3,9,1,4,6};
		bolha(vet);
		System.out.println(Arrays.toString(vet));
		
		char vet2[] = {'f','a','h','m','d','p'};
		bolha(vet2);
		System.out.println(Arrays.toString(vet2));
		
		String vet3[]= {"Carlos", "Bianca", "José", "Abel", "Marcos", "Fabio"};
		bolha(vet3);
		System.out.println(Arrays.toString(vet3));
		
		
	}
}
