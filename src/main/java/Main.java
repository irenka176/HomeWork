public class Main {
    public static void main(String[] args) {
        var collectionLesson = new CollectionLesson();
        var response = collectionLesson.toList(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 9, 10});
        System.out.println("convert to list " + response);
        var array = new String[]{"test", "test2", "test3", "test4", "test5", "test6", "test7", "test7", "test9", "test10",
                "test", "test2", "test3", "test4", "test5", "test6", "test7", "test7"};
        var request = collectionLesson.toList(array);
        var count = collectionLesson.countOccurrence(request, "test100");
        System.out.println("count test100 =  " + count);
        count = collectionLesson.countOccurrence(request, "test");
        System.out.println("count test = " + count);
        count = collectionLesson.countOccurrence(request, "test7");
        System.out.println("count test7 = " + count);
        var unique = collectionLesson.findUnique(response);
        System.out.println("unique values: " + unique);
    }
}
