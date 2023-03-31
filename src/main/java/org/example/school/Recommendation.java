package org.example.school;

public class Recommendation {

    private Student recommended;
    private Student recommend;

    public Recommendation(Student recommended, Student recommend) {
        this.recommended = recommended;
        this.recommend = recommend;
    }

    public Student getRecommended() {
        return recommended;
    }

    public void setRecommended(Student recommended) {
        this.recommended = recommended;
    }

    public Student getRecommend() {
        return recommend;
    }

    public void setRecommend(Student recommend) {
        this.recommend = recommend;
    }
}
