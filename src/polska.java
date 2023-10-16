import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class polska {

    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
      
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter polska zapis ");

        String input = myObj.nextLine();
        String[] ans = input.split(" ");
        Stack<Integer> numbs = new Stack<Integer>();

        for(int i = 0; i<ans.length; i++){
            if (isNumeric(ans[i])){
                numbs.add(ans[i]);
            }
        }

    }
}
