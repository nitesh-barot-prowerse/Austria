package pages;

public class Constant {
    public static  String ENVIRONMENT=System.getProperty("environment");

    public static String url;
    static {
        if(ENVIRONMENT.equals("AustriaStage")){
            url="http://52.32.106.250:9999/";
        } else if (ENVIRONMENT.equals("AustriaProduction")) {
            url="https://fitlocal.petcover.at:91/";
        }
        else if (ENVIRONMENT.equals("UTS-UK2production")) {
            url="https://fitlocal2.britishpetinsurance.co.uk:94/";
        }
    }
}
