class motor extends vehicle {
    private double engineCapacity;

    public motor(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay, double engineCapacity) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double calculateTopSpeed() {
        return engineCapacity * 50;
    }

    @Override
    public double calculateRentalCost(int numOfDays) {
        if (calculateTopSpeed() >= 300) {
            return super.calculateRentalCost(numOfDays) + 150;
        } else {
            return super.calculateRentalCost(numOfDays);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nEngine Capacity: " + engineCapacity;
    }
}
