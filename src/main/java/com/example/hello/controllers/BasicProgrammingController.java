package com.example.hello.controllers;

import com.example.hello.services.ExampleProgrammingService;
import com.example.hello.services.HtmlWrapperService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static com.example.hello.controllers.inputs.ListConstants.COURSES_LIST;
import static com.example.hello.controllers.inputs.ListConstants.NUMBER_LIST_1;

@RestController
@RequestMapping("/structured")
public abstract class BasicProgrammingController {

    private final ExampleProgrammingService exampleProgrammingService;
    private final HtmlWrapperService htmlWrapperService;

    public BasicProgrammingController(ExampleProgrammingService exampleProgrammingService,
                                      HtmlWrapperService htmlWrapperService) {
        this.exampleProgrammingService = exampleProgrammingService;
        this.htmlWrapperService = htmlWrapperService;
    }

    @GetMapping("/listNumbers")
    public String printListOfNumbers(@RequestParam Optional<String> oddOrEven) {
        String rawOutput;
        if (oddOrEven.orElse("").equals("even")) {
            rawOutput = exampleProgrammingService.printListOfEvenNumbers(NUMBER_LIST_1);
        } else if (oddOrEven.orElse("").equals("odd")) {
            rawOutput = exampleProgrammingService.printListOfOddNumbers(NUMBER_LIST_1);
        } else {
            rawOutput = exampleProgrammingService.printListOfNumbers(NUMBER_LIST_1);
        }
        return htmlWrapperService.wrapWithPre(rawOutput);
    }

    @GetMapping("/listCourses")
    public String printListOfCourses(@RequestParam Optional<String> search) {
        String rawOutput;
        if (search.isPresent() && !search.get().isEmpty() ) {
            rawOutput = exampleProgrammingService.printListOfCoursesContainingString(COURSES_LIST, search.get());
        } else {
            rawOutput = exampleProgrammingService.printListOfCourses(COURSES_LIST);
        }
        return htmlWrapperService.wrapWithPre(rawOutput);
    }

    @GetMapping("/listCourses/minChars/{minChars}")
    public String printListOfCoursesWithMinChars(@PathVariable Optional<Integer> minChars) {
        String rawOutput;
        if (minChars.isPresent()) {
            rawOutput = exampleProgrammingService.printListOfCoursesWithMinChars(COURSES_LIST, minChars.get());
        } else {
            rawOutput = exampleProgrammingService.printListOfCourses(COURSES_LIST);
        }
        return htmlWrapperService.wrapWithPre(rawOutput);
    }

    @GetMapping("/listNumbers/evens/squares")
    public String printSquaresOfEvenNumbers() {
        String rawOutput = exampleProgrammingService.printSquaresOfEvenNumbers(NUMBER_LIST_1);
        return htmlWrapperService.wrapWithPre(rawOutput);
    }

    @GetMapping("/listNumbers/odds/cubes")
    public String printCubesOfOddNumbers() {
        String rawOutput = exampleProgrammingService.printCubesOfOddNumbers(NUMBER_LIST_1);
        return htmlWrapperService.wrapWithPre(rawOutput);
    }

    @GetMapping("/listCourses/name/length")
    public String printLengthOfCourseNames() {
        String rawOutput = exampleProgrammingService.printLengthOfCourseNames(COURSES_LIST);
        return htmlWrapperService.wrapWithPre(rawOutput);
    }
}
