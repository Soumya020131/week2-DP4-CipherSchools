import java.util.*;
public class Direction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int size = sc.nextInt();
            String s = sc.next();
            int i = 0;
            int j = 0;
            int flag = 0;
            for(int k = 0; k < size; k++){
                if(s.charAt(k) == 'L'){
                    i--;
                }
                else if(s.charAt(k) == 'R'){
                    i++;
                }
                else if(s.charAt(k) == 'U'){
                    j++;
                }
                else if(s.charAt(k) == 'D'){
                    j--;
                }
                if(i == 1 && j == 1){
                    System.out.println("YES");
                    flag++;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("NO");
            }
            //System.out.println(j - i + 1);
            n--;
        }
        sc.close();
    }

    
}
