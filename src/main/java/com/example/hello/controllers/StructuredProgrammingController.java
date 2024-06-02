package com.example.hello.controllers;

import com.example.hello.services.ExampleProgrammingService;
import com.example.hello.services.HtmlWrapperService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/structured")
public class StructuredProgrammingController extends BasicProgrammingController {

    public StructuredProgrammingController(@Qualifier("structuredProgrammingService") ExampleProgrammingService programmingService,
                                           HtmlWrapperService htmlWrapperService) {
        super(programmingService, htmlWrapperService);
    }

    @GetMapping("/listNumbers")
    public String printListOfNumbers(@RequestParam Optional<String> oddOrEven) {
       return super.printListOfNumbers(oddOrEven);
    }

    @GetMapping("/listCourses")
    public String printListOfCourses(@RequestParam Optional<String> search) {
        return super.printListOfCourses(search);
    }

    @GetMapping("/listCourses/minChars/{minChars}")
    public String printListOfCoursesWithMinChars(@PathVariable Optional<Integer> minChars) {
        return super.printListOfCoursesWithMinChars(minChars);
    }

    @GetMapping("/listNumbers/evens/squares")
    public String printSquaresOfEvenNumbers() {
        return super.printSquaresOfEvenNumbers();
    }

    @GetMapping("/listNumbers/odds/cubes")
    public String printCubesOfOddNumbers() {
        return super.printCubesOfOddNumbers();
    }

    @GetMapping("/listCourses/name/length")
    public String printLengthOfCourseNames() {
        return super.printLengthOfCourseNames();
    }
}
