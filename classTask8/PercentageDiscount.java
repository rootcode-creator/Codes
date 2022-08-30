package classTask8;
public class PercentageDiscount implements Discountable {
public double percentage;

public double getPercentage() {
	return percentage;
}

public void setPercentage(double percentage) {
	this.percentage = percentage;
}
  public double discountedPrice(double price ) {
	return price;
	  
  }
}
