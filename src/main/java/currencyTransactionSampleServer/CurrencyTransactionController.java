package currencyTransactionSampleServer;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyTransactionController {
	


	   @RequestMapping("/currencyTransaction")
	    public CurrencyTransaction currencyTransaction(@RequestParam(value="transactionNumber", defaultValue="1") String transactionNumber) {
		
		   switch (transactionNumber) {
		case "2":
			return new CurrencyTransaction(123321, "USD", "HKD", new BigDecimal("1000.00"), new BigDecimal("777"), 123.32, "4-JAN-15 22:17:44", "FR");
			
		case "3":
			return new CurrencyTransaction(723321, "EUR", "HKD", new BigDecimal("345.00"), new BigDecimal("247.17"), 23.32, "7-FEB-15 10:27:44", "GB");
			
		case "4":
			return new CurrencyTransaction(123321, "CHF", "GBP", new BigDecimal("543.00"), new BigDecimal("977.23"), 12.32, "13-MAR-15 13:57:44", "IT");
			
		case "5":
			return new CurrencyTransaction(723320, "CNY", "USD", new BigDecimal("1001.00"), new BigDecimal("677.32"), 13.32, "19-AUG-15 9:27:44", "CN");
			
		default:
			return new CurrencyTransaction(823321, "USD", "CNY", new BigDecimal("1030.34"), new BigDecimal("557.16"), 13.32, "24-SEP-15 14:07:06", "IE");
			
		}
		   
	    	
	    
	   }
	   
	  
	   
	   
	    
	
}
