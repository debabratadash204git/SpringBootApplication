package observerDesignpattern;

public interface StockObservable {
	
	
	public void add(NotificationObserver obj);
	public void remove(NotificationObserver obj);
	public void notifyObserver();
	
	public void setData(int newStock);
	public int getData();
	
	

}
