package itea.task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FlowersSaver {
    public static void save(String path, List<Flowers> flowers) {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            flowers.forEach(f -> f.toString());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println("Problem with writing in file");
            e.printStackTrace();
        }
    }
}
