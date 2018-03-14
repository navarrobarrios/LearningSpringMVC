package configuration_without_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
    //region Varibles
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
    //endregion

    //region Constructor
    public TennisCoach() {
    }

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
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

    @PreDestroy
    public void onDestroyBean(){
        System.out.println("OnDestroy Bean");
    }

    @PostConstruct
    public void onCreateBean(){
        System.out.println("PostConstruct Bean");
    }
}
