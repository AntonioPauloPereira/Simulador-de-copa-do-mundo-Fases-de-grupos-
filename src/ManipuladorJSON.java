import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author 2112605
 */
public class ManipuladorJSON {
    
    // ==========================================
    // MÉTODOS PARA CONFRONTOS (Seu código atual)
    // ==========================================
    
    public static String converterObjetoParaJson(Confronto a1) {
        Gson conversor = new Gson();
        String arquivoJSON = conversor.toJson(a1);
        return arquivoJSON;
    }
    
    public static Confronto converterJsonParaObjeto(String arquivoJSON) {
        Gson conversor = new Gson();
        Confronto a1 = conversor.fromJson(arquivoJSON, Confronto.class);
        return a1;
    }
    
    public static String converterListaParaJSON(ArrayList<Confronto> lista) {
        Gson conversor = new Gson();
        return conversor.toJson(lista);
    }
    
    public static ArrayList<Confronto> converterJsonParaLista(String arquivoJSON) {
        Gson conversor = new Gson();
        Type tipoLista = new TypeToken<ArrayList<Confronto>>() {}.getType();
        ArrayList<Confronto> lista = conversor.fromJson(arquivoJSON, tipoLista);
        return lista;
    }
    
    // ==========================================
    // MÉTODOS PARA GRUPOS (Adicione este bloco)
    // ==========================================
    
    // Transforma a lista de Grupos em texto JSON
    public static String converterListaGrupoParaJSON(ArrayList<Grupo> lista) {
        Gson conversor = new Gson();
        return conversor.toJson(lista);
    }
    
    // Transforma o texto JSON de volta em uma lista de Grupos
    public static ArrayList<Grupo> converterJsonParaListaGrupo(String arquivoJSON) {
        Gson conversor = new Gson();
        Type tipoLista = new TypeToken<ArrayList<Grupo>>() {}.getType();
        ArrayList<Grupo> lista = conversor.fromJson(arquivoJSON, tipoLista);
        return lista;
    }
    // Transforma a lista de Seleções em texto JSON
public static String converterListaSelecoesParaJSON(ArrayList<Selecoes> lista) {
    Gson conversor = new Gson();
    return conversor.toJson(lista);
}

// Transforma o texto JSON de volta em uma lista de Seleções
public static ArrayList<Selecoes> converterJsonParaListaSelecoes(String arquivoJSON) {
    Gson conversor = new Gson();
    Type tipoLista = new TypeToken<ArrayList<Selecoes>>() {}.getType();
    ArrayList<Selecoes> lista = conversor.fromJson(arquivoJSON, tipoLista);
    return lista;
}
}