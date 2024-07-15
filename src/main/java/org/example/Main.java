package org.example;

//Schritt 5: Schreiben Sie eine "Main"-Klasse, in der Sie einige Beispiele für die Erstellung von Schülern, Lehrern und Kursen unter Verwendung der Konstruktoren anwenden.
//Schritt 6: Prüfen Sie in der "Main"-Klasse, ob die generierten Lombok-Methoden korrekt funktionieren (getter, setter, toString, ...).
//Schritt 1: Fügen Sie das Builder-Muster zu allen Entitäten hinzu und erstellen Sie zusätzliche Objekte mit dem Builder in der Hauptmethode.
//Schritt 2: Verwenden Sie die With-Annotation, um das Ändern von Eigenschaften zu erleichtern.

public class Main {
    public static void main(String[] args) {
        Student students = new Student();
        System.out.println(students.getName());

    }
}