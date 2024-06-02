package com.example.hello.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("structuredProgrammingService")
public class StructuredProgrammingService implements ExampleProgrammingService {

    @Override
    public String printListOfNumbers(List<Number> numbers) {
        String code = """
                StringBuilder sb = new StringBuilder();
                // Focus on how to do it
                for (Number number : numbers) {
                    sb.append(number).append("\\n");
                }
                """; // Java 15 text block

        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");
        // Focus on how to do it
        for (Number number : numbers) {
            sb.append(number).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String printListOfEvenNumbers(List<Number> numbers) {
        String code = """
                StringBuilder sb = new StringBuilder();
                // Focus on how to do it
                for (Number number : numbers) {
                    if (number.intValue() % 2 == 0) {
                        sb.append(number).append("\\n");
                    }
                }
                """; // Java 15 text block

        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");
        // Focus on how to do it
        for (Number number : numbers) {
            if (number.intValue() % 2 == 0) {
                sb.append(number).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String printListOfOddNumbers(List<Number> numbers) {
        String code = """
                StringBuilder sb = new StringBuilder();
                // Focus on how to do it
                for (Number number : numbers) {
                    if (number.intValue() % 2 != 0) {
                        sb.append(number).append("\\n");
                    }
                }
                """; // Java 15 text block

        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");
        // Focus on how to do it
        for (Number number : numbers) {
            if (number.intValue() % 2 != 0) {
                sb.append(number).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String printListOfCourses(List<String> courses) {
        String code = """
        StringBuilder sb = new StringBuilder();
        // Focus on how to do it
        for (String course : courses) {
            sb.append(course).append("\\n");
        }
        """; // Java 15 text block
        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");
        // Focus on how to do it
        for (String course : courses) {
            sb.append(course).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String printListOfCoursesContainingString(List<String> courses, String search) {
        String code = """
        StringBuilder sb = new StringBuilder();
        // Focus on how to do it
        for (String course : courses) {
            if (course.contains(search)) {
                sb.append(course).append("\\n");
            }
        }
        """; // Java 15 text block
        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");
        // Focus on how to do it
        for (String course : courses) {
            if (course.contains(search)) {
                sb.append(course).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String printListOfCoursesWithMinChars(List<String> courses, int minChars) {
        String code = """
        StringBuilder sb = new StringBuilder();
        // Focus on how to do it
        for (String course : courses) {
            if (course.length() >= minChars) {
                sb.append(course).append("\\n");
            }
        }
        """; // Java 15 text block
        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");
        // Focus on how to do it
        for (String course : courses) {
            if (course.length() >= minChars) {
                sb.append(course).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String printSquaresOfEvenNumbers(List<Number> numberList1) {
        String code = """
            StringBuilder sb = new StringBuilder();
            // Focus on how to do it
            for (Number number : numberList1) {
                if (number.intValue() % 2 == 0) {
                    sb.append(number.intValue() * number.intValue()).append("\\n");
                }
            }
            """; // Java 15 text block
        StringBuilder sb = new StringBuilder();
        sb.append(code).append("\n");
        // Focus on how to do it
        for (Number number : numberList1) {
            if (number.intValue() % 2 == 0) {
                sb.append(number.intValue() * number.intValue()).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String printCubesOfOddNumbers(List<Number> numbers) {
        String code = """
                StringBuffer sb = new StringBuffer();
                for (Number number: numbers) {
                    if (number.intValue() % 2 != 0) {
                        sb.append(number.intValue() * number.intValue() * number.intValue()).append("\\n");
                    }
                }
                """;
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        for (Number number: numbers) {
            if (number.intValue() % 2 != 0) {
                sb.append(number.intValue() * number.intValue() * number.intValue()).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String printLengthOfCourseNames(List<String> courses) {
        String code = """
                StringBuilder sb = new StringBuilder();
                for (String course: courses) {
                    if (course == null) {
                       sb.append(null + ": " + 0);
                   } else {
                       sb.append(course + ": " + course.length() + "\\n");
                   }
                }
                """;
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        for (String course: courses) {
            if (course == null) {
                sb.append("null").append(": ").append(0);
            } else {
                sb.append(course).append(": ").append(course.length()).append("\n");
            }
        }
        return sb.toString();
    }
}
