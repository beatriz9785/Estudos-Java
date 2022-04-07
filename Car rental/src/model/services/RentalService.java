package model.services;

import model.entities.CarRental;
import model.services.interfaces.TaxService;

import model.entities.Invoice;

public class RentalService {

    private Double perHour;
    private Double perDay;

    private TaxService taxService;

    public RentalService(Double perHour, Double perDay, TaxService taxService) {
        this.perHour = perHour;
        this.perDay = perDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){//recebe aluguel de carro

        long tStart = carRental.getStart().getTime();
        long tFinish = carRental.getFinish().getTime();

        double hours = (double)(tFinish - tStart)/1000/60/60;

        Double basicPayment;

        if(hours <= 12.0){
            basicPayment = Math.ceil(hours) * perHour;
        }else{
            basicPayment = Math.ceil(hours/24) * perDay;
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));

    }
    
    
}
