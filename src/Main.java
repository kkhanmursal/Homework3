public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.1, 2.2, -3.3, 4.4, 5.5, -6.6, 7.7, -8.8, 9.9, -10.1, 11.2, -12.3, 13.4, 14.5, -15.6};

        boolean notFoundNegative = true;
        double sum = 0;
        int count = 0;


        for (double number : numbers) {
            if (notFoundNegative) {
                if (number < 0) {
                    notFoundNegative = false;
                }
            } else if (number > 0) {
                sum += number;
                count++;
            }
        }
        System.out.println("Среднее ариф: " + sum / count);


    }
}