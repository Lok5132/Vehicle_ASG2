public class output {
    public static void main(String[] args) {
        vehicle[] vehicles = new vehicle[3];
        vehicles[0] = new car("CAR001", "Toyota", "Corolla", 100, 4);
        vehicles[1] = new motor("MOTO001", "Honda", "CBR500R", 80, 500);
        vehicles[2] = new motor("MOTO002", "Kawasaki", "Ninja 650", 120, 650);

        int numOfDays = 5;

        for (vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("Total Rental Cost for " + numOfDays + " days: RM" + vehicle.calculateRentalCost(numOfDays));
            
            if (vehicle instanceof motor) {
                motor motorcycle = (motor) vehicle;
                System.out.println("Top Speed: " + motorcycle.calculateTopSpeed() + " km/h");
            }

            System.out.println();
        }
    }
}