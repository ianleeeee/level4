package level4;

import java.util.ArrayList;

public class Doctor extends Hospital{
	public boolean performs = false;
	public boolean calls = false;
	ArrayList<Patient> personalPatients = new ArrayList<Patient>();
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return performs;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return calls;
	}

	public void assignPatient(Patient macky) throws DoctorFullException {
		if(personalPatients.size()>=3){
			throw (new DoctorFullException());
		}
		else
		personalPatients.add(macky);
		
	}

	public void doMedicine() {
		for(Patient p : personalPatients){
			p.checkPulse();
		}
		
	}
	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return personalPatients;
	}

}
