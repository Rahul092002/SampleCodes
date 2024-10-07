// ArrayList implementation
import java.util.*;
public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Input in ArrayList
        //Taking Single Inputs
        list.add(5);
        list.add(6);
        //Taking inputs using for loop
        for(int i= 0; i<5;i++){
            list.add(sc.nextInt());
        }
        //Printing Outputs
        for(int i = 0;i<7;i++){ //Using for loop
            System.out.println(list.get(i));
        }
        System.out.println(list); // Direct printing
    }
}
