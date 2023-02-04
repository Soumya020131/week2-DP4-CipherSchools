import java.util.*;
public class Maximum_in_each_window {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        int[] result = maxSlidingWindow(array, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                result[index++] = nums[deque.peek()];
            }
        }
        return result;
    }
    
}
