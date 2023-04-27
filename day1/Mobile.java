package week1.day1;

public class Mobile {

	public void makeCall(String mobileModel, float mobileWeight) {
		
		System.out.println("Makecall");

		
		}
	public void	sendMsg(boolean isFullCharged, int mobileCost) {
		
		System.out.println("Send Message");
			}
	
	public static void main(String[] args) {
		
		Mobile myMobile=new Mobile();
		myMobile.makeCall("Honor", 10.1f);
		myMobile.sendMsg(false, 14000);
		System.out.println("This is my mobile");
	}
	
}
	
	

