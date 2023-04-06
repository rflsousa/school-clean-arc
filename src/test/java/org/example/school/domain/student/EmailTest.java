package org.example.school.domain.student;

import org.example.school.domain.student.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {

    @Test
    void shouldNotCreateInvalidEmail(){
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));
        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));
        assertThrows(IllegalArgumentException.class,
                () -> new Email("invalid email"));
    }

    @Test
    void shouldCreateValidEmail(){
        Email email = new Email("test@test.com");
        assertEquals("test@test.com", email.getAddress());
    }
}
