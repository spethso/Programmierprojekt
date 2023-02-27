package de.phl.programmingproject.enrollmentsystem;

import java.util.Optional;

public class Enrollment {
    private final Student student;
    private final Course course;
    private Optional<Double> grade;

    /**
     * Creates a new enrollment with the given student and course.
     * @param student The student to enroll.
     * @param course The course to enroll to.
     * @throws IllegalArgumentException If the student or course is null or if the student is already enrolled in that course.
     */
    public Enrollment(final Student student, final Course course) {
        if (student == null || course == null) {
            throw new IllegalArgumentException("Student and course must not be null");
        }
        if (student.isEnrolledIn(course)) {
            throw new IllegalArgumentException("The student is already enrolled in the course");
        }
        this.student = student;
        this.course = course;
        student.enrollments.add(this);
        course.enrollments.add(this);
        this.grade = Optional.empty();
    }

    public String getInfo() {
        return String.format("Student: %s, Course: %s, Grade: %s", student.getName(), course.getName(), grade.isPresent() ? grade.get() : "N/A");
    }

    /**
     * Sets the grade of the enrollment.
     * @param grade The grade to set.
     * @throws IllegalArgumentException If the grade is not between 1.0 and 5.0.
     */
    public void setGrade(final double grade) {
        if (grade < 1.0 || grade > 5.0) {
            throw new IllegalArgumentException("Grade must be between 1.0 and 5.0");
        }
        this.grade = Optional.of(grade);
    }

    /**
     * Gets the enrolled student.
     * @return The enrolled student
     */
    public Student getStudent() {
        return this.student;
    }

    /**
     * Gets the associated course.
     * @return The associated course.
     */
    public Course getCourse() {
        return this.course;
    }
}
