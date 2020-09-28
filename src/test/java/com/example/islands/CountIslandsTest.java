package com.example.islands;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CountIslandsTest {

    CountIslands countIslandsObj = new CountIslands();

    @Test
    void countIslandsWithBlankMatrix() {
        int blank[][] = new int[][] {
        };
        int islands = countIslandsObj.countNumberOfIslands(blank);
        Assertions.assertEquals(0, islands, "Assert failed when passing blank input");
    }

    @Test
    void checkWthBasicInput() {
        int input[][] = new int[][] {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };
        int islands = countIslandsObj.countNumberOfIslands(input);
        Assertions.assertEquals(5, islands, "Assert failed when passing basic input"+ Arrays.deepToString(input));
    }

    @Test
    void checkWthApplicationInput() {
        int input[][] = new int[][] {
                {1, 1, 0, 1, 0, 1, 1, 1, 1},
                {0, 1, 0, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 1, 1, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 1, 1, 1},
                {0, 1, 0, 1, 0, 1, 1, 0, 1} };
        int islands = countIslandsObj.countNumberOfIslands(input);
        Assertions.assertEquals(2, islands, "Assert failed when passing application input"+ Arrays.deepToString(input));
    }

    @Test
    void checkWithOnly0Values() {
        int input[][] = new int[][] {
                {0, 0, 0 ,0}
        };
        int islands = countIslandsObj.countNumberOfIslands(input);
        Assertions.assertEquals(0, islands, "Assert failed when passing input with only 0 values"+ Arrays.deepToString(input));
    }

    @Test
    void checkWithOnlyOneElement() {
        int input[][] = new int[][] {
                {0}
        };
        int islands = countIslandsObj.countNumberOfIslands(input);
        Assertions.assertEquals(0, islands, "Assert failed when passing input with only 1 value"+ Arrays.deepToString(input));

        int input2[][] = new int[][] {
                {1}
        };
        int islands2 = countIslandsObj.countNumberOfIslands(input2);
        Assertions.assertEquals(1, islands2, "Assert failed when passing input with only 1 value"+ Arrays.deepToString(input2));
    }

    @Test
    void checkWithNonBinaryValues() {
        // We should ignore non-zero/one values
        int input[][] = new int[][] {
                {9, 0, 0}
        };
        int islands = countIslandsObj.countNumberOfIslands(input);
        Assertions.assertEquals(0, islands, "Assert failed when passing input with non-binary values"+ Arrays.deepToString(input));

        int input2[][] = new int[][] {
                {9, 0, 1}
        };
        int islands2 = countIslandsObj.countNumberOfIslands(input2);
        Assertions.assertEquals(1, islands2, "Assert failed when passing input with non-binary values"+ Arrays.deepToString(input2));
    }
}