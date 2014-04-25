package novare.intern.lemon.user;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class TeamInfo implements java.io.Serializable {

	private String teamName;
	private String midLaner;
	private String hardCarry;
	private String hardLaner;
	private String support1;
	private String support2;

	public TeamInfo() {
	}

	public TeamInfo(String teamName) {
		this.teamName = teamName;
	}

	public TeamInfo(String teamName, String midLaner, String hardCarry,
			String hardLaner, String support1, String support2) {
		this.teamName = teamName;
		this.midLaner = midLaner;
		this.hardCarry = hardCarry;
		this.hardLaner = hardLaner;
		this.support1 = support1;
		this.support2 = support2;
	}

	public String getTeamName() {
		return this.teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getMidLaner() {
		return this.midLaner;
	}

	public void setMidLaner(String midLaner) {
		this.midLaner = midLaner;
	}

	public String getHardCarry() {
		return this.hardCarry;
	}

	public void setHardCarry(String hardCarry) {
		this.hardCarry = hardCarry;
	}

	public String getHardLaner() {
		return this.hardLaner;
	}

	public void setHardLaner(String hardLaner) {
		this.hardLaner = hardLaner;
	}

	public String getSupport1() {
		return this.support1;
	}

	public void setSupport1(String support1) {
		this.support1 = support1;
	}

	public String getSupport2() {
		return this.support2;
	}

	public void setSupport2(String support2) {
		this.support2 = support2;
	}

}
