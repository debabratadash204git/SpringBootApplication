package decoratorDesignPattern;

public class PaneerToping extends TopingDecorator {
	Basepizza pizza;
	public PaneerToping(Basepizza pizza){
		this.pizza = pizza;
		
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.pizza.cost() + 100;
	}

}
