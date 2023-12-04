package EscolaColarinhoEx6;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaSalas {
    

	
    private List<List<alunos>> salas;

    public SistemaSalas() {
        salas = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            salas.add(new ArrayList<>());
        }
    }

    public void adicionarAlunoSala(alunos aluno, int salaEscolhida) {
        if (salaEscolhida >= 0 && salaEscolhida < 6 && !salaCheia(salaEscolhida)) {
            aluno.setSala(salaEscolhida);
            salas.get(salaEscolhida).add(aluno);
            System.out.println("Aluno "  + " adicionado na sala " + salaEscolhida);
        } else {
            System.out.println("Sala inválida ou cheia. Escolha outra sala.");
        }
    }
    
    private boolean salaCheia(int sala) {
        return salas.get(sala).size() >= 6;
    }

    public void removerAlunoSala(alunos aluno) {
        int sala = aluno.getSala();
        salas.get(sala).remove(aluno);
    }

    private int encontrarSalaDisponivel() {
        for (int i = 0; i < salas.size(); i++) {
            if (salas.get(i).size() < 6) {
                return i;
            }
        }
        return -1; // Todas as salas estão cheias
    }

    public void mostrarSalasVazias() {
        System.out.println("Salas vazias:");
        for (int i = 0; i < salas.size(); i++) {
            if (salas.get(i).isEmpty()) {
                System.out.println("Sala " + i);
            }
        }
    }


    



}
