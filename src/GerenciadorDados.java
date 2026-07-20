
import java.util.ArrayList;

public class GerenciadorDados {

    public static ArrayList<Selecoes> todasSelecoes = new ArrayList<>();
    public static ArrayList<Grupo> todosGrupos = new ArrayList<>();
    public static ArrayList<Confronto> todosConfrontos = new ArrayList<>();
    // --- SEUS MÉTODOS EXISTENTES ---

    public static void carregarDadosPredefinidos() {
        String[] nomesSelecoes = {
            "Brasil", "Argentina", "França", "Alemanha",
            "Japão", "Senegal", "Espanha", "Itália"
        };

        for (String nomeSel : nomesSelecoes) {
            ArrayList<Jogador> jogadoresDaSelecao = new ArrayList<>();

            Jogador j1 = new Jogador();
            j1.setNome("Goleiro " + nomeSel);
            j1.setPosicao("Goleiro");
            jogadoresDaSelecao.add(j1);

            Jogador j2 = new Jogador();
            j2.setNome("Zagueiro " + nomeSel);
            j2.setPosicao("Zagueiro");
            jogadoresDaSelecao.add(j2);

            Jogador j3 = new Jogador();
            j3.setNome("Meia " + nomeSel);
            j3.setPosicao("Meio-Campo");
            jogadoresDaSelecao.add(j3);

            Jogador j4 = new Jogador();
            j4.setNome("Atacante 1 " + nomeSel);
            j4.setPosicao("Atacante");
            jogadoresDaSelecao.add(j4);

            Jogador j5 = new Jogador();
            j5.setNome("Atacante 2 " + nomeSel);
            j5.setPosicao("Atacante");
            jogadoresDaSelecao.add(j5);

            Selecoes s = new Selecoes(
                    0, nomeSel, 0, false, 1, "Nenhuma", "País fictício",
                    jogadoresDaSelecao, 0, 0, 0, 0, 0, 0, 0, 0
            );

            todasSelecoes.add(s);
        }
    }

    // --- NOVOS MÉTODOS PARA SALVAR E CARREGAR ---
    /**
     * Converte as listas globais em JSON e as salva em arquivos de texto.
     */
    public static void salvarDadosEmArquivo() {
        // 1. Salvar a lista de Seleções
        String jsonSelecoes = ManipuladorJSON.converterListaSelecoesParaJSON(todasSelecoes);
        ManipuladorArquivoTexto.escrever(jsonSelecoes, "selecoes.json");

        // 2. Salvar a lista de Grupos
        String jsonGrupos = ManipuladorJSON.converterListaGrupoParaJSON(todosGrupos);
        ManipuladorArquivoTexto.escrever(jsonGrupos, "grupos.json");

        String jsonConfrontos = ManipuladorJSON.converterListaParaJSON(todosConfrontos);
        ManipuladorArquivoTexto.escrever(jsonConfrontos, "confrontos.json");

        System.out.println("Dados salvos com sucesso em arquivos JSON!");
    }

    /**
     * Lê os arquivos JSON (se existirem) e reconstrói as listas na memória.
     */
    public static void carregarDadosDoArquivo() {
        // 1. Tenta ler e reconstruir as Seleções
        String jsonSelecoes = ManipuladorArquivoTexto.ler("selecoes.json");
        if (jsonSelecoes != null && !jsonSelecoes.trim().isEmpty()) {
            todasSelecoes = ManipuladorJSON.converterJsonParaListaSelecoes(jsonSelecoes);
        }

        // 2. Tenta ler e reconstruir os Grupos
        String jsonGrupos = ManipuladorArquivoTexto.ler("grupos.json");
        if (jsonGrupos != null && !jsonGrupos.trim().isEmpty()) {
            todosGrupos = ManipuladorJSON.converterJsonParaListaGrupo(jsonGrupos);
        }

        String jsonConfrontos = ManipuladorArquivoTexto.ler("confrontos.json"); //[cite: 1]
        if (jsonConfrontos != null && !jsonConfrontos.trim().isEmpty()) {
            todosConfrontos = ManipuladorJSON.converterJsonParaLista(jsonConfrontos);

            System.out.println("Dados carregados com sucesso dos arquivos JSON!");
        }
    }
}
