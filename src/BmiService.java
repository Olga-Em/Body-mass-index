public class BmiService {
    public double calculate (int bodyMass, double height) {
        double bmi = bodyMass/(height*height);
        return bmi;
    }
}
