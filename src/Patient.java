
public class Patient {
	
	private int patientIdNumber;
	private int patientAge;
	private BloodType patientBloodData;
	
	//Overload Constructors
	public Patient(int id, int age, BloodType bloodData) {
		this.patientIdNumber = id;
		this.patientAge = age;
		this.patientBloodData = bloodData;
		
	}
	//Default Constructor
	public Patient () {
		this (0,0,new BloodType());
	}
	
	//Accessor methods
	public int getPatientIdNumber() {
		return patientIdNumber;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public String getBloodType() {
		return patientBloodData.getBloodType() + patientBloodData.getRhFactor();
	}
	
	
	//Mutators\ methods
	public void setPatientIdNumber(int newId) {
		patientIdNumber = newId;
	}
	public void setPatientAge(int newAge) {
		patientAge = newAge;
	}
	public void setBloodType(BloodType newBloodType) {
		patientBloodData = newBloodType;
	}
	
}
