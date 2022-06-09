package cat.ilg.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
public class SportsConfig {

    @Bean
    public AudienceService swimAudienceService(){
        return new SwimAudienceService();
    }

    @Bean
    public  Coach swimCoach(){
        SwimCoach mySwimCoach = new SwimCoach(swimAudienceService());
        return mySwimCoach;
    }

}
