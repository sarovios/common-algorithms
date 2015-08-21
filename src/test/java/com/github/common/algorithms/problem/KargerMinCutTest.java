package com.github.common.algorithms.problem;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class KargerMinCutTest {

    KargerMinCut kargerMinCut;

    @Before
    public void setUp() {
        kargerMinCut = new KargerMinCut();
    }

    @Test
    public void kargerMinCutSmallTest() {
//        Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>() {{
//            put(1, new ArrayList<Integer>(){{ add(3); add(2); }});
//            put(2, new ArrayList<Integer>(){{ add(1); add(3); add(4);}});
//            put(3, new ArrayList<Integer>() {{ add(1); add(2); add(4);}});
//            put(4, new ArrayList<Integer>() {{ add(3); add(2); }});
//        }};
        List<int[]> edgeList = new ArrayList<int[]>() {{
            add(new int[]{1, 2});
            add(new int[]{1, 3});
            add(new int[]{2, 3});
            add(new int[]{2, 4});
            add(new int[]{3, 4});
        }};

        kargerMinCut.findMinCut(edgeList);
    }

//    @Test
//    public void kargerMinCutTest() {
//        ClassLoader classLoader = getClass().getClassLoader();
//        File file = new File(classLoader.getResource("kargerMinCut.txt").getFile());
//        Map<Integer, List<Integer>> adjList = new HashMap<>();
//        try (Scanner scanner = new Scanner(file)) {
//            while (scanner.hasNextLine()) {
//                String[] line = scanner.nextLine().split("\t");
//                int nodeId = Integer.valueOf(line[0]);
//                List<Integer> edges = new ArrayList<Integer>();
//                for (int i = 1; i < line.length; i++) {
//                    edges.add(Integer.valueOf(line[i]));
//                }
//                adjList.put(nodeId, edges);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        kargerMinCut.findMinCut(adjList, adjList.size() * adjList.size());
//
//    }

}
