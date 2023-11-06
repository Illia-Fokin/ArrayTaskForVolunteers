//Took about 20 minutes
public class Main {
    public static void main(String[] args) {
        int[] tab1 = {10, -10, 3, 2, 21, -2, 5, -3, 8, -21, -8};//the returned result is a pair of 3 and |-3|
        //int[] tab2 = {1, 1, 2, -1, 2, -1};//the returned result is a pair of 1 and |-1|
        //int[] tab3 = {1, 2, 3, -4};//the returned result is information about the lack of pair
        //int[] tab4 = {1, 1}; //the returned result is information about the lack of pair
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < tab1.length - 1; i++) {
            for (int j = i + 1; j < tab1.length; j++) {
                if (tab1[i] == -tab1[j] && max < Math.abs(tab1[i])) {
                    max = Math.abs(tab1[i]);
                    break;
                }
            }
        }
        if(max == Integer.MIN_VALUE){
            System.out.println("Lack of pair");
        }
        else{
            System.out.println(max + " and " + -max);
        }
    }
}