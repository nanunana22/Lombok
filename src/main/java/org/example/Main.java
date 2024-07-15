package org.example;

//Schritt 5: Schreiben Sie eine "Main"-Klasse, in der Sie einige Beispiele für die Erstellung von Schülern, Lehrern und Kursen unter Verwendung der Konstruktoren anwenden.
//Schritt 6: Prüfen Sie in der "Main"-Klasse, ob die generierten Lombok-Methoden korrekt funktionieren (getter, setter, toString, ...).
//Schritt 1: Fügen Sie das Builder-Muster zu allen Entitäten hinzu und erstellen Sie zusätzliche Objekte mit dem Builder in der Hauptmethode.
//Schritt 2: Verwenden Sie die With-Annotation, um das Ändern von Eigenschaften zu erleichtern.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(2,"Linda","München",2);
        Student student2 = new Student(3,"Laura", "Erlangen", 1);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        System.out.println(studentList);
        System.out.println(student2.getName());

        Teacher teacher = new Teacher(22, "Mrs. Pam", "Math");
        Teacher teacher2 = new Teacher(33, "Mrs. Finn", "English");
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher);
        teacherList.add(teacher2);
        System.out.println(teacher.name());
        System.out.println(teacherList);

        Course myCourse = new Course(1, "2024", teacher, studentList);
        System.out.println(myCourse);




    }
}