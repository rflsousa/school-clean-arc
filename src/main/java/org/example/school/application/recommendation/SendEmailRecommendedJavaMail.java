package org.example.school.application.recommendation;

import org.example.school.application.recommendation.SendEmailRecommend;
import org.example.school.domain.student.Student;

public class SendEmailRecommendedJavaMail implements SendEmailRecommend {
    @Override
    public void sendFor(Student recommended) {
        //lógic to send emails with Java Mail library
    }
}
