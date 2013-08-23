
public class TestBloodType {

	public static void main(String[] args) {
		BloodType junior = new BloodType("B", '-');
		BloodType keith = new BloodType();
		BloodType eric = new BloodType("AB");
		BloodType april = new BloodType("B",'-');
		
		eric.setBloodType("A");
		april.setRhFactor('+');
		
		System.out.println("Junior's bloodtype is " + junior.getBloodType() + junior.getRhFactor());
		System.out.println("Keith's bloodtype is " + keith.getBloodType() + keith.getRhFactor());
		System.out.println("Eric's bloodtype is " + eric.getBloodType() + eric.getRhFactor());
		System.out.println("April's bloodtype is " + april.getBloodType() + april.getRhFactor());
	}

}
