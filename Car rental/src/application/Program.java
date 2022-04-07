package application;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {
	public static void main(String[] args) throws Exception {

		Locale.setDefault(Locale.US); // para escolher virgula ou ponto

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");

		Scanner in = null;
		
		String carModel = null;
		Double priceHour= null, priceDay = null;
		Date pickup = null, returns = null;
		
		
		try {			
			
			in = new Scanner(System.in);

			System.out.println("Enter car rental data");
			System.out.print("Enter car model: ");
			carModel = in.nextLine();
			System.out.print("pickup time: ");
			pickup = dateFormat.parse(in.nextLine());
			System.out.print("return time: ");
			returns = dateFormat.parse(in.nextLine());
	
	
			System.out.print("Enter price per hour: ");
			priceHour = in.nextDouble();
			System.out.print("Enter price per day: ");
			priceDay = in.nextDouble();

		}catch(InputMismatchException imex) {
			System.err.println("Deu erro na entrada...");
		}catch(ParseException pex) {
			System.err.println("Data inválida ");
		}
		
		System.out.println("INVOICE:");

		CarRental rental1 = new CarRental(pickup, returns, new Vehicle(carModel));
		RentalService rentalService1 = new RentalService(priceHour, priceDay, new BrazilTaxService());

		rentalService1.processInvoice(rental1);
		System.out.println(rental1);

	}
}
