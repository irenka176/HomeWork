public class Main {
    public static void main(String[] args) {
        String[][] inputArray = {
                {"10", "12", "23", "14"},
                {"65", "invalid value #1", "36", "17"},
                {"invalid value #2", "55", "96", "67"},
                {"51", "60", "invalid value #3", "87"}
        };
        int sum = 0;
        try {
            ArrayValueCalculator calculator = new ArrayValueCalculator();
            sum = calculator.doCalc(inputArray);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Sum of array elements: " + sum);
        }
    }
}
