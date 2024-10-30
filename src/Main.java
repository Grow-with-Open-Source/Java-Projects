/*
 * @(#)<main.Java.java        <project-version> <2024/10/30>
 *
 * <Task management application>
 *
 * Built using <IntelliJ> IDE Version: <2023.2.5>
 * OpenJDK Runtime Environment <OpenJDK>-<17.0.9>
 *
 */

// Remaining code
import java.util.Scanner;

public class Main {
    // Definiowanie klasy
    public static class Pracownik {
        // Atrybuty
        String imie;
        String nazwisko;
        String stanowisko;

        // Metoda
        void pracuj() {
            System.out.println(imie + " " + nazwisko + " pracuje na stanowisku " + stanowisko + ".");
        }
    }

    // Użycie klasy
        public static void main(String[] args) {
            // Tworzenie obiektów (instancji) klasy Pracownik
            Pracownik pracus1 = new Pracownik();
            pracus1.imie = "Jan";
            pracus1.nazwisko = "Kowalski";
            pracus1.stanowisko = "Programista";

            Pracownik pracus2 = new Pracownik();
            pracus2.imie = "Anna";
            pracus2.nazwisko = "Nowak";
            pracus2.stanowisko = "Tester";

            // Wywoływanie metody
            pracus1.pracuj(); // "Jan Kowalski pracuje na stanowisku Programista."
            pracus2.pracuj(); // "Anna Nowak pracuje na stanowisku Tester."
        }
    }

