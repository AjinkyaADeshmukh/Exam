package beans;

public class CardsBean {
	private int aadharCard, passportId;
	private String panCard;
	public CardsBean() {
		
	}
	public int getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(int aadharCard) {
		this.aadharCard = aadharCard;
	}
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	@Override
	public String toString() {
		return "CardsBean [aadharCard=" + aadharCard + ", passportId=" + passportId + ", panCard=" + panCard + "]";
	}
	
	
}
