package de.phl.programmingproject.enrollmentsystem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Student {
    private final String name;
    private final String id;
    final Set<Enrollment> enrollments = new HashSet<>();

    /**
     * Creates a new student with the given name and id.
     * @param name The name of the student.
     * @param id The id of the student.
     * @throws IllegalArgumentException If the name is null or empty or the id is null or empty.
     */
    public Student(final String name, final String id) {
        if (name == null || name.isEmpty() || id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty");
        }
        this.name = name;
        this.id = id;
    }

    public String getInfo() {
        return String.format(
                "Name: %s, ID: %s, Courses: [%s]",
                name,
                id,
                enrollments.stream()
                        .map(Enrollment::getCourse)
                        .map(Course::getName)
                        .collect(Collectors.joining(", ")));
    }

    /**
     * Enrolls the student to the given course.
     * @param course The course to enroll to.
     * @throws IllegalArgumentException If the course is null.
     */
    public Enrollment enroll(final Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Course must not be null");
        }
        return course.enroll(this);
    }

    /**
     * Checks if the student is enrolled in a specific course.
     * @param course The course for which to check if the student is enrolled at
     * @return true if the student is enrolled in the provided course, otherwise false.
     * @throws IllegalArgumentException If the course is null.
     */
    public boolean isEnrolledIn(final Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Course must not be null");
        }
        return this.enrollments.stream()
                .anyMatch(enrollment -> enrollment.getCourse().equals(course));
    }

    /**
     * Drops the student from the given course.
     * @param course The course to drop from.
     * @throws IllegalArgumentException If the course is null, or the student is not enrolled in the course.
     */
    public void drop(final Course course) {
        if (course == null || !this.isEnrolledIn(course)) {
            throw new IllegalArgumentException("Course must not be null, and this student must be enrolled already");
        }
        this.enrollments.removeIf(enrollment -> enrollment.getCourse().equals(course));
        if (course.isStudentEnrolled(this)) {
            course.drop(this);
        }
    }

    /**
     * Gets a list of all courses this student is enrolled in.
     * @return The courses this student is enrolled in.
     */
    public List<Course> getCourses() {
        return this.enrollments.stream().map(Enrollment::getCourse).toList();
    }

    /**
     * Gets the name of this student.
     * @return The name of this student.
     */
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getInfo();
    }
}
