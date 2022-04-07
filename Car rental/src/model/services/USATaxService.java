package model.services;

import model.services.interfaces.TaxService;

public class USATaxService implements TaxService {
	
	@Override
	public Double tax(Double amount){

        if(amount <= 120.0){
            return amount * 0.25;
        }else{
            return amount * 0.20;
        }
    }

}
