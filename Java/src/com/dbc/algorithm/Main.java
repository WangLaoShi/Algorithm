package com.dbc.algorithm;

import com.dbc.algorithm.Array.*;
import com.dbc.algorithm.Pointer.*;
import com.dbc.algorithm.UnionFindSets.*;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        int result = SubarraysWithKDifferentIntegers.subarraysWithKDistinct(new int[]{1,2,1,2,3}, 2);
        System.out.println(result);
    }
}