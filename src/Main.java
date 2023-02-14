public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 80;
        double height = 1.80;
        int bmi = (int) service.calculate((int) weight, height);
        System.out.println(bmi);
    }
}

