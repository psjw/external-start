package hello;

import jakarta.annotation.PostConstruct;
import java.util.List;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CommandLineBean {

    private final ApplicationArguments arguments;

    public CommandLineBean(ApplicationArguments arguments) {
        this.arguments = arguments;
    }

    @PostConstruct
    public void init() {
        //--url=devdb --username=dev_user --password=dev_pw mode=on

        log.info("source {}", List.of(arguments.getSourceArgs()));
        log.info("optionNames {}", List.of(arguments.getOptionNames()));
        Set<String> optionNames = arguments.getOptionNames();
        for (String optionName : optionNames) {
            log.info("option args {}={}", optionName, arguments.getOptionValues(optionName));
        }
    }
}
