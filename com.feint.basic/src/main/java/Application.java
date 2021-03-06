import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * Created by feint on 16/9/5.
 */
@SpringBootApplication
@ComponentScan
public class Application {
    public static void main(String[] args){

          SpringApplication.run(Application.class,args);

//        System.out.println("Let's inspect the beans provided by Spring Boot: ");

//        String[] beanNames =context.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//
//        for(String beanName: beanNames){
//            System.out.println(beanName);
//        }
    }
}
