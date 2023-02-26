package de.phl.programmingproject.enrollmentsystem;

import java.util.LinkedList;
import java.util.List;

public class Course {

    private final String name;
    private final List<Student> students;

    /**
     * Creates a new course with the given name.
     * @param name The name of the course.
     * @throws IllegalArgumentException If the name is null or empty.
     */
    public Course(final String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty");
        }
        this.name = name;
        this.students = new LinkedList<>();
    }

    public String getInfo() {
        return String.format("Name: %s", name);
    }

    /**
     * Enrolls the given student to this course.
     * @param student The student to enroll.
     * @throws IllegalArgumentException If the student is null or already enrolled.
     */
    public void enroll(final Student student) {
        if (student == null || students.contains(student)) {
            throw new IllegalArgumentException("Student must not be null and must not be enrolled already");
        }
        students.add(student);
    }

    /**
     * Drops the given student from this course.
     * @param student The student to drop.
     * @throws IllegalArgumentException If the student is null or not enrolled.
     */
    public void drop(final Student student) {
        if (student == null || !students.contains(student)) {
            throw new IllegalArgumentException("Student must not be null and must be enrolled already");
        }
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

}
