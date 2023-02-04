import java.util.*;
public class codeforces {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "codeforces";
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);

            }
            
        }
        while(n != 0){
            char c = sc.next().charAt(0);
            if(map.containsKey(c)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            n--;
        }
        sc.close();
    }

    
}
