package util;

import java.io.*;

public class FileUtility {
    public static void writeObject(Serializable s, String fileName) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutput objectOutput = new ObjectOutputStream(fileOutputStream);) {
            objectOutput.writeObject(s);
        } catch (Exception exception) {

        }

    }

    public static Object readObject(String fileName) {
        Object obj = null;
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            obj = objectInputStream.readObject();
        } catch (Exception exception) {

        } finally {
            return obj;
        }
    }
}
