import java.util.List;

public class Grupo {
    
    private String nome;
    private List<String> selecoes;

    //Getters
    
    public String getNome() {
        return nome;
    }

    public List<String> getSelecoes() {
        return selecoes;
    }
    
    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSelecoes(List<String> selecoes) {
        this.selecoes = selecoes;
    }
    
    //Construtores

    public Grupo(String nome, List<String> selecoes) {
        this.nome = nome;
        this.selecoes = selecoes;
    }
    
    public Grupo(){}
    
    //ToString

    @Override
    public String toString() {
        return  "\nNome: " + nome + "\nSelecoes: " + selecoes;
    }
    
    
}
