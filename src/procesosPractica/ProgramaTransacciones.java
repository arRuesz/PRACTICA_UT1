package procesosPractica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaTransacciones {
    private static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el nombre del archivo(sin la extensión): ");
        String nombreArchivo = entrada.nextLine();
        System.out.println("¿Cuántos procesos quieres?");
        int numProcesos = entrada.nextInt();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo + ".csv"))) {
         String linea;
         List<String> listaPersonas = new ArrayList<>();
         while ((linea = br.readLine())!= null){
            listaPersonas.add(linea);
         }
            listaPersonas.removeFirst();
            System.out.println(listaPersonas);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
