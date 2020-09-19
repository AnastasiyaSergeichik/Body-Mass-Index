public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 56;
        double height = 175;
        double index = service.calculate(weight, height);
        String result = String.format("%.2f", index);
        System.out.println(result);
    }
}
