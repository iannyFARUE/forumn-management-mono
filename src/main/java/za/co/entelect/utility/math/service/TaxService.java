package za.co.entelect.utility.math.service;



import za.co.entelect.utility.math.config.TaxLoader;
import za.co.entelect.utility.math.model.Bracket;

import java.util.List;

public class TaxService {
    List<Bracket> taxBrackets;

    public TaxService() {
        taxBrackets = TaxLoader.LoadTaxBrackets();
    }

    public double calculateYearlyTotalTax(double income){

        double currentAmount = income;
        double taxAmount = 0;
        for(Bracket currentBracket: taxBrackets){
            if(currentAmount - currentBracket.getThreshold() <= 0){
                taxAmount += currentAmount * (currentBracket.getTaxPercentage()/100);
                break;
            } else {
                taxAmount += currentBracket.getThreshold() * (currentBracket.getTaxPercentage()/100);
                currentAmount =- currentBracket.getThreshold();
            }
        }

        return taxAmount;
    }

}
