package airlineReservation;

public class memberData {
    private String firstName;
    private String lastName;
    private String addr;
    private String zip;
    private String state;
	private String id;
    private String pwd;
    private String email;
    private int ssn;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "memberData [firstName=" + firstName + ", lastName=" + lastName + ", addr=" + addr + ", zip=" + zip
				+ ", state=" + state + ", id=" + id + ", pwd=" + pwd + ", email=" + email + ", ssn=" + ssn + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
