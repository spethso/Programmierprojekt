package de.phl.programmingproject.enrollmentsystem;

public class Student {
    private final String name;
    private final String id;

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
        return String.format("Name: %s, ID: %s", name, id);
    }

    /**
     * Enrolls the student to the given course.
     * @param course The course to enroll to.
     * @throws IllegalArgumentException If the course is null.
     */
    public void enroll(final Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Course must not be null");
        }
        course.enroll(this);
    }

    /**
     * Drops the student from the given course.
     * @param course The course to drop from.
     * @throws IllegalArgumentException If the course is null.
     */
    public void drop(final Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Course must not be null");
        }
        course.drop(this);
    }
}
