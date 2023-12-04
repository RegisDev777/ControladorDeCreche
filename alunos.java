package EscolaColarinhoEx6;

public class alunos {
         
	 private String name;
	 private int idade;
	 private int sala;
	 private int matricula;
	 
	
	//CONSTRUTORES
	public alunos() {
		// TODO Auto-generated constructor stub
	}
	public alunos(String name, int idade, int sala, int matricula) {	
		this.name = name;
		this.idade = idade;
		this.sala = sala;
		this.matricula = matricula;
	}
   
	//GEETTER E SEETERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {	
		this.sala = sala;
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
	
}
