package configuration_without_xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class HappyFortuneService implements FortuneService {
    //region Variables
    @Value("${foo.team}")
    private String[] fortunes;
    //endregion
    public String getFortune() {
        int i = new Random().nextInt(fortunes.length);
        return fortunes[i];
    }
}
