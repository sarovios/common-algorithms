package com.github.common.algorithms.problem;


import java.util.*;

public class KargerMinCut {

    private Random random = new Random();

    public void findMinCut(List<int[]> edgeList) {
        for (int i = 0; i < 1; i++) {
            List<int[]> res = randomizedContraction(edgeList);
            System.out.println();
        }
    }

    public List<int[]> randomizedContraction(List<int[]> edgeList) {
        while (edgeList.size() > 2) {
            int edgeId = random.nextInt(edgeList.size());
            int[] edge = edgeList.get(edgeId);
            int start = edge[0];
            int end = edge[1];
            Iterator<int[]> iter = edgeList.iterator();
            while (iter.hasNext()) {
                int[] e = iter.next();
                if (e[0] == end) e[0] = start;
                if (e[1] == end) e[1] = start;
                if ( (e[0] == start) && (e[1] == end) ) iter.remove();
            }
        }
        return edgeList;
    }

}
