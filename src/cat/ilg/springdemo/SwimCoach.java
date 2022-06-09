package cat.ilg.springdemo;

public class SwimCoach implements Coach {

    private AudienceService audienceService;

    public SwimCoach(AudienceService audienceService){
        this.audienceService = audienceService;
    }

    public  SwimCoach(){

    }
    @Override
    public String getDailyPractice() {
        return "Swim daily practice: fes 2000 metres papallona i 6000 braça";
    }

    @Override
    public String getLastGameStats() {
        return null;
    }

    @Override
    public String getAudience() {
        return audienceService.getAudience();
    }
}
