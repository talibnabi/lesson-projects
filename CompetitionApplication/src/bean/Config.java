package bean;

import util.FileUtility;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class Config implements Serializable {
    public static final long serialVersionUID = 1L;
    private static Config config;
    private static boolean loggedIn;

    private static final String fileName = "objectFile.obj";
    private  Competitor[] competitors = new Competitor[0];

    public  void appendCompetitor(Competitor competitor) {
        Competitor[] newCompetitors = new Competitor[competitors.length + 1];
        for (int i = 0; i < competitors.length; i++) {
            newCompetitors[i] = competitors[i];
        }
        newCompetitors[newCompetitors.length - 1] = competitor;
        competitors = newCompetitors;
    }

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public static void initialize() {
        Object obj = FileUtility.readObject(fileName);
        if (obj == null) {
            return;
        }
        if (obj instanceof Config) {
            config = (Config) obj;
        }
    }

    public static void save() {
        FileUtility.writeObject(Config.config, fileName);
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }


    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    public  Competitor[] getCompetitor() {
        return competitors;
    }

    public  void setCompetitor(Competitor[] competitor2) {
        competitors = competitor2;
    }
}
