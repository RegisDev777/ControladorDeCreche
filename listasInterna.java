package EscolaColarinhoEx6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listasInterna {

    
	private List<alunos> alunosCadastrado = new ArrayList<>();
	
	
	private SistemaSalas sistemaSalas = new SistemaSalas();
	
	
	
	//GETTERS E SETTERS
	public List<alunos> getAlunosCadastrado() {
		return Collections.unmodifiableList(alunosCadastrado);
	}

	
	///METODOS
	
	//ADD ALUNO NOVO
	public void Adiciona(alunos alunos, int sala) {
		
		this.alunosCadastrado.add(alunos);
		sistemaSalas.adicionarAlunoSala(alunos,sala);
	}
    //REMOVE ALUNO
	public void removeAluno(String nome) {
	     alunos alunoEncontrado = buscaAluno(nome);
	      if(alunoEncontrado != null) {
	    	  sistemaSalas.removerAlunoSala(alunoEncontrado);
	    	  alunosCadastrado.remove(alunoEncontrado);
	    	 System.out.println("Aluno removido com sucesso!");
	      } 
	}
	//BUSCA ALUNO
	public alunos buscaAluno(String nome) {
	   for (alunos alunos : alunosCadastrado) {
		  if(alunos.getName().equalsIgnoreCase(nome)) {
			    return alunos;
		  }
		
	   }
	   return null;
    }
    //MODIFICA DADOS DO ALUNO
	public void modificaSalaDoAluno(int sala ) {
		
	}
    //MOSTRAR VAZIAS
	public void mostrarSalasVazias() {
        sistemaSalas.mostrarSalasVazias();
    }
	
	//METODOS ALTERNATIVOS
	
	//RESTRIÇÃO DE IDADE
	public void RestriçãoDeIdade(int idade) {
		if(idade < 2 || idade > 6) {
			throw new IllegalArgumentException(" Idade Invalida! ( Aceitamos crianças de 2 ate 6 anos! ) ");
		}
	}
	
	
	
	
	
}
