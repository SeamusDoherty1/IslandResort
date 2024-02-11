package Island;
import java.util.*;

public class island{
    private ArrayList<hotel> hotels;
    private double money;
    private int rooms;
    public island(){
        hotel h = new hotel();
        hotels = new ArrayList<hotel>();
        hotels.add(h);
    }
    public island(hotel h){
        hotels = new ArrayList<hotel>();
        hotels.add(h);
    }
    public int getHotels(){
        return hotels.size();
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
    public void removeHotel(int h){
        hotels.remove(h);
    }
    public int hotelHasSameEmployees(){
        int counter = 0;
        for(int j = 0; j < hotels.size(); j++){
            for(int i = j + 1; i < hotels.size();i++){
                if((hotels.get(i).getEmployees()) == (hotels.get(j).getEmployees())){
                    counter++;
                }
            }
        }
        return counter;
    }
    public String toooString(){
        String s = "This island has " + hotels.size() + " hotel(s), each hotel is: \n";
        for(hotel h : hotels){
            s = s + h.tooString();
        }
        return s;
    }
    public static void main(String[] args){
        room r1 = new room();
        room r2 = new room(5, true, true, 50, "balcony");
        hotel h1 = new hotel();
        hotel h2 = new hotel(r2, 50);
        island i1 = new island();
        island i2 = new island(h1);

        System.out.println(r1.toString());
        System.out.println(r2.toString());

        r1.setAC(true);
        r2.setHeating(false);
        r1.setPrice(25);
        r2.setType("porch");
        r1.setTenants(9);
        r2.setTenants(-2);

        System.out.println(r1.toString());
        System.out.println(r2.toString());

        System.out.println(h1.getSmallestPrice());
        System.out.println(h2.getSmallestPrice());
        System.out.println(h2.avgPrice());

        h2.addRoom(r1);
        h1.addRoom(r2);
        h2.setProfit(-10);
        h1.setProfit(5);
        h2.setEmployees(10);
        h1.setEmployees(-1);

        System.out.println(h1.getSmallestPrice());
        System.out.println(h2.getSmallestPrice());
        System.out.println(h2.avgPrice());

        System.out.println(i1.toooString());   
        System.out.println(i2.toooString());
        
        i1.addHotel(h2);
        i2.addHotel(h1);


        //System.out.println(r2.toString());
        //System.out.println(h2.tooString());
        //System.out.println(i2.toooString());

        //System.out.println(i1.getHotels());
        //System.out.println(h1.getNumRooms());


    }
    
}