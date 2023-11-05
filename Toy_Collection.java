import java.io.FileWriter;
import java.util.PriorityQueue;
import java.util.Random;
import java.io.IOException;

public class Toy_Collection {
    
    PriorityQueue<Toy> toyQueue = new  PriorityQueue<Toy>((t1, t2) -> t2.getWeight() - t1.getWeight());
    Random rand = new Random();

    public void put(int id, String name, int weight){
        Toy toy = new Toy(id, name, weight);
        toyQueue.add(toy);
    }

    public int get(){
        int num = rand.nextInt(10);
        if (num < 2) {
            return 1;
        } else if (num < 4) {
            return 2;
        } else{
            return 3;
        }
    }

    public void Write_file(String file_name){
        try {
            FileWriter writer = new FileWriter(file_name);
            for(int i = 0; i < 10; i++){
                int res = get();
                writer.write(Integer.toString(res));
            }
            writer.close();
        } catch (Exception e) {
            System.err.println("Ошибка записи файла:" + e.getMessage());
        }
    }
}
