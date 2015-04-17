package currencyTransactionSampleServer;

import java.math.BigDecimal;
import java.util.Date;

public class CurrencyTransaction {
	
	private final long userId;
	private final String currencyFrom;
	private final String currencyTo;
	private final BigDecimal amountSell;
    private final BigDecimal amountBuy;
    private final double rate;
    private final String timePlaced;
    private final String originatingCountry;
    
    public CurrencyTransaction(long userId, String currencyFrom, String currencyTo, BigDecimal amountSell, BigDecimal amountBuy, double rate, String timePlaced, String originatingCountry)
    {
    	this.userId = userId;
    	this.currencyFrom = currencyFrom;
    	this.currencyTo = currencyTo;
    	this.amountSell = amountSell;
    	this.amountBuy = amountBuy;
    	this.rate = rate;
    	this.timePlaced = timePlaced;
    	this.originatingCountry = originatingCountry;
    }
    public long getUserId() {
		return userId;
	}
	public String getCurrencyFrom() {
		return currencyFrom;
	}
	public String getCurrencyTo() {
		return currencyTo;
	}
	public BigDecimal getAmountSell() {
		return amountSell;
	}
	public BigDecimal getAmountBuy() {
		return amountBuy;
	}
	public double getRate() {
		return rate;
	}
	public String getTimePlaced() {
		return timePlaced;
	}
	public String getOriginatingCountry() {
		return originatingCountry;
	}
    
    

}
