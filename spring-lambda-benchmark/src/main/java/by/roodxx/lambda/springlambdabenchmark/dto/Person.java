package by.roodxx.lambda.springlambdabenchmark.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    private Long id;
    private String name;
    private Integer age;
    private String title;
}
