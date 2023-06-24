package com.hzj.alg;

import java.util.ArrayList;
import java.util.List;

public class getRow {
    public static void main(String[] args) {
        List<Integer> row = new getRow().getRow(3);
        System.out.println(row);
    }
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> col = new ArrayList<>();

        for (int i = 0; i <= rowIndex ; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0|| j == i) {
                    row.add(1);
                }else row.add(col.get(i - 1).get(j - 1) + col.get(i - 1).get(j));
            }
            col.add(row);
        }
        return col.get(rowIndex);
    }
}
