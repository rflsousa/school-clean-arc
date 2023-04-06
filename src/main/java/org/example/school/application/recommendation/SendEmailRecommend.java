package org.example.school.application.recommendation;

import org.example.school.domain.student.Student;

public interface SendEmailRecommend {

    void sendFor(Student recommended);
}
