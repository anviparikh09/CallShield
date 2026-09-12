import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Phone Number: ");
        String phoneNumber = sc.nextLine();

        System.out.print("Category: ");
        String category = sc.nextLine();

        System.out.print("Personal Information Asked? (true/false): ");
        boolean personalInfoAsked = sc.nextBoolean();

        System.out.print("Repeated Call? (true/false): ");
        boolean repeatedCall = sc.nextBoolean();

        System.out.print("Suspicious Offer? (true/false): ");
        boolean suspiciousOffer = sc.nextBoolean();

        // Create CallRecord
        CallRecord call = new CallRecord(
            phoneNumber,
            category,
            personalInfoAsked,
            repeatedCall,
            suspiciousOffer
        );

        // Analyze risk
        RiskAnalyzer analyzer = new RiskAnalyzer();
        int score = analyzer.calculateRisk(call);
        String riskLevel = analyzer.getRiskLevel(score);

        // Create RiskScore
        RiskScore riskScore = new RiskScore(score);

        // Create ScamReport
        ScamReport report = new ScamReport(
            phoneNumber,
            category,
            "Suspicious call detected",
            riskScore.getScore(),
            riskScore.getRiskLevel()
        );

        // Manage report
        ReportManager manager = new ReportManager();
        manager.addReport(report);
        manager.saveReportToDatabase(report);

        System.out.println("\n----- CALLSHIELD RESULT -----");
        manager.displayReports();

        sc.close();
    }
}