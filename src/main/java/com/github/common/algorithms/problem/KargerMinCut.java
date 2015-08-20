package com.github.common.algorithms.problem;


import java.util.*;

public class KargerMinCut {

    private Random random = new Random();
    private Map<Integer, List<Integer>> contractedAdjList;

    public void findMinCut(Map<Integer, List<Integer>> adjList, int iterations) {
        contractedAdjList = new HashMap<>(adjList);
        for (int i = 0; i < iterations; i++) {
            randomizedContraction(contractedAdjList);
        }
    }

    public void randomizedContraction(Map<Integer, List<Integer>> contractedAdjList) {
        int node = random.nextInt(contractedAdjList.size()) + 1;
        System.out.println(node);

    }

}
