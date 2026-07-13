import java.time.LocalDateTime;

public class Confronto {
    
    private String selecaoA;
    private String selecaoB;
    private String goalsA;
    private String goalsB;
    private String local;
    private LocalDateTime dataHoraConfronto;
   
    //Getters

    public String getSelecaoA() {
        return selecaoA;
    }

    public String getSelecaB() {
        return selecaoB;
    }

    public String getGoalsA() {
        return goalsA;
    }

    public String getGoalsB() {
        return goalsB;
    }

    public String getLocal() {
        return local;
    }

    public LocalDateTime getDataHoraConfronto() {
        return dataHoraConfronto;
    }
    
    //Setters

    public void setSelecaoA(String selecaoA) {
        this.selecaoA = selecaoA;
    }

    public void setSelecaB(String selecaoB) {
        this.selecaoB = selecaoB;
    }

    public void setGoalsA(String goalsA) {
        this.goalsA = goalsA;
    }

    public void setGoalsB(String goalsB) {
        this.goalsB = goalsB;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setDataHoraConfronto(LocalDateTime dataHoraConfronto) {
        this.dataHoraConfronto = dataHoraConfronto;
    }

    //Construtores

    public Confronto(String selecaoA, String selecaoB, String goalsA, String goalsB, String local, LocalDateTime dataHoraConfronto) {
        this.selecaoA = selecaoA;
        this.selecaoB = selecaoB;
        this.goalsA = goalsA;
        this.goalsB = goalsB;
        this.local = local;
        this.dataHoraConfronto = dataHoraConfronto;
    }
    
    public Confronto(){};

    //ToString

    @Override
    public String toString() {
        return "Selecao A: " + selecaoA + "\nSelecao B: " + selecaoB + "\nGoals A: " + goalsA + "\nGoals B: " + goalsB + "\nLocal: " + local + "\nData e hora do confronto: " + dataHoraConfronto;
    }
    
    
}

