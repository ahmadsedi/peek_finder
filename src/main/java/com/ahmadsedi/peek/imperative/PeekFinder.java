package com.ahmadsedi.peek.imperative;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 29/01/2025
 * Time: 17:51
 */

public class PeekFinder {

    public static int findPeek(int[] series){
        int index = 0;
        if(series.length>0) {
            int peek = Integer.MIN_VALUE;
            for (int i = 1; i < series.length; i++) {
                int prev = series[i - 1];
                int current = series[i];
                if (current - prev > peek) {
                    index = i;
                    peek = current;
                }
            }
        }else{
            index = -1;
        }
        return index;
    }

}
