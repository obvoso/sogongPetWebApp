package petMan;

import java.util.ArrayList;

public class GetPetList {
	private ArrayList<String> nameList = new ArrayList<>();
	private ArrayList<String> birthList = new ArrayList<>();
	private ArrayList<String> typeList = new ArrayList<>();
	private ArrayList<String> kindList = new ArrayList<>();
	private ArrayList<String> masterList = new ArrayList<>();
	private ArrayList<String> phoneList = new ArrayList<>();
	
	public GetPetList() {
		
	}
	
	//---------setter---------//
	public void setNameList(String Object) {
		this.nameList.add(Object);
	}
	public void setBirthList(String Object) {
		this.birthList.add(Object);
	}
	public void setTypeList(String Object) {
		this.typeList.add(Object);
	}
	public void setKindList(String Object) {
		this.kindList.add(Object);
	}
	public void setMasterList(String Object) {
		this.masterList.add(Object);
	}
	public void setPhoneList(String Object) {
		this.phoneList.add(Object);
	}
	
	//---------getter---------//
	public ArrayList<String> getNameList() {
		return nameList;
	}
	public ArrayList<String> getBirthList() {
		return birthList;
	}
	public ArrayList<String> getTypeList() {
		return typeList;
	}
	public ArrayList<String> getKindList() {
		return kindList;
	}
	public ArrayList<String> getMasterList() {
		return masterList;
	}
	public ArrayList<String> getPhoneList() {
		return phoneList;
	}
	
	public int getSize() {
		return nameList.size();
	}
}
