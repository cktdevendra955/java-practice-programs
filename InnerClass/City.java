
public class City {
     String name;
     Sector sector;
    
    class Sector {
        String title;

        Sector(String title){
            this.title = title;
            System.out.println("Sector " + title);
        }
    }

    City(String name){
        this.name = name;
        System.out.println("City " + name);
        // System.out.println("Sector " + sector.title);
    }

    public static void main(String[] args) {
    
        City c = new City("Noida");        
        City.Sector sec = c.new Sector("Sectore 62");
        
    }
}
