package Lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWork9 {

    public static List<Course> uniqCourses(List<Student> studentList) {
        List<Course> courseList;

        courseList = studentList.stream()
                .flatMap(x -> x.getAllCourses().stream())
                .distinct()
                .peek(x -> System.out.println(x.getName()))
                .collect(Collectors.toList());
        return courseList;
    }

    public static List<Student> topThree(List<Student> studentList) {
        List<Student> topThreeList;

        topThreeList = studentList.stream()
                .sorted((o1, o2) -> o2.getAllCourses().size() - o1.getAllCourses().size())
                .limit(3)
                .peek(x -> System.out.println(x.getName()))
                .collect(Collectors.toList());
        return topThreeList;
    }

    private static List<Student> studentsOfCourse (List<Student> studentList, Course course) {
        List<Student> students;

        students = studentList.stream()
                .filter(x -> x.getAllCourses().contains(course))
                .peek(x -> System.out.println(x.getName()))
                .collect(Collectors.toList());
        return students;
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        List<Course> courses;
        List<Student> topThreeList;
        List<Student> studOfCourse;

        Course course1 = new Course("course1");
        Course course2 = new Course("course2");
        Course course3 = new Course("course3");
        Course course4 = new Course("course4");
        Course course5 = new Course("course5");
        Course course6 = new Course("course6");

        students.add(new Student("Сергей", new ArrayList<>(Arrays.asList(course1, course2, course3, course4, course5, course6))));
        students.add(new Student("Пётр", new ArrayList<>(Arrays.asList(course1, course2, course3))));
        students.add(new Student("Василий", new ArrayList<>(Arrays.asList(course1, course2, course6))));
        students.add(new Student("Олег", new ArrayList<>(Arrays.asList(course5, course2, course4))));
        students.add(new Student("Татьяна", new ArrayList<>(Arrays.asList(course6, course4))));
        students.add(new Student("Ольга", new ArrayList<>(Arrays.asList(course1, course2))));
        students.add(new Student("Елена", new ArrayList<>(Arrays.asList(course1, course2, course3, course4, course5))));
        students.add(new Student("Степан", new ArrayList<>(Arrays.asList(course1, course2, course3, course4))));
        students.add(new Student("Наталья", new ArrayList<>(Arrays.asList(course4))));

        courses = uniqCourses(students);
        topThreeList = topThree(students);
        studOfCourse = studentsOfCourse(students, course6);
    }
}
