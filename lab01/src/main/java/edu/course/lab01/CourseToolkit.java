package edu.course.lab01;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static boolean isPrime(int n) {
        if (n < 2){
            return false;
        }
        for (int i = 2; i*i<=n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(String s){
        if (s == null) {
            throw new IllegalArgumentException("Строка не может быть null");
        }
        int x1=0;
        int x2 = s.length()-1;
        while (x1 < x2){
            if (s.charAt(x1) != s.charAt(x2)){
                return false;
            }
            x1++;
            x2--;
        }
        return true;
    }
    public static double average(int[] x) {
        if (x == null || x.length == 0) {
            throw new IllegalArgumentException("Массив не может быть null или пустым");
        }
        double sum = 0;
        for (int x0 : x){
            sum+=x0;
        }
        return sum / x.length;
    }
}
