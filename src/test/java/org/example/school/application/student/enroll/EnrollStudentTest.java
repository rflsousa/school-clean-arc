package org.example.school.application.student.enroll;

import org.example.school.domain.student.Document;
import org.example.school.domain.student.Student;
import org.example.school.infrastructure.student.StudentRepositoryInMemory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnrollStudentTest {

    @Test
    void shouldEnrollStudent(){
        StudentRepositoryInMemory repository = new StudentRepositoryInMemory();
        EnrollStudent useCase = new EnrollStudent(repository);

        EnrollStudentDto studentDto = new EnrollStudentDto(
                "Peter",
                "123.456.789-00",
                "peterp@email.com"
        );

        useCase.execute(studentDto);

        Student student = repository.findByDocument(new Document("123.456.789-00"));

        assertEquals("Peter", student.getName());
        assertEquals("123.456.789-00", student.getDocument());
        assertEquals("peterp@email.com", student.getEmail());
    }
}