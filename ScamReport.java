public class ScamReport {

    private String phoneNumber;
    private String category;
    private String reason;
    private int riskScore;
    private String riskLevel;

    public ScamReport(String phoneNumber, String category, String reason,
                      int riskScore, String riskLevel) {

        this.phoneNumber = phoneNumber;
        this.category = category;
        this.reason = reason;
        this.riskScore = riskScore;
        this.riskLevel = riskLevel;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCategory() {
        return category;
    }

    public String getReason() {
        return reason;
    }

    public int getRiskScore() {
        return riskScore;
    }

    public String getRiskLevel() {
        return riskLevel;
    }
}