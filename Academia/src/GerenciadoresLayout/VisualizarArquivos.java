package GerenciadoresLayout;

import java.io.File;
import java.io.IOException;

public class VisualizarArquivos {
    private String diretorio = "e:\\Antigos";
    public VisualizarArquivos() throws IOException {

        File file = new File(diretorio);
        File afile[] = file.listFiles();
        int i = 0;
        for (int j = afile.length; i < j; i++) {
            File arquivos = afile[i];
            System.out.println(arquivos.getName());
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            VisualizarArquivos v = new VisualizarArquivos();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
