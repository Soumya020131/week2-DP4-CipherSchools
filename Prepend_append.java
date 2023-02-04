import java.util.*;
public class Prepend_append {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int size = sc.nextInt();
            String s = sc.next();
            int i = 0;
            int j = size - 1;
            while(i < j){
                if((s.charAt(i) == '0' && s.charAt(j) == '1') || (s.charAt(i) == '1' && s.charAt(j) == '0')){
                    size -= 2;
                    i++;
                    j--;
                }
                else{
                    break;
                }
            }
            System.out.println(j - i + 1);
            n--;
        }
        sc.close();
    }
    
}
