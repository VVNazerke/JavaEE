package Model;

import java.util.ArrayList;
public class DBManager {
    public static ArrayList<Item> items = new ArrayList<>();

    public static Long id = 2L;

    static {
        items.add(new Item(1L, "IPhone 11", 300000, 5));
    }

    public static ArrayList<Item> getAllItems(){
        return items;
    }

    public static void addItem(Item item){
        item.setId(id);
        items.add(item);
        id++;
    }









//    public static ArrayList<Footballer> footballers = new ArrayList<>();
//    public static long id = 2L;
//    static {
//        footballers.add(new Footballer(1L,"Messi", "Lionel", 100000000, "PSG", 350000 ));
//    }
//    public static ArrayList<Footballer> getAllFootballers(){
//        return footballers;
//    }
//    public static void addFootballer(Footballer footballer){
//        long index = id;
//        footballer.setId(index);
//        footballers.add(footballer);
//        id++;
//    }
}
