package part01.main2;

public class Member {
	private String memberID;
	private String memberName;
	public Member(String memberID, String memberName) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return "[" + memberID + "," + memberName + "]";
	}
	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}
