package decoratorDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Basepizza paneerToping = new PaneerToping(new CountryDelightpizza());
		System.out.println(paneerToping.cost());
		
		Basepizza cheeseToping = new CheeseToping(new Moomospizza());
		System.out.println(cheeseToping.cost());

	}

}
