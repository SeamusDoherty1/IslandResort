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
        employees = 0;
    }
    public hotel(room r, int n, int e){
        rooms = new ArrayList<room>();
        rooms.add(r);
        employees = e;
    }
    public void getRooms(){
        for(room v: rooms){
            v.toString();
        }
    }
    public double getProfit(){
        return profits;
    }
    public int getNumRooms(){
        return numRoom;
    }
    public int getEmployees(){
        return employees;
    }
    public int residents(){
        return residents;
    }
    public void addRoom(room r){
        rooms.add(r);
    }
    public void setRoom
}
