package LogicaDeProgramacionJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class QuizDiccionario {
    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("manzana", "apple");
        diccionario.put("amarillo", "yellow");
        diccionario.put("libro", "book");
        diccionario.put("pelota", "ball");
        diccionario.put("naranja", "orange");
        diccionario.put("sol", "sun");
        diccionario.put("árbol", "tree");
        diccionario.put("mesa", "table");
        diccionario.put("ventana", "window");
        diccionario.put("agua", "water");
        diccionario.put("ordenador", "computer");
        diccionario.put("silla", "chair");
        diccionario.put("pescado", "fish");
        diccionario.put("cuchillo", "knife");
        diccionario.put("tenedor", "fork");
        diccionario.put("plato", "plate");

        // Obtener 5 palabras al azar del diccionario
        List<String> palabrasEspañol = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabrasEspañol);
        List<String> palabrasAzar = palabrasEspañol.subList(0, 5);

        // Pedir al usuario que ingrese la traducción al inglés de cada palabra
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;

        System.out.println("Traduce las siguientes palabras al inglés:");

        for (String palabraEspañol : palabrasAzar) {
            System.out.print(palabraEspañol + ": ");
            String respuestaUsuario = scanner.nextLine().trim();

            // Comprobar si la respuesta es correcta
            String traduccionCorrecta = diccionario.get(palabraEspañol);
            if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Respuesta incorrecta. La traducción correcta es: " + traduccionCorrecta);
            }
        }

        // Mostrar el resultado
        int respuestasIncorrectas = 5 - respuestasCorrectas;
        System.out.println("\nJuego terminado.");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }


}
