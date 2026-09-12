public class CallRecord {

	private final String phoneNumber;
	private final String category;
	private final boolean personalInfoAsked;
	private final boolean repeatedCall;
	private final boolean suspiciousOffer;

	public CallRecord(String phoneNumber, String category,
					  boolean personalInfoAsked, boolean repeatedCall,
					  boolean suspiciousOffer) {
		this.phoneNumber = phoneNumber;
		this.category = category;
		this.personalInfoAsked = personalInfoAsked;
		this.repeatedCall = repeatedCall;
		this.suspiciousOffer = suspiciousOffer;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getCategory() {
		return category;
	}

	public boolean isPersonalInfoAsked() {
		return personalInfoAsked;
	}

	public boolean isRepeatedCall() {
		return repeatedCall;
	}

	public boolean isSuspiciousOffer() {
		return suspiciousOffer;
	}
}
