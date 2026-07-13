
public class Grupo {
    private String nome;
    private String selecoes;

    //Getters
    
    public String getNome() {
        return nome;
    }

    public String getSelecoes() {
        return selecoes;
    }
    
    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSelecoes(String selecoes) {
        this.selecoes = selecoes;
    }
    
    //Construtores

    public Grupo(String nome, String selecoes) {
        this.nome = nome;
        this.selecoes = selecoes;
    }
    
    public Grupo(){}
    
    //ToString

    @Override
    public String toString() {
        return  "Nome: " + nome + "\nSelecoes: " + selecoes;
    }
    
    
}
