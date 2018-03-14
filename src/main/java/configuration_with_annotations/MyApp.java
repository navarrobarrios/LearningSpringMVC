package configuration_with_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String args[]){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);

        context.close();
    }
}
