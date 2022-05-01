package serviceInter;

public interface ProcessService {
    public default void process() {
        processLogic();
    }

    public abstract void processLogic();
}
