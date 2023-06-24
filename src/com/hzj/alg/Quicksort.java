package com.hzj.alg;


public class Quicksort {
    public static void main(String[] args) {
        int[] a = new int[]{1456,323,34,234,423};
        int[] quicksort = new Quicksort().quickSort2(a, 0, 4);
        for (int i = 0; i < quicksort.length; i++) {
            System.out.println(quicksort[i]);
        }
    }
    public int[] quickSort(int[] arrays,int left,int right) {
        if(left > right) {
            return null;
        }
        int l = left;
        int r = right;
        int pivot = arrays[left];
        int temp = 0;
        while(l < r) {
            while(pivot <= arrays[r] && l < r) {
                r--;
            }
            while(pivot >= arrays[l] && l < r) {
                l++;
            }
            if(l <= r) {
                temp = arrays[r];
                arrays[r] = arrays[l];
                arrays[l] = temp;
            }
        }
        arrays[left] = arrays[l];
        arrays[l] = pivot;
        quickSort(arrays, left, l - 1);
        quickSort(arrays, l + 1, right);
        return arrays;
    }
    public int[] quickSort1(int[] arrays,int left,int right) {
        if(left > right) {
            return null;
        }
        int l = left;
        int r = right;
        int pivot = arrays[left];
        int temp = 0;
        while(l < r) {
            while(pivot <= arrays[r] && l < r) {
                r--;
            }
            while(pivot >= arrays[l] && l < r) {
                l++;
            }
            if(l <= r) {
                temp = arrays[r];
                arrays[r] = arrays[l];
                arrays[l] = temp;
            }
        }
        arrays[left] = arrays[l];
        arrays[l] = pivot;
        quickSort1(arrays, left, l - 1);
        quickSort1(arrays, l + 1, right);
        return arrays;
    }
    public int[] quickSort2(int[] arrays,int left,int right) {
      if (left < right) {
          return null;
      }
      int l = left;
      int r = right;
      int temp = arrays[left];
      while (l < r) {
          while (temp <= arrays[r] && l < r) {
              r--;
          }
          while (temp >= arrays[l] && l < r) {
              l++;
          }
          if (l < r) {
              int a = arrays[r];
              arrays[r] = arrays[l];
              arrays[l] = a;
          }
      }
        arrays[left] = arrays[l];
        arrays[l] = temp;
        quickSort2(arrays, left, l - 1);
        quickSort2(arrays, l + 1, right);
        return arrays;
    }
}
