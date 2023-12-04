package EscolaColarinhoEx6;

import java.util.Scanner;

public class testApplication {

	public static void main(String[] args) {
         int escolha = 0;
		
		
        sistemaInterno sistemaInterno = new sistemaInterno();
		Scanner sc = new Scanner(System.in);
		
	
	while(escolha != 4) {
		System.out.println("=========================");
		System.out.println("|    ESCOLA COLARINHO   |");
		System.out.println("=========================");
		System.out.println("| [1] -    Alunos       |");
		System.out.println("| [2] -    salas        |");
		System.out.println("| [3] -    Fechar       |");
		System.out.println("=========================");       
		  escolha = sc.nextInt();
		
		 switch (escolha) {
		 	case 1 : 
		 	   sistemaInterno.Alunos();
			   System.out.println();
			   
			   break;
		 	case 2:	 		
				sistemaInterno.salas();
				System.out.println(); 
				
				break;
		 	case 3:
		 		System.out.println("Fechando...");
		 		break;
		 	default:
			 throw new IllegalArgumentException("opção invalida!! ");
		}
		 
		
		
		
		
	}
		
		
		
		
		
		
		
	}

}
