package by.roodxx.lambda.springlambdabenchmark;

import static org.springframework.web.servlet.function.RouterFunctions.route;
import static org.springframework.web.servlet.function.ServerResponse.ok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;
import by.roodxx.lambda.springlambdabenchmark.service.PersonService;

@SpringBootApplication
public class SpringLambdaBenchmarkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLambdaBenchmarkApplication.class, args);
	}

	@Bean
	public RouterFunction<ServerResponse> productListing(PersonService ps) {
		return route().GET("/person/{id}", req -> ok().body(ps.get(req.pathVariable("id"))))
				.build();
	}
}
