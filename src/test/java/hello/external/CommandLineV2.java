package hello.external;

import java.util.List;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.DefaultApplicationArguments;

@Slf4j
public class CommandLineV2 {

    public static void main(String[] args) {
        //--url=devdb --url=devdb2 --username=dev_user --password=dev_pw mode=on
        for (String arg : args) {
            log.info("arg={}", arg);
        }
        //--를 붙여야함
        DefaultApplicationArguments appArgs = new DefaultApplicationArguments(args);
        log.info("SourceArgs={}", List.of(appArgs.getSourceArgs()));
        log.info("NonOptionArgs={}", List.of(appArgs.getNonOptionArgs()));
        log.info("OptionNames={}", List.of(appArgs.getOptionNames()));

        Set<String> optionNames = appArgs.getOptionNames();

        for (String optionName : optionNames) {
            log.info("option arg {}={}", optionName, appArgs.getOptionValues(optionName));
        }

        List<String> url = appArgs.getOptionValues("url");
        List<String> username = appArgs.getOptionValues("username");
        List<String> password = appArgs.getOptionValues("password");
        List<String> mode = appArgs.getOptionValues("mode");
        log.info("url={}", url);
        log.info("username={}", username);
        log.info("password={}", password);
        log.info("mode={}", mode);
    }
}
