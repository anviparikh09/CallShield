import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReportManager {

    private ArrayList<ScamReport> reports;

    public ReportManager() {
        reports = new ArrayList<>();
    }

    public void addReport(ScamReport report) {
        reports.add(report);
    }

    public void displayReports() {

        if (reports.size() == 0) {
            System.out.println("No reports available.");
            return;
        }

        for (ScamReport report : reports) {

            System.out.println("Phone Number: " + report.getPhoneNumber());
            System.out.println("Category: " + report.getCategory());
            System.out.println("Reason: " + report.getReason());
            System.out.println("Risk Score: " + report.getRiskScore());
            System.out.println("Risk Level: " + report.getRiskLevel());
            System.out.println("-------------------------");
        }
    }

    public void saveReportToDatabase(ScamReport report) {

        String sql = "INSERT INTO reports " +
                     "(phone_number, category, reason, risk_score, risk_level) " +
                     "VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, report.getPhoneNumber());
            statement.setString(2, report.getCategory());
            statement.setString(3, report.getReason());
            statement.setInt(4, report.getRiskScore());
            statement.setString(5, report.getRiskLevel());

            statement.executeUpdate();

            System.out.println("Report saved to database successfully!");

        } catch (SQLException e) {
            System.out.println("Failed to save report.");
            System.out.println(e.getMessage());
        }
    }
}