package configuration_with_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    //region Varibles
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
    //endregion

    //region Constructor
    public TennisCoach() {
    }

    //endregion

    //region Coach Methods
    public String getDailyWorkout() {
        return "Practice more..";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    //endregion
}
