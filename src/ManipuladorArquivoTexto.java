
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class ManipuladorArquivoTexto {

    private static final String DEFAULT_CHARSET = "ISO-8859-1"; //Mais utilizados: "ISO-8859-1" (Windows) e "UTF8" (UNIX);
    private static final String DELIMITADOR = ";"; //Mais utilizados: espaço (" "), Tabulação ("\t"), vírgula (",") e ponto e vírgula (";")

    public static void escrever(String linha, String nomeArquivo) {

        BufferedWriter bw = null;
        final boolean ADICIONAR_AO_FINAL = false;

        try {

            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nomeArquivo, ADICIONAR_AO_FINAL), DEFAULT_CHARSET));
            bw.write(linha);
            bw.newLine();
            bw.flush();
        } catch (UnsupportedEncodingException ex1) {
            System.out.println(ex1.getMessage());
        } catch (FileNotFoundException ex2) {
            System.out.println(ex2.getMessage());
        } catch (IOException ex3) {
            System.out.println(ex3.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close(); //tenta fechar o arquivo
                } catch (IOException e) {
                    System.out.println("Erro ao tentar fechar o arquivo. Motivo: " + e.getMessage());
                }
            }
        }
    }

    public static String ler(final String nomeArquivo) {

        BufferedReader br = null;

        try {

            br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(nomeArquivo)), DEFAULT_CHARSET));

            String conteudo = br.readLine(); // tenta ler a linha

            // Testa se existe uma linha a ser lida
            if (conteudo != null) {
                return conteudo;
            }
        } catch (UnsupportedEncodingException ex1) {
            System.out.println(ex1.getMessage());
        } catch (FileNotFoundException ex2) {
            System.out.println(ex2.getMessage());
        } catch (IOException ex3) {
            System.out.println(ex3.getMessage());
        } finally {

            if (br != null) {
                try {
                    br.close(); //tenta fechar o arquivo
                } catch (IOException e) {
                    System.out.println("Erro ao tentar fechar o arquivo. Motivo: " + e.getMessage());
                }
            }
        }
        return null;
    }
}
