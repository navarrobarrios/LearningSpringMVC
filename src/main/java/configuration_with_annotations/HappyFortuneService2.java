package configuration_with_annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService2 implements FortuneService {
    public String getFortune() {
        return "Today is your locky day!";
    }
}
