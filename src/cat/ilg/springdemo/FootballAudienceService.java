package cat.ilg.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballAudienceService implements AudienceService{

    @Override
    public String getAudience() {
        return "Football audienxe las month: 250.000";
    }
}
