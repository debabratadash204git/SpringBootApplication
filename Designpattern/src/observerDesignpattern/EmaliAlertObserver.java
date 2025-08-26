package observerDesignpattern;

public class EmaliAlertObserver implements NotificationObserver {
	StockObservable obj;
	String mailId;
	public EmaliAlertObserver(StockObservable obj, String mailId)
	{
		this.obj = obj;
		this.mailId = mailId;
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendMail(mailId);
		
	}
	
	public void sendMail(String mailId) {
		
		System.out.println("Mail Snet to the mailId " + mailId);
		
	}

}
