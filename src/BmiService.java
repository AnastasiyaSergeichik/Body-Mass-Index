public class BmiService {
    public double calculate(double weight, double height) {
        double index;
        index = weight * 100 / (height * height) * 100;
        return index;
    }
}


