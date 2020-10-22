public class Auto {
    int snelheid = 0;
    int kilometerStand= 2300;
    public String merk = "Toyota";

// De autos
    public static void main(String[] args) {

        // Auto 1 kilometerStand = 2300
        Auto auto1 = new Auto();
        auto1.start();
        auto1.geefGas();
        auto1.stop();
        auto1.getKilometerStand();
        System.out.println();
        System.out.println();

        // Auto 2 Volvo kilometerStand is 5000, een oude volvo :P
        Auto auto2 = new Auto();
        auto2.setMerk("Volvo");
        auto2.start();
        auto2.geefGas();
        auto2.stop();
        auto2.setKilometstand(5000);
        auto2.getKilometerStand();
        System.out.println();
        System.out.println();

// Auto 3 Volvo 2.0 kilometerStand = 2300

        Auto auto3 = new Auto();
        auto3.setMerk("Volvo 2.0");
        auto3.geefGas();
        auto3.getKilometerStand();
        System.out.println();
        auto3.geefGas();
        auto3.getKilometerStand();
        System.out.println();
        auto3.geefGas();
        auto3.getKilometerStand();

    }


    // De merk Toyata wordt opgehaald.
    public String getMerk() {
        return merk;
    }

// De merk instellen.
    public String setMerk(String merk) {
        this.merk = merk;
        return merk;
    }


    // Je start de auto.
    public void start() {
        System.out.println("Je start de "+merk+".");
    }

    // Je geeft gas, de auto gaat vooruit.
    public void geefGas() {
        snelheid+=20;
        System.out.println("    - Je geeft gas, de " +merk+ " gaat sneller!");
        System.out.println("    - Je gaat "+snelheid+" km/per uur" );
    }

    //Je stopt de auto.
    public void stop() {
        System.out.println("Je remt en de "+merk+" stopt. Je hebt 20km gereden");
    }
    // Update de kilometer stand.
    public int setKilometstand(int kilometerstand){
        this.kilometerStand = kilometerstand;
        return kilometerstand;
    }
    // Haal de kilometerstand op.
    public int getKilometerStand(){
        kilometerStand += snelheid;
        System.out.println("    - De nieuwe km stand is: " +kilometerStand);
        return kilometerStand;
    }

    }
