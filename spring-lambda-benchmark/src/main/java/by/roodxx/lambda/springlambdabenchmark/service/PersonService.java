package by.roodxx.lambda.springlambdabenchmark.service;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;
import by.roodxx.lambda.springlambdabenchmark.dto.Person;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PersonService {

    private static Map<Long, Person> data = new HashMap<>();

    static {
        data.put(1L, Person.builder().id(1L).name("First Name").age(23).title("Important").build());
        data.put(2L, Person.builder().id(2L).name("Second Name").age(33).title("Not important").build());
        data.put(3L, Person.builder().id(3L).name("Third Name").age(43).title("Very important").build());
    }


    public Person get(final String id) {
        log.info("Got id: {}", id);
        return data.get(Long.parseLong(id));
    }
}
