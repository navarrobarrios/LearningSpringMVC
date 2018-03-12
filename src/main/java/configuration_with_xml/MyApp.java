package configuration_with_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String args[]){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationcontext.xml");

        TrackCoach theCoach = context.getBean("myCoach", TrackCoach.class);
        System.out.println(theCoach.toString());
        context.close();
    }
}
