public class RiskAnalyzer {

    public int calculateRisk(CallRecord call) {

        int score = 0;

        if (call.isPersonalInfoAsked()) {
            score += 40;
        }

        if (call.isRepeatedCall()) {
            score += 20;
        }

        if (call.isSuspiciousOffer()) {
            score += 30;
        }

        return score;
    }

    public String getRiskLevel(int score) {

        if (score >= 70) {
            return "High Risk";
        } else if (score >= 40) {
            return "Suspicious";
        } else {
            return "Low Risk";
        }
    }
}