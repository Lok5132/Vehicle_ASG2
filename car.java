class car extends vehicle {
    private int numberOfDoors;

    public car(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay, int numberOfDoors) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateRentalCost(int numOfDays) {
        if (numberOfDoors > 2) {
            return super.calculateRentalCost(numOfDays) + (35 * numOfDays);
        } else {
            return super.calculateRentalCost(numOfDays);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Doors: " + numberOfDoors;
    }
}
