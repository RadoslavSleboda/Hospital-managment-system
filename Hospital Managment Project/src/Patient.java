
public class Patient {

	String name;
	String password;
	String diagnosis;
	String treatment;
	boolean isInfectious;
	
	public Patient(String name, String password, String diagnosis, String treatment, boolean isInfectious) {
		super();
		this.name = name;
		this.password = password;
		this.diagnosis = diagnosis;
		this.treatment = treatment;
		this.isInfectious = isInfectious;
	}
	
	public boolean isInfectious() {
		return isInfectious;
	}

	public void setInfectious(boolean isInfectious) {
		this.isInfectious = isInfectious;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	
	
}
