package EscolaColarinhoEx6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import prdoductApplicationEx5.testeAplication;

public class sistemaInterno {

	
	SistemaSalas salasSistema = new SistemaSalas();
	private listasInterna internaLista = new listasInterna();
	Scanner sc = new Scanner(System.in);
	
	
	
	 public listasInterna getInternaLista() {
	        return internaLista;
	 }
	
	 
	
	
	
	
	public void Alunos() {
		int opçao = 0;
		
		
      while(opçao!=4) {
    	System.out.println();
		System.out.println("===============================");
		System.out.println("|    OPÇÕES PARA ALUNOS:      |");
		System.out.println("===============================");
		System.out.println("| [1] - Cadastra aluno        |");
		System.out.println("| [2] - Pesquisa alunos       |");
		System.out.println("| [3] - remove aluno          |");
		System.out.println("| [4] - voltar                |");
		System.out.println("===============================");
		 opçao = sc.nextInt();
		
		switch (opçao) {
		
		
		
	     	case 1: {
	     		  System.out.println();
	     		    System.out.println("=============================");
	     		    System.out.println("|     Cadastros De Alunos   |");
	     		    System.out.println("=============================");
	     		    sc.nextLine();  
	     		    System.out.print("nome:");
	     		    String nome = sc.nextLine().toUpperCase();
	     		    
	     		    System.out.print("idade:");
	     		    int idade = sc.nextInt();
	     		     internaLista.RestriçãoDeIdade(idade);
	     		    sc.nextLine(); // Consumir a quebra de linha
	     		    
	     		     System.out.print("Matricula:");
	     		    int matricula = sc.nextInt();
	     		    sc.nextLine();
	     		    
	     		    alunos cadastrados =  new alunos(nome, idade, 0, matricula);
	     		    
	     		    System.out.print("Sala (1-6): ");
	     		     int sala = sc.nextInt();
	     		      cadastrados.setSala(sala);
	     		      
	     		      
	     		     internaLista.Adiciona(cadastrados, sala);
	     		        
	     		    System.out.println("============================");
	    	     
	    		System.out.println("|Cadastrado com sucesso:  ");
	    		System.out.println("|Aluno: " + cadastrados.getName());
	    		System.out.println("|idade: " + cadastrados.getIdade());
	    		System.out.println("|Sala: "  + cadastrados.getSala());
	    		System.out.println("|Matricula: " + cadastrados.getMatricula());	
	    		System.out.println("============================");
	    		System.out.println();  		
	        } break;
	     	
	     	
			case 2: {
				 System.out.println();
				    System.out.println("========================");
					System.out.println("|    Pesquisa Aluno    |");
					System.out.println("========================");
					sc.nextLine();
					System.out.print("nome:");
					 String nomePesquisa = sc.nextLine().toUpperCase();
					 
					 alunos alunoEncontrado = internaLista.buscaAluno(nomePesquisa);
					  if (alunoEncontrado != null) {
					        System.out.println("Aluno encontrado:");
					        System.out.println("Nome: " + alunoEncontrado.getName());
					        System.out.println("Idade: " + alunoEncontrado.getIdade());
					        System.out.println("Sala: " + alunoEncontrado.getSala());
					        System.out.println("Matrícula: " + alunoEncontrado.getMatricula());
					        System.out.println("========================");
					    } else {
					        System.out.println("Aluno não encontrado.");
					    }
		       } break;
			
			
		       
			case 3: {
			      System.out.println("=============================");
			      System.out.println("        REMOVE ALUNO         ");
			      System.out.println("=============================");
			      sc.nextLine();
				  System.out.print("NOME:");
			        String nome = sc.nextLine();
			         alunos alunoEncontrado = internaLista.buscaAluno(nome);
			         if (alunoEncontrado != null) {
					        System.out.println("Aluno encontrado:");
					        System.out.println("Nome: " + alunoEncontrado.getName());
					        System.out.println("Idade: " + alunoEncontrado.getIdade());
					        System.out.println("Sala: " + alunoEncontrado.getSala());
					        System.out.println("Matrícula: " + alunoEncontrado.getMatricula());
					        System.out.println("========================");
					    } else {
					        System.out.println("Aluno não encontrado.");
					    }
			         internaLista.removeAluno(nome);	
			 }  break;
			
			case 4:
				break;
			
		    default:
			    throw new IllegalArgumentException("Opção invalida: " + opçao);	
		}
		 
	    
	   }	
	}
	
	
	public void salas() {
		int opção = 0;
		
		
		
     while(opção != 3) {
    	System.out.println("================================");
 		System.out.println("|       OPÇÃO PARA SALAS:      |");
 		System.out.println("================================");
 		System.out.println("| [1] - verifica sala          |");
        System.out.println("| [2] - salas Disponiveis      |");		
 		System.out.println("| [3] - voltar                 |");
 		System.out.println("================================");	
 	     opção = sc.nextInt();
 		
 		
 		 switch (opção) {
 		 	case 1: {
 		 		System.out.println("=====================================");
 		 		System.out.println("|          Verifica sala:           |");
 		 		System.out.println("=====================================");
 		 		System.out.print("| Digite sala:");
 		 		 int salaEscolhida = sc.nextInt();
 		 		  
 		 		  if(salaEscolhida > 0 && salaEscolhida < 16) {
 		 			  List<alunos> alunosNaSala = internaLista.getAlunosCadastrado()
 		 					  .stream()
 		 					  .filter(aluno -> aluno.getSala() == salaEscolhida)
 		 					  .collect(Collectors.toList());
 		 			  
 		 			  if(!alunosNaSala.isEmpty()) {
 		 				  System.out.println("| Alunos na sala " + salaEscolhida +  ":");
 		 				    for (alunos alunos : alunosNaSala) {
 								System.out.println("| Nome:"  + alunos.getName());
 								System.out.println("=====================================");
 							}
 		 			  } else {
 		 				  System.out.println("|Nao ha alunos nesta sala!");
 		 				  System.out.println("=====================================");
 		 			  }
 		 		  } else {
 		 			  System.out.println("| digite um numero de sala entre 0 e 6");
 		 			  System.out.println("=====================================");
 		 		  }
 		 		  System.out.println();
 		 	 break;
 		 	} 
 		 	
 		 	
 		 	
 		 	
 		 	case 2: {
 		 		System.out.println("====================================");
 		 		System.out.println("|         Salas disponiveis        |");
 		 		System.out.println("====================================");
 		 	    salasSistema.mostrarSalasVazias();
 		 	    System.out.println("====================================");
 		 	    System.out.println();
 		 		break;	
 		 	}
 		 	case 3 : {		     
 		 	    break;	
 		 	}
 		    default: 	
 		     	throw new IllegalArgumentException("Unexpected value: " + opção);
 		    }	
     }
		
		 	
			
			
			
			
			
			
			
			
			
			
		}
	
}
