public class PayrollService {

    public double calculateSalary(double h, double r) {
        if (h > 40) {
            return calculateOvertime(h, r);
        }
        return h * r;
    }

    private double calculateOvertime(double h, double r) {
        return (40 * r) + ((h - 40) * r * 1.5);
    }
}
