
public class ReportUser implements Reportable {

    private final User user;

    public ReportUser(User user) {
        this.user = user;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
