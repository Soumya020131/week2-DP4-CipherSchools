import java.util.Stack;
public class Celebrity {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 1, 0}
        };
        System.out.println(findCelebrity(matrix));
    }

    public static int findCelebrity(int[][] matrix) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < matrix.length; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();
            if (matrix[a][b] == 1) {
                stack.push(b);
            } else {
                stack.push(a);
            }
        }
        int candidate = stack.pop();
        for (int i = 0; i < matrix.length; i++) {
            if (i != candidate && (matrix[candidate][i] == 1 || matrix[i][candidate] == 0)) {
                return -1;
            }
        }
        return candidate;
        
    }
    
}
