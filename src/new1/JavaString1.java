package new1;

import java.util.Scanner;

public class JavaString1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.next();
        for (int i =0 ; i < str.length(); i++){
            System.out.println(i);
        }
    }
}
