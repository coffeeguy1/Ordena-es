package algesd;

import java.util.Arrays;

public class InsertionSortDecrescente {
	public static void insercao(int vet[])
    {
       for(int i=1; i<vet.length; i++)
       {
          int aux = vet[i];
          int j = i-1;        
          while(j>=0 && vet[j] < aux)
          {
             vet[j+1] = vet[j];
             j--;
          }
          vet[j+1] = aux;
       }
    }
	
	public static void insercao(char vet[])
    {
       for(int i=1; i<vet.length; i++)
       {
          char aux = vet[i];
          int j = i-1;        
          while(j>=0 && vet[j]<aux)
          {
             vet[j+1] = vet[j];
             j--;
          }
          vet[j+1] = aux;
       }
    }
	
	public static void insercao(String vet[])
    {
       for(int i=1; i<vet.length; i++)
       {
          String aux = vet[i];
          int j = i-1;        
          while(j>=0 && vet[j].compareTo(aux) < 0)
          {
             vet[j+1] = vet[j];
             j--;
          }
          vet[j+1] = aux;
       }
    }

	public static void main(String[] args) {
		int vet[] = {2,7,3,9,1,4,6};
		insercao(vet);
		System.out.println(Arrays.toString(vet));
		
		char vet2[] = {'f','a','h','m','d','p'};
		insercao(vet2);
		System.out.println(Arrays.toString(vet2));
		
		String vet3[]= {"Carlos", "Bianca", "José", "Abel", "Marcos", "Fabio"};
		insercao(vet3);
		System.out.println(Arrays.toString(vet3));
		
	}
}
