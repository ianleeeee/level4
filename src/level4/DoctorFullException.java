package level4;

public class DoctorFullException extends Exception {
	public DoctorFullException(){
		super("Doctor has no more room for patients");
	}
}
