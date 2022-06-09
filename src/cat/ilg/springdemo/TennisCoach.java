package cat.ilg.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class TennisCoach implements Coach, InitializingBean, DisposableBean {

    @Value("${foo.email}")
    private String emailAddress;
    @Value("${foo.team}")
    private String team;

    private GameStatsService gameStatsService;

    @Autowired
    @Qualifier("basketballAudienceService")
    private AudienceService audienceService;

    @Autowired
    public TennisCoach(GameStatsService gameStatsService){
        this.gameStatsService = gameStatsService;
    }

    @Override
    public String getDailyPractice() {
        return "Tennis coahc: Practice your backhand volley";
    }

    @Override
    public String getLastGameStats() {
        return gameStatsService.getLastGameStats();
    }

    @Override
    public String getAudience() {
        return this.audienceService.getAudience();
    }

    //Getters
    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }


    public void doMyStartupStuff(){
        System.out.println(">> Starup hook method");
    }


    public void doMyCleanupStuff(){
        System.out.println(">> Cleanup hook method");
    }

    @Override
    public void destroy() throws Exception {
        doMyCleanupStuff();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        doMyStartupStuff();
    }
}
