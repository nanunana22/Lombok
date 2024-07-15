package org.example;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
//Schritt 1: Fügen Sie die Lombok-Abhängigkeit zu Ihrem Projekt hinzu und konfigurieren Sie IntelliJ für die Unterstützung von Lombok.
//Schritt 2: Erstellen Sie eine einfache Klasse "Student" mit den folgenden Attributen: id, name, address, grade.
//Schritt 2.5: Verwenden Sie die entsprechenden Lombok-Annotationen, um Getter, Setter, Equals, HashCode, toString und Konstruktoren für die Entität zu erzeugen.


@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private String adress;
    private int grade;


//    public Student(int id, String name, String adress, int grade) {
//        this.id = id;
//        this.name = name;
//        this.adress = adress;
//        this.grade = grade;
//    }

}
