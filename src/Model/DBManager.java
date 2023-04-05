package Model;

import java.util.ArrayList;
public class DBManager {
    public static ArrayList<Footballer> footballers = new ArrayList<>();
    public static long id = 2L;
    static {
        footballers.add(new Footballer(1L,"Messi", "Lionel", 100000000, "PSG", 350000 ));
    }

    public static ArrayList<Footballer> getAllFootballers(){
        return footballers;
    }

    public static void addFootballer(Footballer footballer){
        long index = id;
        footballer.setId(index);
        footballers.add(footballer);
        id++;
    }
}
