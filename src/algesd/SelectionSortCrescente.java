package algesd;

import java.util.Arrays;

public class SelectionSortCrescente {

	public static void selecao(int vet[])
    {
       for(int i=0; i<vet.length-1; i++)
       {
          int indMenor = i;
          for(int j=i+1; j<vet.length; j++)
          {
             if(vet[j] < vet[indMenor])
                indMenor = j;
          }
          int aux = vet[i];
          vet[i] = vet[indMenor];
          vet[indMenor] = aux;
       }
    }
	
	public static void selecao(char vet[])
    {
       for(int i=0; i<vet.length-1; i++)
       {
          int indMenor = i;
          for(int j=i+1; j<vet.length; j++)
          {
             if(vet[j] < vet[indMenor])
                indMenor = j;
          }
          char aux = vet[i];
          vet[i] = vet[indMenor];
          vet[indMenor] = aux;
       }
    }

	public static void selecao(String vet[])
    {
       for(int i=0; i<vet.length-1; i++)
       {
          int indMenor = i;
          for(int j=i+1; j<vet.length; j++)
          {
             if(vet[j].compareTo(vet[indMenor]) < 0)
                indMenor = j;
          }
          String aux = vet[i];
          vet[i] = vet[indMenor];
          vet[indMenor] = aux;
       }
    }
	
	public static void main(String[] args) {
		int vet[] = {2,7,3,9,1,4,6};
		selecao(vet);
		System.out.println(Arrays.toString(vet));
		
		char vet2[] = {'f','a','h','m','d','p'};
		selecao(vet2);
		System.out.println(Arrays.toString(vet2));
		
		String vet3[]= {"Carlos", "Bianca", "José", "Abel", "Marcos", "Fabio"};
		selecao(vet3);
		System.out.println(Arrays.toString(vet3));
	}

}
