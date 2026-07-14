public class Selecoes {
    private int id;
    private String nome;
    private int titulos;
    private boolean est;
    private int npart;
    private String mposi;
    private String fatoin;
   
    public Selecoes() {

    }
     
    public Selecoes(String nome, int titulos, boolean est, int npart, String mposi, String fatoin) {
        this.nome = nome;
        this.titulos = titulos;
        this.est = est;
        this.npart = npart;
        this.mposi = mposi;
        this.fatoin = fatoin;
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
        return est;
    }

    public void setEst(boolean est) {
        this.est = est;
    }

    public int getNpart() {
        return npart;
    }

    public void setNpart(int npart) {
        this.npart = npart;
    }

    public String getMposi() {
        return mposi;
    }

    public void setMposi(String mposi) {
        this.mposi = mposi;
    }

    public String getFatoin() {
        return fatoin;
    }

    public void setFatoin(String fatoin) {
        this.fatoin = fatoin;
    }

    @Override
    public String toString() {
        return "Selecao{" 
        + " ID=" + id 
        + "\n Nome=" + nome 
        + "\n Titulos: " + titulos 
        + "\n Estreante? " + est 
        + "\n Numero de participacoes: " + npart 
        + "\n Maior posicao obtida: " + mposi 
        + "\n Fato interresante: " + fatoin + '}';
    }
    
}