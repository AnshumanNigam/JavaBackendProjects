package JAVA2;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double rentalPrice;
    public Vehicle(String brand, String model, int year, double rentalPrice)
    {
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.rentalPrice=rentalPrice;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear()
    {
        return year;
    }
    public double getRentalPrice()
    {
        return rentalPrice;
    }
    public void displayVehicleInfo()
    {
        System.out.println("Brand Name of Vehicle:"+getBrand());
        System.out.println("Model Number:"+getModel());
        System.out.println("Year:"+getYear());
        System.out.println("Rental Price:"+getRentalPrice());
    }

}
public class Car extends Vehicle{
    private int numberOfSeats;
    public Car(String brand, String model, int year, double rentalPrice, int numberOfSeats) {
        super(brand, model, year, rentalPrice);
        this.numberOfSeats = numberOfSeats;
    }
    public int getnumberOfSeats(){
        return numberOfSeats;
    }

}
public class Motorcycle extends Vehicle{
    private int engineCapacity;
    public Motorcycle(String brand, String model, int year, double rentalPrice, int engineCapacity) {
        super(brand, model, year, rentalPrice);
        this.engineCapacity = engineCapacity;
    }
    public int getEngineCapacity(){
        return engineCapacity;
    }

}

public class Main()
{
    public static void main(String args[])
    {
        Car car = new Car("Honda","City",2022,60.0,6);
        Motorcycle bike = new Motorcycle("Honda","Active",2020,90.0,7);
        car.displayVehicleInfo();
        System.out.println("Number of Seats: "+car.getnumberOfSeats()+"\n");

        bike.displayVehicleInfo();
        System.out.println("Number of Seats: "+bike.getnumberOfSeats());

    }
}