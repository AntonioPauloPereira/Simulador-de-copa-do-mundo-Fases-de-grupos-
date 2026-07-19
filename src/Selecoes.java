public class Selecoes {
    private int id;
    private String nome;
    private int titulos;
    private boolean estreante;
    private int participacoes;
    private String MelhorColoc;
    private String curiosidade;
   
    public Selecoes() {

    }
     
    public Selecoes(String nome, int titulos, boolean estreante, int participacoes, String MelhorColoc, String curiosidade) {
        this.nome = nome;
        this.titulos = titulos;
        this.estreante = estreante;
        this.participacoes = participacoes;
        this.MelhorColoc = MelhorColoc;
        this.curiosidade = curiosidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public boolean isEst() {
        return estreante;
    }

    public void setEst(boolean estreante) {
        this.estreante = estreante;
    }

    public int getNpart() {
        return participacoes;
    }

    public void setNpart(int participacoes) {
        this.participacoes = participacoes;
    }

    public String getMposi() {
        return MelhorColoc;
    }

    public void setMposi(String MelhorColoc) {
        this.MelhorColoc = MelhorColoc;
    }

    public String getFatoin() {
        return curiosidade;
    }

    public void setFatoin(String curiosidade) {
        this.curiosidade = curiosidade;
    }

    @Override
    public String toString() {
        return "Selecao{" 
        + " ID=" + id 
        + "\n Nome=" + nome 
        + "\n Titulos: " + titulos 
        + "\n Estreante? " + estreante 
        + "\n Numero de participacoes: " + participacoes 
        + "\n Maior posicao obtida: " + MelhorColoc 
        + "\n Fato interresante: " + curiosidade + '}';
    }
    
}