public class FinancialForecastIterative {
    public static double forecastValue(double presentValue, double growthRate, int years) {
        double futureValue = presentValue;
        for (int i = 1; i <= years; i++) {
            futureValue = futureValue * (1 + growthRate);
        }
        return futureValue;
    }
    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.10;
        int years = 3;
        double futureValue = forecastValue(presentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years = " + futureValue);
    }
}