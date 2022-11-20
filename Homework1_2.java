public class Homework1_2 {

    public static void main(String[] args) {
        int[] array1 = {7, 1, 5, 10, 9};
        int[] array2 = {3, 4, 5, 2, 7, 1};
    
        System.out.println(lengthArrays(array1, array2));
    }
    
    public static int[] lengthArrays(int[] numArr1, int[] numArr2) {
        if (numArr1.length != numArr2.length) {
            throw new RuntimeException("Массивы разной длинны!");
        }
        int[] result = new int[numArr1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = numArr1[i] - numArr2[i];
        }
        return result;
    }
    
}
    

