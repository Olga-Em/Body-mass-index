public class Main {

    public static void main(String[] args) {
            BmiService service = new BmiService();
            int bodyMass = 52; //в килограммах
            double height = 1.6; //в метрах
            double bmi = service.calculate(bodyMass, height);
            System.out.println(bmi);
        }
    }
