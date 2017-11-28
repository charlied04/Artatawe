package Artatawe.Data;
import java.util.Date;
/**
 * @author Alexis Venizelos
 *
 */
public class Bid {
	
	private Profile buyer;
	private int amount;
	private Date dateTime;
	private Auction auction;
	
	public Bid(Profile buyer, int amount, Date dateTime, Auction auction) {
		
		this.buyer = buyer;
		this.amount = amount;
		this.dateTime = dateTime;
		this.auction = auction;
		
	}

	public Auction getAuction() {
		return auction;
	}

	public void setAuction(Auction auction) {
		this.auction = auction;
	}

	public Profile getBuyer() {
		return buyer;
	}

	public void setBuyer(Profile buyer) {
		this.buyer = buyer;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
}
