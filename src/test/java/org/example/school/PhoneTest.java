package org.example.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneTest {

    @Test
    public void shouldNotCreatePhone(){
        assertThrows(IllegalArgumentException.class,
                () -> new Phone(null, null));
        assertThrows(IllegalArgumentException.class,
                () -> new Phone("23", "1"));
        assertThrows(IllegalArgumentException.class,
                () -> new Phone("1", "123456789"));
        assertThrows(IllegalArgumentException.class,
                () -> new Phone(null, "123456789"));
        assertThrows(IllegalArgumentException.class,
                () -> new Phone("55", null));
        assertThrows(IllegalArgumentException.class,
                () -> new Phone("a1", "123456789"));
        assertThrows(IllegalArgumentException.class,
                () -> new Phone("11", "12b4c6781"));
    }

    @Test
    public void shouldCreateAValidPhone(){
        Phone phone = new Phone("55", "123456789");
        assertEquals("55", phone.getDialingCode());
        assertEquals("123456789", phone.getNumber());
    }
}
