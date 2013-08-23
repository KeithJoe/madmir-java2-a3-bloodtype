
public class TestPatient {
	 
	//Test
	public static void main(String[] args) {
		BloodType ryanBloodType = new BloodType("AB",'-');
		Patient ryan = new Patient(6767,35,ryanBloodType);
		Patient johnJohn = new Patient();
		Patient carol = new Patient(5678,39,ryanBloodType);
		
		johnJohn.setPatientAge(40);
		johnJohn.setPatientIdNumber(1234);

		
		BloodType carolBloodType = new BloodType("B",'+');
		johnJohn.setBloodType(ryanBloodType);
		
		//Test Output
		System.out.println("Ryan's ID number is " + ryan.getPatientIdNumber() + " He is " + ryan.getPatientAge()
				+ " years old.  His bloodtype is " + ryan.getBloodType());
		System.out.println("John's ID number is " + johnJohn.getPatientIdNumber() + " He is " + johnJohn.getPatientAge()
				+ " years old.  His bloodtype is " + johnJohn.getBloodType());
		System.out.println("Carol ID number is " + carol.getPatientIdNumber() + "S he is " + carol.getPatientAge()
				+ " years old.  Her bloodtype is " +carol.getBloodType());
	}

}
