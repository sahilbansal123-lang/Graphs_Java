public class FloodFillAlgo {

    public static int[][] floodFill(int image[][], int sr, int sc, int color) {
        boolean isVis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, isVis, image[sr][sc]);
        return image;
    }

    public static void helper(int[][] image, int sr, int sc, int color, boolean[][] isVis, int origColor) {

    }

    public static void main(String[] args) {

    }
}
