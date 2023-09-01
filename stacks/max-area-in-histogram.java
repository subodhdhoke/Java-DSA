import java.util.Stack;

public class main {
    public static void nextsmaller(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int n[] = new int[arr.length];
        st.push(arr.length - 1);
        n[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                n[i] = arr.length;
            } else {
                n[i] = st.peek();
            }
            st.push(i);
        }

        for(int i=0 ; i<n.length ; i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }

    public static void previousSmaller(int arr[]) {
        Stack<Integer> sta = new Stack<>();
        int p[] = new int[arr.length];
        sta.push(0);
        p[0] = -1;

        for (int i = 1; i < arr.length; i++) {
            while (sta.size() > 0 && arr[sta.peek()] >= arr[i]) {
                sta.pop();
            }
            if (sta.isEmpty()) {
                p[i] = -1;
            } else {
                p[i] = sta.peek();
            }
            sta.push(i);
        }
        for(int i=0 ; i<p.length ; i++){
            System.out.print(p[i]+" ");
        }
        System.out.println();
    }

    public static int maxAreaHistogram(int height[]) {
        int maxArea = 0;
        // find next smaller
        Stack<Integer> st = new Stack<>();
        int n[] = new int[height.length];
        st.push(height.length - 1);
        n[height.length - 1] = height.length;

        for (int i = height.length - 2; i >= 0; i--) {
            while (st.size() > 0 && height[st.peek()] >= height[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                n[i] = height.length;
            } else {
                n[i] = st.peek();
            }
            st.push(i);
        }
        // empty the stack
        while (st.size() > 0) {
            st.pop();
        }
        // find prevoius smaller
        int p[] = new int[height.length];
        st.push(0);
        p[0] = -1;

        for (int i = 1; i < height.length ; i++) {
            while (st.size() > 0 && height[st.peek()] >= height[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                p[i] = -1;
            } else {
                p[i] = st.peek();
            }
            st.push(i);
        }

        for (int i = 0; i < height.length; i++) {
            int h = height[i];
            int wid = n[i] - p[i] - 1;
            int area = h*(wid);
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;

    }

    public static void main(String[] args) {
        int height[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxAreaHistogram(height));
        nextsmaller(height);
        previousSmaller(height);
    }
}