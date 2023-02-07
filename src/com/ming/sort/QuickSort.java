package com.ming.sort;

public class QuickSort extends BaseSort{
    /**
     * @return
     */
    public int getmid(int[] array,int low, int high){
        int target = array[low];
        while (low < high){
            while (array[high] >= target){
                high--;
            }
            array[low] = array[high];
            while (array[low] <= target){
                low++;
            }
            array[high] = array[low];
        }
        array[low] = target;
        return low;
    }

    public void quicklySort(int[] array,int low,int high){
        if (high>low){
            int mid = getmid(array,low,high);
            getmid(array,low,mid - 1);
            getmid(array,mid + 1,high);
        }
    }

    @Override
    void sort(int[] ints) {
        quicklySort(ints,0,ints.length-1);
    }
}
