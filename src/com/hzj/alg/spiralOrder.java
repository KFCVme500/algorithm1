package com.hzj.alg;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3}};
        List<Integer> list = new spiralOrder().spiralOrder(matrix);
        System.out.println(list);
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
        int n = matrix.length, m = matrix[0].length;//n表示行，m表示列
        List<Integer> res = new ArrayList<>();
        for(int i = 0, j = 0, d = 0, k = 0; k < n * m; k++){
            res.add(matrix[i][j]);
            matrix[i][j] = 101;
            int a = i + dx[d], b = j + dy[d];// a = 0 b = 1
            if(a < 0 || a >= n || b < 0 || b >= m || matrix[a][b] == 101){
                d = (d + 1) % 4;
                a = i + dx[d]; b = j + dy[d];
            }
            i = a; j = b;
        }
        return res;
    }
    public List<Integer> spiralOrder1(int[][] matrix) {
        List<Integer> order = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return order;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                order.add(matrix[top][column]);
            }
            for (int row = top + 1; row <= bottom; row++) {
                order.add(matrix[row][right]);
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; column--) {
                    order.add(matrix[bottom][column]);
                }
                for (int row = bottom; row > top; row--) {
                    order.add(matrix[row][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return order;
    }
}
