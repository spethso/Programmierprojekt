package de.phl.programmingproject.enrollmentsystem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Course {

    private final String name;
    final Set<Enrollment> enrollments;

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
        this.enrollments = new HashSet<>();
    }

    public String getInfo() {
        return String.format(
                "Name: %s, Students: [%s]",
                name,
                this.enrollments.stream()
                        .map(Enrollment::getStudent)
                        .map(Student::getName)
                        .collect(Collectors.joining(", ")));
    }

    /**
     * Enrolls the given student to this course.
     * @param student The student to enroll.
     * @throws IllegalArgumentException If the student is null or already enrolled.
     */
    public Enrollment enroll(final Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student must not be null and must not be enrolled already");
        }
        return new Enrollment(student, this);
    }

    /**
     * Drops the given student from this course.
     * @param student The student to drop.
     * @throws IllegalArgumentException If the student is null or not enrolled.
     */
    public void drop(final Student student) {
        if (student == null || !this.isStudentEnrolled(student)) {
            throw new IllegalArgumentException("Student must not be null and must be enrolled already");
        }
        this.enrollments.removeIf(enrollment -> enrollment.getStudent().equals(student));
        if (student.isEnrolledIn(this)) {
            student.drop(this);
        }
    }

    /**
     * Checks if the student is enrolled in this course.
     * @param student The student to check for enrollment.
     * @return true if the student is enrolled in this course, otherwise false.
     * @throws IllegalArgumentException If the student is null
     */
    public boolean isStudentEnrolled(final Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student must not be null");
        }
        return this.enrollments.stream()
                .anyMatch(enrollment -> enrollment.getStudent().equals(student));
    }

    /**
     * Gets the list of students which are enrolled in this course.
     * @return The enrolled students.
     */
    public List<Student> getStudents() {
        return this.enrollments.stream().map(Enrollment::getStudent).toList();
    }

    /**
     * Gets the name the course.
     * @return The name of the Course.
     */
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getInfo();
    }
}
