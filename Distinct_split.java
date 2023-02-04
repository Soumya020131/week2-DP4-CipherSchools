import java.util.*;
public class Distinct_split {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int size = sc.nextInt();
            String s = sc.next();
            int distinct = 0;
            int comp = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            for(char c: s.toCharArray()){
                if(map.containsKey(c)){
                    map.put(c, map.get(c) + 1);
                }
                else{
                    map.put(c, 1);
                }
            }
            distinct = map.size();
            int comp2 = 0;
            HashMap<Character, Integer> set = new HashMap<>();

            for(int i = 0; i < size; i++){
                if(set.containsKey(s.charAt(i))){
                    set.put(s.charAt(i), set.get(s.charAt(i)) + 1);
                }
                else{
                    set.put(s.charAt(i), 1);
                }
                //set.put(s.charAt(i), set.get(charAt(i)) + 1);
                comp = set.size();
                //System.out.println(comp);
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if(map.get(s.charAt(i)) == 0){
                    map.remove(s.charAt(i));
                }
                comp2 = map.size();
                //System.out.println(comp2);
                distinct = Math.max(distinct, comp + comp2);   
                //comp = 0;      
                

            }
            System.out.println(distinct);

            
            n--;
        }
        sc.close();
    }
    
}
