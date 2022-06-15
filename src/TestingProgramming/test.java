package TestingProgramming;

public class test {
    public static void main(String[] args) {
        int[] array = {1,2,1};
        System.out.println(check(array));
    }
    public static boolean check(int[] array){
        int first = 0;
        int last = 0;
        if (array.length<3){
            return false;
        }
        else if (array.length==3){
            first += array[array.length/2-1];
            last += array[array.length-1];
            return first == last;
        }
        else {
            return false;
        }

    }
}
