public class BmiService {
    public double calculate(int weight, double height) {
        double heightInQua = height * height;
        int bmi = (int) (weight / heightInQua);

        return bmi;
    }
}
