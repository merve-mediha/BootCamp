package referenceTypesDemo;

public class Visitor extends Person{
	private int VisitorCardNo;
	
	

	public Visitor() {
		super();
	}

	public Visitor(int id, String firstName,int visitorCardNo) {
		super( id, firstName);
		VisitorCardNo = visitorCardNo;
	}

	public int getVisitorCardNo() {
		return VisitorCardNo;
	}

	public void setVisitorCardNo(int visitorCardNo) {
		VisitorCardNo = visitorCardNo;
	}
	
	

}
