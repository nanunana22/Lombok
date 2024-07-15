package org.example;
import lombok.AllArgsConstructor;
import lombok.Data;
//Schritt 3: Erstellen Sie einen Teacher-Datensatz mit den folgenden Attributen: id, name, subject.


public record Teacher(int id, String name, String subject) {
}
