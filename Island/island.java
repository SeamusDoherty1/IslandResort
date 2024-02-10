package Island;
import java.util.*;

public class island{
    private ArrayList<hotel> hotels;
    private double money;
    private int rooms;
    public island(){
        hotels = new ArrayList<hotel>();
    }
    public island(hotel h){
        hotels = new ArrayList<hotel>();
        hotels.add(h);
    }
    public void getHotels(){
        for(hotel h: hotels){
            h.toString();
        }
    }
    public double getMoney(){
        for(hotel h: hotels){
            money += h.getProfit();
        }
        return money;
    }
    public int getRooms(){
        for(hotel h: hotels){
            rooms += h.getNumRooms();
        }
        return rooms;
    }
    public void addHotel(hotel h){
        hotels.add(h);
    }
    
}