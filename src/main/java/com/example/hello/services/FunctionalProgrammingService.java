package com.example.hello.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("functionalProgrammingService")
public class FunctionalProgrammingService implements ExampleProgrammingService {

    @Override
    public String printListOfNumbers(List<Number> numbers) {
        String code = """
           StringBuilder sb = new StringBuilder();
           // Focus on what to do, not how to do it
           // First, stream the numbers
           numbers.stream()
               // What to do with each number
               .forEach(number -> sb.append(number).append("\\n"))
           """; // Java 15 text block


        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");
        // Focus on what to do, not how to do it
        // First, stream the numbers
        numbers.stream()
            // What to do with each number
            .forEach(number -> sb.append(number).append("\n"));
        return sb.toString();
    }

    @Override
    public String printListOfEvenNumbers(List<Number> numbers) {
        String code = """
               StringBuilder sb = new StringBuilder();
                // Focus on what to do, not how to do it
                // First, stream the numbers
                numbers.stream()
                    // Only allow even numbers
                    .filter(number -> number.intValue() % 2 == 0)
                    // What to do with the numbers that are left
                    .forEach(number -> sb.append(number).append("\\n"));
               """; // Java 15 text block

        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");
        // Focus on what to do, not how to do it
        // First, stream the numbers
        numbers.stream()
            // Filter the numbers: only allow even numbers
            .filter(number -> number.intValue() % 2 == 0)
            // What to do with the numbers that are left
            .forEach(number -> sb.append(number).append("\n"));
        return sb.toString();
    }

    @Override
    public String printListOfOddNumbers(List<Number> numbers) {
        String code = """
            StringBuilder sb = new StringBuilder();
            // Focus on what to do, not how to do it
            // First, stream the numbers
            numbers.stream()
                // Only allow odd numbers
                .filter(number -> number.intValue() % 2 != 0)
                // What to do with the numbers that are left
                .forEach(number -> sb.append(number).append("\\n"));
            """; // Java 15 text block
        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");
        // Focus on what to do, not how to do it
        // First, stream the numbers
        numbers.stream()
                // Only allow odd numbers
                .filter(number -> number.intValue() % 2 != 0)
                // What to do with the numbers that are left
                .forEach(number -> sb.append(number).append("\n"));
        return sb.toString();
    }

    @Override
    public String printListOfCourses(List<String> courses) {
        String code = """
            StringBuilder sb = new StringBuilder();
            // Focus on what to do, not how to do it
            // First, stream the courses
            courses.stream()
                // What to do with each course
                .forEach(course -> sb.append(course).append("\\n"));
            """; // Java 15 text block
        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");
        // What to do with the list of numbers: create a stream of numbers
        courses.stream()
                // What to do with each number
                .forEach(course -> sb.append(course).append("\n"));
        return sb.toString();
    }

    @Override
    public String printListOfCoursesContainingString(List<String> courses, String search) {
        String code =
            """
            StringBuilder sb = new StringBuilder();
            // Focus on what to do, not how to do it
            // First, stream the courses
            courses.stream()
                // Only allow courses that contain the search string
                .filter(course -> course != null && course.contains(search))
                // What to do with the courses that are left
                .forEach(course -> sb.append(course).append("\\n"));
            """; // Java 15 text block
        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");
        // Focus on what to do, not how to do it
        // First, stream the courses
        courses.stream()
                // Only allow courses that contain the search string
                .filter(course -> course != null && course.contains(search))
                // What to do with the courses that are left
                .forEach(course -> sb.append(course).append("\n"));
        return sb.toString();
    }

    @Override
    public String printListOfCoursesWithMinChars(List<String> courses, int minChars) {
        String code = """
            StringBuilder sb = new StringBuilder();
            // Focus on what to do, not how to do it
            // First, stream the courses
            courses.stream()
                // Only allow courses that have at least minChars characters
                .filter(course -> course.length() >= minChars)
                // What to do with the courses that are left
                .forEach(course -> sb.append(course).append("\\n"));
            """;
        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");
        // Focus on what to do, not how to do it
        // First, stream the courses
        courses.stream()
                // Only allow courses that have at least minChars characters
                .filter(course -> course.length() >= minChars)
                // What to do with the courses that are left
                .forEach(course -> sb.append(course).append("\n"));
        return sb.toString();
    }

    @Override
    public String printSquaresOfEvenNumbers(List<Number> numbers) {
        String code = """
            numbers.stream()
                .filter(number -> number.intValue() % 2 == 0)
                .map(number -> number.intValue() * number.intValue())
                .forEach(number -> sb.append(number).append("\\n"));
            """;
        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");

        numbers.stream()
                .filter(number -> number.intValue() % 2 == 0)
                .map(number -> number.intValue() * number.intValue())
                .forEach(number -> sb.append(number).append("\n"));

        return sb.toString();
    }

    @Override
    public String printCubesOfOddNumbers(List<Number> numbers) {
        String code = """
                numbers.stream()
                        .filter(number -> number.intValue() %2 != 0)
                        .map(number -> number.intValue() * number.intValue() * number.intValue())
                        .forEach(number -> sb.append(number).append("\\n"));
                """;
        StringBuffer sb = new StringBuffer();
        sb.append(code);
        numbers.stream()
                .filter(number -> number.intValue() %2 != 0)
                .map(number -> number.intValue() * number.intValue() * number.intValue())
                .forEach(number -> sb.append(number).append("\n"));
        return sb.toString();
    }

    @Override
    public String printLengthOfCourseNames(List<String> courses) {
        String code = """
                StringBuilder sb = new StringBuilder();
                courses.stream()
                        .map(course -> course == null ? null + ": " + 0 : course + ": " + course.length())
                        .forEach(courseNameLength -> sb.append(courseNameLength).append("\\n"));
                """;
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        courses.stream()
                .map(course -> course == null ? null + ": " + 0 : course + ": " + course.length())
                .forEach(courseNameLength -> sb.append(courseNameLength).append("\n"));
        return sb.toString();
    }
}
