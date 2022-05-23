public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
            double height = 177;
            double weight = 96.6;
            double bmi = service.calculate(height, weight);
        System.out.println("индекс массы тела: " + bmi);
        }
    }
