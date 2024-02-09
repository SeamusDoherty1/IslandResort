package Island;
import java.util.*;

public class hotel {
    private ArrayList<room> rooms;
    private double profits;
    private int numRoom;
    private int employees;
    private int residents;

    public hotel(){
        rooms = new ArrayList<room>(); 
        profits = 0;
        numRoom = 0;
        employees = 0;
        residents = 0;
    }
    public hotel(room r, double p, int n, int e, int re){
        rooms = new ArrayList<room>();
        rooms.add(r);
        profits = p;
        numRoom = n;
        employees = e;
        residents = re;
    }
}
