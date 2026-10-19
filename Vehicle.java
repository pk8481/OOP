class Vehicle {
    String vehicleNumber, vehicleType;
    int parkingHours;
    private double amount;

    static final double RATE = 20;

    Vehicle(String vehicleNumber, String vehicleType, int parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }

    void calculateCharges(int hours) {
        amount = hours * RATE;
    }

    void calculateCharges(int hours, double rate) {
        amount = hours * rate;
    }

    double getAmount() {
        return amount;
    }

    static void displayBill(Vehicle v) {
        System.out.println("Vehicle Number: " + v.vehicleNumber);
        System.out.println("Vehicle Type: " + v.vehicleType);
        System.out.println("Parking Hours: " + v.parkingHours);
        System.out.println("Parking Charges: " + v.getAmount());
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("KA25AB1234", "Car", 3);
        Vehicle v2 = new Vehicle("KA25CD5678", "Bike", 2);

        v1.calculateCharges(v1.parkingHours, 50);
        v2.calculateCharges(v2.parkingHours);

        System.out.println("Vehicle 1 Bill:");
        displayBill(v1);

        System.out.println("\nVehicle 2 Bill:");
        displayBill(v2);
    }
}
