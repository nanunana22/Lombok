package org.example;
import lombok.Data;
//Schritt 1: Fügen Sie die Lombok-Abhängigkeit zu Ihrem Projekt hinzu und konfigurieren Sie IntelliJ für die Unterstützung von Lombok.
//Schritt 2: Erstellen Sie eine einfache Klasse "Student" mit den folgenden Attributen: id, name, address, grade.
//Schritt 2.5: Verwenden Sie die entsprechenden Lombok-Annotationen, um Getter, Setter, Equals, HashCode, toString und Konstruktoren für die Entität zu erzeugen.


@Data
public class Student {
    private int id;
    private String name;
    private String adress;
    private int grade;

}
