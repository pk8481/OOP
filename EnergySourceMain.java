
abstract class EnergySource {
    int source_id;
    String source_name;
    double energy_generated;

    EnergySource(int id, String name, double energy) {
        source_id = id;
        source_name = name;
        energy_generated = energy;
    }

    abstract double calculateEfficiency();

    void displayDetails() {
        System.out.println("Source ID: " + source_id);
        System.out.println("Source Name: " + source_name);
        System.out.println("Energy Generated: " + energy_generated + " KWh");
        System.out.println("Efficiency: " + calculateEfficiency() + "%");
    }
}

class SolarEnergy extends EnergySource {
    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    double calculateEfficiency() {
        return (energy_generated / 5000) * 100;
    }
}

class WindEnergy extends EnergySource {
    WindEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    double calculateEfficiency() {
        return (energy_generated / 8000) * 100;
    }
}

public class EnergySourceMain {
    public static void main(String[] args) {
        EnergySource s;

        s = new SolarEnergy(7, "Solar Powered", 8000);
        System.out.println("Solar Energy Details:");
        s.displayDetails();

        System.out.println();

        s = new WindEnergy(1008, "Wind Power", 5000);
        System.out.println("Wind Energy Details:");
        s.displayDetails();
    }
}

