package Exerc�ciosGeneration.Colletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colletion1 {

	public static void main(String[] args) {

		//criar o meu list
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(2);//add ir� adiconar um elemento ao meu ArrayList
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(6);
		minhaLista.add(1);
		minhaLista.add(3);
		
		for(Integer listaElementos:minhaLista)
		{
			System.out.println(listaElementos);
		}
		
		System.out.println("\nRemovendo um elemento da minha lista...");
		System.out.println();
		minhaLista.remove(0);
		for(Integer listaElementos:minhaLista)
		{
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\nO primeiro elemento da minha lista �: "+primeiroElemento);
		
		for(int i=0;i<minhaLista.size();i++)
		{
			System.out.println("\nElemento: "+minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);
		System.out.println("\nDepois de ordenado fica assim...");
		System.out.println(minhaLista);
		
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(3);
		meuSet.add(8);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(2);
		meuSet.add(8);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext())
		{
			System.out.println(iMeuSet.next());
		}
	}

}
