
import java.util.ArrayList;

public class GerenciadorDados {

    // Suas listas globais que já existem aí:
    public static ArrayList<Selecoes> todasSelecoes = new ArrayList<>();
    public static ArrayList<Grupo> todosGrupos = new ArrayList<>();

    // 🌟 ADICIONE ESTE MÉTODO ABAIXO DAS SUAS LISTAS:
    public static void carregarDadosPredefinidos() {
        // Vetor com os nomes das 8 seleções do seu torneio reduzido
        String[] nomesSelecoes = {
            "Brasil", "Argentina", "França", "Alemanha",
            "Japão", "Senegal", "Espanha", "Itália"
        };

        for (String nomeSel : nomesSelecoes) {
            // 1. Cria uma lista de jogadores genéricos para ESTA seleção
            ArrayList<Jogador> jogadoresDaSelecao = new ArrayList<>();
            // Criando o Goleiro
            Jogador j1 = new Jogador();
            j1.setNome("Goleiro " + nomeSel);
            j1.setPosicao("Goleiro");
            jogadoresDaSelecao.add(j1);

// Criando o Zagueiro
            Jogador j2 = new Jogador();
            j2.setNome("Zagueiro " + nomeSel);
            j2.setPosicao("Zagueiro");
            jogadoresDaSelecao.add(j2);

// Criando o Meia
            Jogador j3 = new Jogador();
            j3.setNome("Meia " + nomeSel);
            j3.setPosicao("Meio-Campo");
            jogadoresDaSelecao.add(j3);

// Criando o Atacante 1
            Jogador j4 = new Jogador();
            j4.setNome("Atacante 1 " + nomeSel);
            j4.setPosicao("Atacante");
            jogadoresDaSelecao.add(j4);

// Criando o Atacante 2
            Jogador j5 = new Jogador();
            j5.setNome("Atacante 2 " + nomeSel);
            j5.setPosicao("Atacante");
            jogadoresDaSelecao.add(j5);
            // 2. Cria o objeto da Seleção com os jogadores dentro
            // ⚠️ ATENÇÃO: Ajuste os valores abaixo para bater com o construtor da sua classe Selecoes
            Selecoes s = new Selecoes(
                    0, nomeSel, 0, false, 1, "Nenhuma", "País fictício",
                    jogadoresDaSelecao, 0, 0, 0, 0, 0, 0, 0, 0
            );

            // 3. Joga a seleção pronta na lista global do sistema
            todasSelecoes.add(s);
        }
    }
}
