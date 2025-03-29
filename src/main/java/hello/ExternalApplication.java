package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalApplication {
    //vm :    -Durl=devdb -Dusername=dev_user -Dpassword=dev_pw
    //programarg : --url=proddb --username=prod_user --password=prod_pw
    //programarg : --spring.profiles.active=dev
    //vm : -Dspring.profiles.active=dev
    public static void main(String[] args) {
        SpringApplication.run(ExternalApplication.class, args);
    }

}
