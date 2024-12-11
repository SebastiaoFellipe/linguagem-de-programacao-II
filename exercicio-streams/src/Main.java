import java.util.*;
import java.util.stream.Collectors;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> listaNomes = Arrays.asList("Ana", "Carlos", "Francisco", "Chagas", "Eduardo", "Fábio", "Baltazar", "Gaspar", "Fred", "Bela");
        List<String> novaListaNomes = listaNomes.stream()
            .filter(nome -> nome.length() > 5)
            .sorted()
            .collect(Collectors.toList());
        System.out.println(novaListaNomes);

        System.out.println("----------------------------------------");

        List<Integer> listaNumeros = Arrays.asList(10, 15, 22, 37, 45, 56, 87, 92, 98, 99, 101, 110);
        List<Integer> listaNumerosPares = listaNumeros.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        List<Integer> listaNumerosImpares = listaNumeros.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        System.out.print("Números pares: "+listaNumerosPares);
        System.out.println("\nNúmeros ímpares: "+listaNumerosImpares);

        System.out.println("----------------------------------------");

        String frase = "programacao em java";

        Map<Character, Long> contagem = frase.chars()
            .filter(c -> c != ' ')
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        List<Character> caracteresUnicos = contagem.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .sorted()
            .collect(Collectors.toList());
        System.out.println(caracteresUnicos);
    }
}