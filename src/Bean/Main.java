package Bean;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal Jose = new Animal("lion","Marco",'M',"1825");
		Animal Josianne = new Animal("lion","josianne",'F',"1829");
		
		// rajout de l'accouplement avec Josianne pour Jose
		Jose.setAccouple(Josianne);


		System.out.println(Jose.toString());
	}
	
	
	
}
