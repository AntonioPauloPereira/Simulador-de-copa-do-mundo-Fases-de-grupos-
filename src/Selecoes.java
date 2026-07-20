import java.util.ArrayList;
import java.util.List;
public class Selecoes {
    
    //Atributos para serem preenchidos
    private int id;
    private String nome;
    protected int titulos;
    private boolean estreante;
    protected int participacoes;
    private String MelhorColoc;
    private String curiosidade;
    private List<Jogador> jogadores; //Lista de objetos
    
    //Atributos para não serem preenchidos durante o cadastro
    private int partidasJogadas;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golsMarcados;
    private int golContra;
    private int saldoGols;
    private int pontos;
    //Construtores
    
    public Selecoes(){};

    public Selecoes(int id, String nome, int titulos, boolean estreante, int participacoes, String MelhorColoc, String curiosidade, List<Jogador> jogadores, int partidasJogadas, int vitorias, int empates, int derrotas, int golsMarcados, int golContra, int saldoGols, int pontos) {
        this.id = id;
        this.nome = nome;
        this.titulos = titulos;
        this.estreante = estreante;
        this.participacoes = participacoes;
        this.MelhorColoc = MelhorColoc;
        this.curiosidade = curiosidade;
       
        this.jogadores = this.jogadores = jogadores;
        
        this.partidasJogadas = partidasJogadas;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.golsMarcados = golsMarcados;
        this.golContra = golContra;
        this.saldoGols = saldoGols;
        this.pontos = pontos;
    }
    
    //Getters
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getTitulos() {
        return titulos;
    }

    public boolean isEstreante() {
        return estreante;
    }

    public int getParticipacoes() {
        return participacoes;
    }

    public String getMelhorColoc() {
        return MelhorColoc;
    }

    public String getCuriosidade() {
        return curiosidade;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public int getPartidasJogadas() {
        return partidasJogadas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public int getGolContra() {
        return golContra;
    }

    public int getSaldoGols() {
        return saldoGols;
    }
    
    public int getPontos() {
        return pontos;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public void setEstreante(boolean estreante) {
        this.estreante = estreante;
    }

    public void setParticipacoes(int participacoes) {
        this.participacoes = participacoes;
    }

    public void setMelhorColoc(String MelhorColoc) {
        this.MelhorColoc = MelhorColoc;
    }

    public void setCuriosidade(String curiosidade) {
        this.curiosidade = curiosidade;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void setPartidasJogadas(int partidasJogadas) {
        this.partidasJogadas = partidasJogadas;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public void setGolContra(int golContra) {
        this.golContra = golContra;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }
    
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return "Selecoes{" + "id=" + id + ", nome=" + nome + ", titulos=" + titulos + ", estreante=" + estreante + ", participacoes=" + participacoes + ", MelhorColoc=" + MelhorColoc + ", curiosidade=" + curiosidade + ", jogadores=" + jogadores + ", partidasJogadas=" + partidasJogadas + ", vitorias=" + vitorias + ", empates=" + empates + ", derrotas=" + derrotas + ", golsMarcados=" + golsMarcados + ", golContra=" + golContra + ", saldoGols=" + saldoGols + ", pontos=" + pontos + '}';
    }

    
    
    
    
}
