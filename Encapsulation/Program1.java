package Encapsulation;

/*
 * Write an algorithm to create a class Encapsulation with getter and setter methods
 * to assign and print values of variables country, nationalAnthem and touristSpot
 */
public class Program1 {
    private String country, nationalAnthem, touristSpot;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNationalAnthem() {
        return nationalAnthem;
    }

    public void setNationalAnthem(String nationalAnthem) {
        this.nationalAnthem = nationalAnthem;
    }

    public String getTouristSpot() {
        return touristSpot;
    }

    public void setTouristSpot(String touristSpot) {
        this.touristSpot = touristSpot;
    }

    public static void main(String args[]) {
        Program1 program1 = new Program1();
        program1.setCountry("India");
        program1.setNationalAnthem("Jana Gana Mana");
        program1.setTouristSpot("Golden Temple");
        System.out.println("Country " + program1.getCountry());
        System.out.println("National Anthem " + program1.getNationalAnthem());
        System.out.println("Tourist Space " + program1.getTouristSpot());
    }
}
