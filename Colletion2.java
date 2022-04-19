package Exerc�ciosGeneration.Colletion;

import java.util.ArrayList;
import java.util.Scanner;

public class Colletion2 {

	public static void main(String[] args) {

		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n******************************************");
			System.out.println("\n(1) Adicionar produtos ao estoque.");
			System.out.println("\n(2) Remover produtos do estoque.");
			System.out.println("\n(3) Atualizar produtos do estoque.");
			System.out.println("\n(4) Mostrar os produtos do estoque.");
			System.out.println("\n(0) Encerrar o programa...");
			System.out.println("\n******************************************");
			System.out.println("\nDigite uma op��o: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto n�o existente!");
				}
				System.out.println(estoque);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o produto que entrar� no lugar de "+verifica+" : ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto n�o existente!");
				}
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\nOs produtos do estoque s�o: ");
				System.out.println(estoque);
				break;
			default:
				if(op<0 || op>4)
				{
					System.out.println("\nOp��o incorreta! Digite uma nova op��o.");
				}
				else
				{
				System.out.println("\nPrograma finalizado!");
				}
			}
		}
		while(op !=0);
	}

}
