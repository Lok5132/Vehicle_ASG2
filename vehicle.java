class vehicle {
    private String vehicleNumber;
    private String manufacturer;
    private String model;
    private double rentalRatePerDay;

    public vehicle(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    public void setRentalRatePerDay(double rentalRatePerDay) {
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public double calculateRentalCost(int numOfDays) {
        return rentalRatePerDay * numOfDays;
    }

    @Override
    public String toString() {
        return "Vehicle Number: " + vehicleNumber +
                "\nManufacturer: " + manufacturer +
                "\nModel: " + model +
                "\nRental Rate Per Day: RM" + rentalRatePerDay;
    }
}

