package org.example.school.application.recommendation;

import org.example.school.domain.recommendation.student.Student;

public interface SendEmailRecommend {

    void sendFor(Student recommended);
}
