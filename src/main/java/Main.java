import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayGenericConverter gm = new ArrayGenericConverter();
        String[] strArr = {"a", "b", "c"};
        List<String> strList = gm.fromArrayToList(strArr);
        System.out.println(strList);
        Integer[] intArr = {1, 2, 3};
        List<Integer> intList = gm.fromArrayToList(intArr);
        System.out.println(intList);

        Apple[] apples01 = new Apple[10];
        for (var i = 0; i < apples01.length; i++) {
            apples01[i] = new Apple();
        }

        Apple[] apples02 = new Apple[5];
        for (var i = 0; i < apples02.length; i++) {
            apples02[i] = new Apple();
        }

        var appleBox1 = new Box<Apple>();
        appleBox1.add(apples01);
        var weight = appleBox1.getWeight();
        System.out.println("first apple box weight: " + weight);

        var appleBox2 = new Box<Apple>();
        appleBox2.add(apples02);
        var weight02 = appleBox2.getWeight();
        System.out.println("second apple box weight: " + weight02);

        appleBox1.merge(appleBox2);
        var mergedBoxWeight = appleBox1.getWeight();
        System.out.println("merged apple box weight: " + mergedBoxWeight);

        var oranges = new Orange[10];
        var orangeBox = new Box<Orange>();
        for (var i = 0; i < oranges.length; i++) {
            oranges[i] = new Orange();
        }
        orangeBox.add(oranges);
        System.out.println("orange box weight: " + orangeBox.getWeight());
        var compareResult = orangeBox.compare(appleBox1, orangeBox);
        System.out.println("compare apples and oranges box result: " + compareResult);
    }
}