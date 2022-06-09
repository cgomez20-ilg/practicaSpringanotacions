package cat.ilg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeansScopeDemoApp {

    public static void main(String[] args) {

        //Carregar el fitxer de configuracio xml
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //obtenir el beans del contenidor  spring
        Coach coach = context.getBean("tennisCoach", Coach.class);

        Coach coach2 = context.getBean("tennisCoach", Coach.class);

        //comprobasio de si els dos beans son el matiex
        boolean result =(coach == coach2);
        System.out.printf("coach i coach2 apunten al mateix objecte? %s%n",result);

        //imprimir l'adressa de memoria
        System.out.printf("coach %s%n" ,coach);
        System.out.printf("coach2 %s%n" ,coach2);



    }

}
