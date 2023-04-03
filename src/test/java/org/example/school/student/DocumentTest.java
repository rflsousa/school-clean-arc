package org.example.school.student;

import org.example.school.domain.recommendation.student.Document;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DocumentTest {

    @Test
    public void shouldNoteCreateDocument(){
        assertThrows(IllegalArgumentException.class,
                () -> new Document(""));
        assertThrows(IllegalArgumentException.class,
                () -> new Document(null));
        assertThrows(IllegalArgumentException.class,
                () -> new Document("asdfghjkl"));
        assertThrows(IllegalArgumentException.class,
                () -> new Document("123456789"));
    }

    @Test
    public void shouldCreateValidDocument(){
        Document document = new Document("123.456.789-00");
        assertEquals("123.456.789-00", document.getNumber());
    }
}
