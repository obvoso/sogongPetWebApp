package petMan;

public class PetManDTO {
	
	String	name;
	String	birth;
	String	type;
	String	kind;
	String	master;
	String	phone;
	
	public PetManDTO(String name, String birth, String type, String kind, String master, String phone) {
		this.name = name;
		this.birth = birth;
		this.type = type;
		this.kind = kind;
		this.master = master;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}