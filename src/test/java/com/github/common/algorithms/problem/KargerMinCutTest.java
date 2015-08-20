package com.github.common.algorithms.problem;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class KargerMinCutTest {

    KargerMinCut kargerMinCut;

    @Before
    public void setUp() {
        kargerMinCut = new KargerMinCut();
    }

    @Test
    public void kargerMinCutTest() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("kargerMinCut.txt").getFile());
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split("\t");
                int nodeId = Integer.valueOf(line[0]);
                List<Integer> edges = new ArrayList<Integer>();
                for (int i = 1; i < line.length; i++) {
                    edges.add(Integer.valueOf(line[i]));
                }
                adjList.put(nodeId, edges);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        kargerMinCut.findMinCut(adjList, adjList.size() * adjList.size());

    }

}
