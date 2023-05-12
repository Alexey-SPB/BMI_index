public class BmiService {
    public int calculate(double heightmeter, int weightKg) {
        double BMI = weightKg / (heightmeter * heightmeter);
        return (int) BMI;
}
}
