public class main1 {
    public static int trappingRainwater(int[] height) {
        int[] leftmax = new int[height.length];
        leftmax[0] = 0; // The left maximum of the first element is itself

        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[leftmax[i - 1]]) {
                leftmax[i] = i; // If the current height is greater, set the left maximum to current index
            } else {
                leftmax[i] = leftmax[i - 1]; // Otherwise, carry forward the previous left maximum
            }
        }

        int[] rightmax = new int[height.length];
        rightmax[rightmax.length - 1] = height.length - 1;
        for (int i = height.length - 2; i >= 0; i--) {
            if (height[i] > height[rightmax[i + 1]]) {
                rightmax[i] = i;
            } else {
                rightmax[i] = rightmax[i + 1];
            }
        }

        int water = 0;
        int currwater = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] == height[rightmax[i]] || height[i] == height[leftmax[i]]) {
                currwater = 0;
            } else{
                currwater = Math.min(height[leftmax[i]], height[rightmax[i]]) - height[i];
                water = water+currwater;
            }

        }
        return water;

    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Water = "+trappingRainwater(height));

    }

}
