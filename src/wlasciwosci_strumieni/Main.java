package wlasciwosci_strumieni;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Adam", "Ewa", "Kamil", "Magda", "Piotr", "Patrycja");

        System.out.println("Wyswietlanie zawartosci listy przy uzyciu wyrazenia lambda.");

        imiona.stream().forEach(s -> System.out.println(s)); //wyrazenie lambda

        System.out.println("");

        System.out.println("Wyswietlenie listy z wykorzystaniem referencji do metody.");

        imiona.stream().forEach(System.out::println); //referencja do metody
    }
}
