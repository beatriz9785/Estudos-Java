package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {
    public static void main(String[] args) throws Exception {
    	
    	Locale.setDefault(Locale.US); //para escolher virgula ou ponto

    	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
    	
    	Scanner in = new Scanner(System.in);
    	
    	
    	System.out.println("Enter car rental data");
    	System.out.print("Enter car model: ");
    	String carModel = in.nextLine();
    	System.out.print("pickup time: ");
    	Date pickup = dateFormat.parse(in.nextLine());
    	System.out.print("return time: ");
    	Date returns = dateFormat.parse(in.nextLine());
    	
    	
    	CarRental rental1 = new CarRental(pickup, returns, new Vehicle (carModel));
    	
    	System.out.print("Enter price per hour: ");
    	Double priceHour = in.nextDouble();
    	System.out.print("Enter price per day: ");
    	Double priceDay = in.nextDouble();
    	
    	System.out.println("INVOICE:");
    	
    	RentalService rentalService1 = new RentalService(priceHour, priceDay, new BrazilTaxService());
    	
    	rentalService1.processInvoice(rental1);
    	System.out.println(rental1);

    }
}
