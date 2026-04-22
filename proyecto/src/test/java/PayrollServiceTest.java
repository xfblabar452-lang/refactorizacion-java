public class PayrollServiceTest {

    public static void main(String[] args) {
        PayrollService service = new PayrollService();

        double result1 = service.calculateSalary(40, 10);
        double result2 = service.calculateSalary(45, 10);

        if (result1 == 400 && result2 == 475) {
            System.out.println("TEST OK");
        } else {
            System.out.println("TEST FAIL");
        }
    }
}