package First_Example;

public class BaseballCoach extends Coach2 implements Coach{

    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public void getDayliMotion() {
        super.getDayliMotion();
    }
}
