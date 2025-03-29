package hello.external;

import java.util.Objects;
import java.util.Properties;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaSystemProperties {

    public static void main(String[] args) {
        //-Durl=devdb -Dusername=dev_user -Dpassword=password
        System.setProperty("hello_key", "hello_value");
        String helloKey = System.getProperty("hello_key");
        log.info("hello_key={}",helloKey);

        Properties properties = System.getProperties();

        System.getenv("DBURL");
        for (Object key : properties.keySet()) {
            log.info("prop {}={}",key, System.getProperty(String.valueOf(key)));
        }

        String url = System.getProperty("url");
        String username = System.getProperty("username");
        String password = System.getProperty("password");


        log.info("url={}", url);
        log.info("username={}", username);
        log.info("password={}", password);
    }

}
