
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author 2112605
 */
public class ManipuladorJSON {
    
    public static String converterObjetoParaJson(Aluno a1) {
        
        Gson conversor = new Gson();
        String arquivoJSON = conversor.toJson(a1);
        return arquivoJSON;
    }
    
    public static Aluno converterJsonParaObjeto(String arquivoJSON) {
        
        Gson conversor = new Gson();
        Aluno a1 = conversor.fromJson(arquivoJSON, Aluno.class);
        return a1;
    }
    
    public static String converterListaParaJSON(ArrayList<Aluno> lista) {
        Gson conversor = new Gson();
        return conversor.toJson(lista);
    }
    
    public static ArrayList<Aluno> converterJsonParaLista(String arquivoJSON) {
        Gson conversor = new Gson();
        Type tipoLista = new TypeToken<ArrayList<Aluno>>() {}.getType();
        ArrayList<Aluno> lista = conversor.fromJson(arquivoJSON, tipoLista);
        return lista;
    }
    
}
