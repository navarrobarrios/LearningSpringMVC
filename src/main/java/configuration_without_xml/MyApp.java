package configuration_without_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Coach coach = context.getBean("tennisCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
    }
}
