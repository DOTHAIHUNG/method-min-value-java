public class methodMinValue {
    public static void main(String[] args) {
        int[] numberArray = {12, 25, 9, 16, 11, 93, 13, 5, 3, 5};
        int index = findMinValue(numberArray);
        System.out.println("Самое маленькое значение " + numberArray[index] + " найден на место: " + index);
    }

    private static int findMinValue(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
