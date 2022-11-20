public class Homework1_1 {
    public static void main(String[] args) {
        Homework1_1 Exceptions = new Homework1_1();

        Exceptions.ExceptionStackOverflow(1);//рекурсия, уходящая в бесконечность
        Exceptions.ArrayStoreException(); 
        Exceptions.ArithmeticException(45, 0);
    }
    
    public void ExceptionStackOverflow(int counter) {
        if (counter == 0)
            return;
        else
            ExceptionStackOverflow(++counter);
    }

    public void  ArrayStoreException() {   //создали массив объектов, обявили, что храниться там будут строки, а добавить
        // пытаемся числа
        Object[] arr = new String[4];
        arr[0] = "data";
        System.out.println(arr[0]);
        arr[0] = 23;
        System.out.println(arr[1]);
    }

    public void ArithmeticException(int a, int b) { // на 0 делить нельзя
        a = 45;
        b = 0;
        System.out.println(a/b);
    }      
        
}

