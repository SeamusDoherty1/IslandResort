package Island;

public class room{
    private int tenants;
    private boolean ac;
    private boolean heating;
    private double price;
    private String type;
    public room(){
        tenants = 0;
        ac = false;
        heating = false;
        price = 50.0;
        type = "single";
    }
    public room(int te, boolean a, boolean h, double p, String t){
        tenants = te;
        ac = a;
        heating = h;
        price = p;
        type = t;
    }
    public int getTenants(){
        return tenants;
    }
    public boolean getAC(){
        return ac;
    }
    public boolean getHeating(){
        return heating;
    }
    public double getPrice(){
        return price;
    }
    public String getType(){
        return type;
    }
    public void setTenants(int people){
        if(people > 0){
            tenants = people;
        }
        else{
            tenants = 0;
        }
    }
    public void setAC(boolean a){
        ac = a;
    }
    public void setHeating(boolean h){
        heating = h;
    }
    public void setPrice(double p){
        price = p;
    }
    public void setType(String t){
        type = t;
    }
    public String toString(){
        String p = "The room has: " + tenants + " tenants, ";
        if(ac == false){
            p = p + " has no ac, ";
        } else{
            p = p + " has ac";
        }
        if(heating == false){
            p = p + " has no heating, ";
        } else{
            p = p + " has heating, ";
        }
        p = p + "it is priced at: " + price + ", and is a: " + type + "\n";
        return p;

    }
    public boolean isEmpty(){
        if(tenants == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
