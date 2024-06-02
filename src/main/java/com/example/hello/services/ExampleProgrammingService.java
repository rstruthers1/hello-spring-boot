package com.example.hello.services;

import java.util.List;

public interface ExampleProgrammingService {
    String printListOfNumbers(List<Number> numbers);
    String printListOfEvenNumbers(List<Number> numbers);
    String printListOfOddNumbers(List<Number> numbers);
    String printListOfCourses(List<String> courses);
    String printListOfCoursesContainingString(List<String> courses, String search);
    String printListOfCoursesWithMinChars(List<String> courses, int minChars);
    String printSquaresOfEvenNumbers(List<Number> numberList1);
    String printCubesOfOddNumbers(List<Number> numbers);
    String printLengthOfCourseNames(List<String> courses);
}
