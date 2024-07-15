package org.example;
//Schritt 4: Erstellen Sie eine Klasse Course mit den folgenden Attributen: id, name, teacher, students.
//Schritt 4.5: Verwenden Sie die entsprechenden Lombok-Annotationen, um Getter, Setter, Equals, HashCode, toString und Konstruktoren für die Entität zu erzeugen.

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Course {
    int id;
    String name;
    Teacher teacher;
    List<Student> students = new ArrayList<>();
}
