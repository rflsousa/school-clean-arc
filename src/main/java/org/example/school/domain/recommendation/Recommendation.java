package org.example.school.domain.recommendation;

import org.example.school.domain.student.Student;

import java.time.LocalDateTime;

public class Recommendation {

    private Student recommended;
    private Student recommend;
    private LocalDateTime recommendDate;

    public Recommendation(Student recommended, Student recommend) {
        this.recommended = recommended;
        this.recommend = recommend;
        this.recommendDate = LocalDateTime.now();
    }

    public Student getRecommended() {
        return recommended;
    }

    public Student getRecommend() {
        return recommend;
    }

    public LocalDateTime getRecommendDate() {
        return recommendDate;
    }
}
