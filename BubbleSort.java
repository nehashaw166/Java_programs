import java.util.Arrays;

public class BubbleSort { public static void main(String[] args) {
    int[] a = {10, 5, 9, 8, 45, 547, 78, 8, 8, 878, 65, 6, 12, 1, 1, 2};
    
    for (int i = 0; i < a.length - 1; i++) {  // Outer loop runs through the array
        for (int j = 0; j < a.length - i - 1; j++) {  // Inner loop to compare adjacent elements
            if (a[j] > a[j + 1]) {
                // Swap elements if they are in the wrong order
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
    System.out.println(Arrays.toString(a));  // Print the sorted array
}
}
