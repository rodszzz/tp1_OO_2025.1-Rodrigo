package sigaa2;

import java.io.*;
import java.util.*;

public class Main {

    private static final String bancoAlunos = "bancoAlunos.csv";

    public static void main(String[] args) {
        Alunos aluno = new Alunos();

        aluno.setNome("Rodrigo S");
        aluno.setMatricula(242028870);

        aluno.darOi();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(bancoAlunos, true))) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.println("Matricula: ");
            String matricula = scanner.nextLine();

            // botando vírgulas para dar espaço
            String linha = String.join(",", nome, matricula);
            writer.write(linha);
            writer.newLine();

        } catch (IOException e) { // pegar excessões e printar
            System.out.println("Erro ao gravar os dados do aluno");
            e.printStackTrace();
        }

        System.out.println("Dados do csv...");

        try (BufferedReader reader = new BufferedReader(new FileReader(bancoAlunos))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(", ");
                System.out.println(Arrays.toString(campos));
        }
        } catch (IOException e) {
            System.out.println("Erro ao ler os dados do csv");
            e.printStackTrace();
        }

    }
}
