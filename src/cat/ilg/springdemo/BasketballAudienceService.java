package cat.ilg.springdemo;


import org.springframework.stereotype.Component;

@Component
public class BasketballAudienceService implements  AudienceService{

    @Override
    public String getAudience() {
        return "Basket audience in las month: 102.000";
    }
}
