public class FloodFillAlgo {

    public static int[][] floodFill(int image[][], int sr, int sc, int color) {
        boolean isVis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, isVis, image[sr][sc]);
        return image;
    }

    public static void helper(int[][] image, int sr, int sc, int color, boolean[][] isVis, int origColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || isVis[sr][sc] || image[sr][sc] != origColor) {
            return;
        }

        image[sr][sc] = color;
        //up
        helper(image, sr - 1, sc, color, isVis, origColor);
        // down
        helper(image, sr + 1, sc, color, isVis, origColor);
        // left
        helper(image, sr, sc - 1, color, isVis, origColor);
        // right
        helper(image, sr, sc + 1, color, isVis, origColor);
    }

    public static void main(String[] args) {

    }
}
