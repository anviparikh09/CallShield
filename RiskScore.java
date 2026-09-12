public class RiskScore {

    private int score;
    private String riskLevel;

    public RiskScore(int score) {
        this.score = score;

        if (score >= 70) {
            riskLevel = "High Risk";
        } else if (score >= 40) {
            riskLevel = "Suspicious";
        } else {
            riskLevel = "Low Risk";
        }
    }

    public int getScore() {
        return score;
    }

    public String getRiskLevel() {
        return riskLevel;
    }
}