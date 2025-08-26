package observerDesignpattern;

public class MessageAlertObserver implements NotificationObserver {

	StockObservable obj;
	String mailId;
	public MessageAlertObserver(StockObservable obj, String mailId)
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
