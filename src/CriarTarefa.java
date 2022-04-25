import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class CriarTarefa {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inclua uma nova tarefa: ");
        String novaTarefa = scan.nextLine();
        System.out.println(novaTarefa);

        FileWriter arquivo = new FileWriter("c:\\Users\\babih\\crud_estudo.txt");
        PrintWriter gravarArquivo = new PrintWriter(arquivo);

        gravarArquivo.printf("--- Lista de Tarefas ---%n");
        gravarArquivo.println(novaTarefa);
        gravarArquivo.printf("--- Fim Tarefas ---%n");

        arquivo.close();

        System.out.println("\nA lista de tarefas foi gravada com sucesso em c:\\Users\\babih\\crud_estudo.txt");

    }
}
