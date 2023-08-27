package com.hello.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public List<Student> hello() {

        List<Student> students = List.of(
                new Student("山田太郎", "xxx@example.co.jp", "java"),
                new Student("橋本二郎", "xxo@example.co.jp", "java"),
                new Student("小川三郎", "xoo@example.co.jp", "AWS"));

        return students;

    }
}
