package Functional_Java_Interface;

import java.util.List;

public class Instructor {
    String name;
    String title;
    String gender;
    int years;
    boolean onlineCourse;
    List<String> course;

    public Instructor(String name, String title, String gender, int years, boolean onlineCourse, List<String> course) {
        this.name = name;
        this.title = title;
        this.gender = gender;
        this.years = years;
        this.onlineCourse = onlineCourse;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", years=" + years +
                ", onlineCourse=" + onlineCourse +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public boolean isOnlineCourse() {
        return onlineCourse;
    }

    public void setOnlineCourse(boolean onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }
}
