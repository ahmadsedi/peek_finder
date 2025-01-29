package com.ahmadsedi.peek.stream;

import java.util.stream.IntStream;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 29/01/2025
 * Time: 19:42
 */

public class EnhancedPeekFinder {

    public static int findPeek(int[] series){
        return  IntStream.iterate(0, i->i+1).limit(series.length).mapToObj(i->new Pair(i, series[i])).reduce(Pair::merge).orElse(Pair.empty).getIndex();
    }

    static class Pair {
        int index;
        int data;
        int differ = Integer.MIN_VALUE;

        static final Pair empty = new Pair(-1, 0);

        public Pair(int index, int data) {
            this.index = index;
            this.data = data;
        }

        Pair merge(Pair pair){
            if(pair.data-this.data>differ){
                this.differ = pair.data-this.data;
                this.index = pair.index;
                this.data = pair.data;
            }
            return this;
        }

        public int getIndex() {
            return index;
        }

        public int getData() {
            return data;
        }

        public int getDiffer() {
            return differ;
        }
    }
}
