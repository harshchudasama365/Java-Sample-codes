package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Institute_Details")
public class InstituteRegistration {
	
	@Id
	String instiCode;
	String name;
	String inststate;
	String instdist;		
	String emailid;
	long disecode;
	String location;
	String institutionType;
	String affiUnivState;
	String affilatedUBName;
	String password;
	String address;
	String city;
	String state;
	String district;
	long pincode;
	long telephone;
	String applicationStatus = "pending approval";
	public String getInstiCode() {
		return instiCode;
	}
	public void setInstiCode(String instiCode) {
		this.instiCode = instiCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInststate() {
		return inststate;
	}
	public void setInststate(String inststate) {
		this.inststate = inststate;
	}
	public String getInstdist() {
		return instdist;
	}
	public void setInstdist(String instdist) {
		this.instdist = instdist;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getDisecode() {
		return disecode;
	}
	public void setDisecode(long disecode) {
		this.disecode = disecode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getInstitutionType() {
		return institutionType;
	}
	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}
	public String getAffiUnivState() {
		return affiUnivState;
	}
	public void setAffiUnivState(String affiUnivState) {
		this.affiUnivState = affiUnivState;
	}
	public String getAffilatedUBName() {
		return affilatedUBName;
	}
	public void setAffilatedUBName(String affilatedUBName) {
		this.affilatedUBName = affilatedUBName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public long getTelephone() {
		return telephone;
	}
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	
	public InstituteRegistration() {
		
	}
	
	public InstituteRegistration(String instiCode, String name, String inststate, String instdist, String emailid,
			long disecode, String location, String institutionType, String affiUnivState, String affilatedUBName,
			String password, String address, String city, String state, String district, long pincode, long telephone,
			String applicationStatus) {
		super();
		this.instiCode = instiCode;
		this.name = name;
		this.inststate = inststate;
		this.instdist = instdist;
		this.emailid = emailid;
		this.disecode = disecode;
		this.location = location;
		this.institutionType = institutionType;
		this.affiUnivState = affiUnivState;
		this.affilatedUBName = affilatedUBName;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
		this.district = district;
		this.pincode = pincode;
		this.telephone = telephone;
		this.applicationStatus = applicationStatus;
	}
	@Override
	public String toString() {
		return "InstituteRegistration [instiCode=" + instiCode + ", name=" + name + ", inststate=" + inststate
				+ ", instdist=" + instdist + ", emailid=" + emailid + ", disecode=" + disecode + ", location="
				+ location + ", institutionType=" + institutionType + ", affiUnivState=" + affiUnivState
				+ ", affilatedUBName=" + affilatedUBName + ", password=" + password + ", address=" + address + ", city="
				+ city + ", state=" + state + ", district=" + district + ", pincode=" + pincode + ", telephone="
				+ telephone + ", applicationStatus=" + applicationStatus + "]";
	}

	
}


