package configuration_with_xml;

public class BaseballCoach extends Coach2 implements Coach {
    //region Variables
    FortuneService fortuneService;
    //endregion

    //region Constructor's
    public BaseballCoach() {
    }

    BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    //endregion

    //region Coach Methods
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
    //endregion

    //region Setters & Getters

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    //endregion
}
