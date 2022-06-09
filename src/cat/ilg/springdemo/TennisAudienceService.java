package cat.ilg.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisAudienceService implements AudienceService{


    @Override
    public String getAudience() {
        return "Tennis audience in las month: 68.000 peopole attended.";
    }
}
