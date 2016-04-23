package delectable.order;

import java.util.Date;

public class Order {
	
	
	long id;
	String order_date;
  	String delivery_date;
  	double amount;
  	int surcharge;
  	String status;
  	String ordered_by;
  	
  	public Order(){
  		
  	}
  	
  	public Order(long id, String order_date, String delivery_date, double amount, int surcharge, String status, String ordered_by){
  		this.id = id;
  		this.order_date = order_date;
  		this.delivery_date = delivery_date;
  		this.amount = amount;
  		this.surcharge =surcharge;
  		this.status = status;
  		this.ordered_by = ordered_by;
  	}
  	
  	
  	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getSurcharge() {
		return surcharge;
	}

	public void setSurcharge(int surcharge) {
		this.surcharge = surcharge;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrdered_by() {
		return ordered_by;
	}

	public void setOrdered_by(String ordered_by) {
		this.ordered_by = ordered_by;
	}
  	
  	
  	
  	

}
