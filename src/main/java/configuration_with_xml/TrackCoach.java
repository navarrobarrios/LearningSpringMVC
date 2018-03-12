package configuration_with_xml;

public class TrackCoach implements Coach{
    //region Variables
    private FortuneService fortuneService;
    private String emailAddres;
    private String team;
    //endregion

    //region Constructor's
    TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    //endregion

    //region Setters && Getters
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddres(String emailAddres) {
        this.emailAddres = emailAddres;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmailAddres() {
        return emailAddres;
    }

    public String getTeam() {
        return team;
    }
    //endregion

    //region Coach Methods
    public String getDailyWorkout() {
        return "TrankCouch";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    //endregion


    //region Local Methods

    private void onDestroyMethod(){
        System.out.println("onDestroy Method");
    }

    private void onInitMethod(){
        System.out.println("onInit Method");
    }
    //endregion
}
