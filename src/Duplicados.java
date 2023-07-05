import java.util.ArrayList;
import java.util.Scanner;

public class Duplicados
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();

        System.out.println("Ingrese una lista de palabras (ingrese 'listo' para finalizar):");
        String palabra = scanner.nextLine();

        while (!palabra.equals("listo"))
        {
            if (!lista.contains(palabra))
            {
                lista.add(palabra);
            }
            palabra = scanner.nextLine();
        }

        System.out.println("Lista de palabras únicas:");
        for (String unica : lista)
        {
            System.out.println(unica);
        }
    }
}
