
public class Jogador {
    
    //Atributos
    
    private int numero;
    private String nome;
    private String posicao;
    private String dataNascimento;
    private double altura;
    private double peso;
    private String pais;
    private String clubeAtual;

    //Getters
    
    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getPais() {
        return pais;
    }

    public String getClubeAtual() {
        return clubeAtual;
    }
    
    //Setters

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setClubeAtual(String clubeAtual) {
        this.clubeAtual = clubeAtual;
    }
    
    //Construtores

    public Jogador(int numero, String nome, String posicao, String dataNascimento, double altura, double peso, String pais, String clubeAtual) {
        this.numero = numero;
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.pais = pais;
        this.clubeAtual = clubeAtual;
    }
    
    public Jogador(){}
    
    // ToString

    @Override
    public String toString() {
        return 
        "Jogadores: " + nome + 
        "\nNumero: "+ numero +
        "\nPosicao: " + posicao +
        "\nData de nascimento: " + dataNascimento + 
        "\nAltura: " + altura + 
        "\nPeso: " + peso +
        "\nPais: " + pais +
        "\nClube atual: " + clubeAtual;
    }
    
    
    
}
