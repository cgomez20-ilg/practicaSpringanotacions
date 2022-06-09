package cat.ilg.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {
        //llegir el fitxer de configuracio de spring de classe Java
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportsConfig.class);


        //demanar el bean de coach al contenidor de spring
        Coach coach = context.getBean("swimCoach", SwimCoach.class);


        //cridar metode del bean
        System.out.println(coach.getDailyPractice());


        //crida metode de la dependencia
        //System.out.println(coach.getLastGameStats());
        System.out.println(coach.getAudience());

        //comprobar
        //System.out.println(coach.getEmailAddress());
        //System.out.println(coach.getTeam());

        //tancar el contexte
        context.close();


    }
}