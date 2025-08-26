package observerDesignpattern;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableClass implements StockObservable {
	
   List<NotificationObserver> observerList = new ArrayList<>();
   int data = 0;

	@Override
	public void add(NotificationObserver obj) {
		// TODO Auto-generated method stub
		observerList.add(obj);

	}

	@Override
	public void remove(NotificationObserver obj) {
		// TODO Auto-generated method stub
		observerList.remove(obj);

	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		for(NotificationObserver o: observerList) {
			o.update();
		}

	}

	@Override
	public void setData(int newStock) {
		// TODO Auto-generated method stub
		if(newStock == 0) {
			notifyObserver();
		}
				
		data = data + newStock;
		

	}
	public int getData() {
		// TODO Auto-generated method stub
		return data;
		

	}

}
