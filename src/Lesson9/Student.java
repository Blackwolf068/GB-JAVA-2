package Lesson9;

import java.util.List;

public class Student implements IStudent{
    private String name;
    private List<Course> courseList;

    public Student(String name, List<Course> courseList) {
        this.name = name;
        this.courseList = courseList;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseList;
    }
}
