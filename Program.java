
public class Program {
    public static void main(String[] args) {
        Toy_Collection toy_Collection = new Toy_Collection();
        toy_Collection.put(1,"Конструктор",2);
        toy_Collection.put(2,"Робот",2);
        toy_Collection.put(3,"Кукла",6);

        toy_Collection.Write_file("Output.txt");
    }
}
