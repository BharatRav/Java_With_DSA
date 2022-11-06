package GreedyAgorithms.Leetcode;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int greedFactor[] = g;
        int cookieSize[] = s;

        Arrays.sort(greedFactor);
        Arrays.sort(cookieSize);

        int happyChild =0;       //initially

        for (int cookieIndex =0; happyChild< greedFactor.length && cookieIndex<cookieSize.length;cookieIndex++) {
            if (cookieSize[cookieIndex]>=greedFactor[happyChild]) {
                happyChild++;
            }
        }
        return happyChild;
    }
}
