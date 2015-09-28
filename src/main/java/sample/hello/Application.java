package sample.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import sample.hello.app.Car;
import sample.hello.app.Chassis;

@SpringBootApplication
@EnableSpringConfigured
@EnableJpaRepositories
public class Application extends WebMvcConfigurerAdapter {

    @Autowired ApplicationContext applicationContext;

    @Bean
    public Jackson2ObjectMapperBuilder jacksonBuilder() {

        return new Jackson2ObjectMapperBuilder()
                .applicationContext(applicationContext);
    }

    @RestController
    protected static class MyController {

        @RequestMapping(value = "/api/car", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
        public Car create(@RequestBody final Car car) {

            System.out.println("CREATE: " + car);
            return car;
        }

        @RequestMapping(value = "/api/car/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
        public Car get(@PathVariable long id) {

            System.out.println("GET: " + id);

            Car car = new Car();
            car.setId(id);
            car.setName("Car");

            Chassis chassis = new Chassis();
            chassis.setName("MyChassis");
            car.setChassis(chassis);
            return car;
        }
    }

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }

}