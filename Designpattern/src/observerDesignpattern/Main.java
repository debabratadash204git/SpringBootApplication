package observerDesignpattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockObservable stock = new IphoneStockObservableClass();
		
		NotificationObserver Observer1 = new EmaliAlertObserver(stock,"deb.dash@gmail.com");
		NotificationObserver Observer2 = new EmaliAlertObserver(stock,"rupa.dash@gmail.com");
		NotificationObserver Observer3 = new MessageAlertObserver(stock,"manas.d@gmail.com");
		
		stock.add(Observer1);
		stock.add(Observer2);
		stock.add(Observer3);
		
		stock.setData(10);
		stock.setData(0);
		stock.setData(100);
			
	}

}
