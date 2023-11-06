//Took about 20 minutes
public class Main {
    public static void main(String[] args) {
        int[] tab1 = {3, 2, -2, 5, -3};//the returned result is a pair of 3 and |-3|
        int[] tab2 = {1, 1, 2, -1, 2, -1};//the returned result is a pair of 1 and |-1|
        int[] tab3 = {1, 2, 3, -4};//the returned result is information about the lack of pair
        int[] tab4 = {1, 1}; //the returned result is information about the lack of pair
        int[] temp = new int[tab4.length]; // temp length = length of given array

        for (int i = 0; i < tab4.length - 1; i++) {
            for (int j = i + 1; j < tab4.length; j++) {
                if (tab4[i] == -(tab4[j])) {
                    temp[i] = tab4[i];
                    break;
                }
            }
        }

        if(temp[0] == 0){
            System.out.println("Lack of pair");
        }
        else{
            int max = temp[0];
            for (int j : temp) {
                if (j > max) {
                    max = j;
                }
            }
            System.out.println(max + " and " + -(max));
        }
    }
}