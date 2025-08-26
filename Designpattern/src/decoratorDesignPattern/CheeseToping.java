package decoratorDesignPattern;

public class CheeseToping extends TopingDecorator {
	
	Basepizza pizza;
	public CheeseToping(Basepizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.pizza.cost() + 50;
	}

}
