package level4;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(Doctor d) {
		d = new Doctor();
		doctors.add(d);

	}

	public void addPatient(Patient patient) {
		patient = new Patient();
		patients.add(patient);
	}

	public ArrayList<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		int docIdx = 0;
		
			doctors.get(0).assignPatient(new Patient());
			doctors.get(0).assignPatient(new Patient());
			doctors.get(0).assignPatient(new Patient());
			doctors.get(1).assignPatient(new Patient());
			doctors.get(1).assignPatient(new Patient());
			doctors.get(1).assignPatient(new Patient());
			doctors.get(2).assignPatient(new Patient());
			doctors.get(2).assignPatient(new Patient());
		
	}
}
