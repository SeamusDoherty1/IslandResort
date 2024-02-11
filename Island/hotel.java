package Island;
import java.util.*;

public class hotel {
    private ArrayList<room> rooms;
    private double profits;
    private int numRoom;
    private int employees;
    private int residents;

    public hotel(){
        room r = new room();
        rooms = new ArrayList<room>(); 
        rooms.add(r);
        employees = 0;
    }
    public hotel(room r, int e){
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
        for(room v: rooms){
            profits += v.getPrice();
        }
        return profits;
    }
    public int getNumRooms(){
        return rooms.size();
    }
    public int getEmployees(){
        return employees;
    }
    public int getResidents(){
        for(room v: rooms){
            residents += v.getTenants();
        }
        return residents;
    }
    public void addRoom(room r){
        rooms.add(r);
    }
    public void setProfit(int price){
        for(room v: rooms){
            v.setPrice((v.getPrice() + price));
        }
    }
    public void removeRoom(int index){
        rooms.remove(index);
    }
    public void setEmployees(int e){
        employees += e;
    }
    public double getSmallestPrice(){
        double min = rooms.get(0).getPrice();
        for(int i = 0; i < rooms.size(); i++){
            if(rooms.get(i).getPrice() < min){
                min = rooms.get(i).getPrice();
            }
        }
        return min;

    }
    public double avgPrice(){
        double sum = 0;
        for(room v: rooms){
            sum += v.getPrice();
        }
        sum = sum/ getNumRooms();
        return sum;
    }
    public String tooString(){
        String s = "This hotel has a profit of: " + profits + "\n Has " + employees + " employees\n and has " + residents + " residents.\n Each room has:";
        for(room r: rooms){
            s = s + r.toString();
        }
        return s;

    }

}
