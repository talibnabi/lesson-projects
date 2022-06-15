package serviceInter;

import bean.Config;

public interface StoredProcess extends ProcessService {
    public default void process() {
        processLogic();
        Config.save();
    }

    public abstract void processLogic();
}
