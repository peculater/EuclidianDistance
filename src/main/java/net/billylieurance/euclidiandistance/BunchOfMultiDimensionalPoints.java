/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.billylieurance.euclidiandistance;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author wlieurance
 */
public class BunchOfMultiDimensionalPoints {
    public static final Integer dimensions = 200;
    public static final Integer[] trait1 = new Integer[] { 83,9,3,2,2,99,30,19,65,12,19,68,81,93,67,60,81,61,75,71,7,68,56,63,10,16,26,89,38,85,71,82,85,23,77,15,35,73,12,28,64,53,0,89,35,13,21,29,65,1,64,6,85,51,74,3,70,46,75,75,63,21,65,72,1,32,50,10,27,60,44,83,45,56,8,38,17,31,18,30,27,47,55,88,36,34,80,37,32,20,82,67,26,41,35,80,70,18,46,94,1,48,72,93,33,37,87,20,90,23,59,32,8,9,97,38,92,66,42,65,18,26,71,34,59,5,18,52,76,80,75,30,14,86,63,11,6,8,14,6,69,49,8,62,2,99,7,24,94,82,34,64,43,97,62,75,28,51,66,78,51,53,87,40,76,10,58,13,50,95,25,86,93,38,42,44,8,89,36,19,27,33,93,99,0,25,35,30,7,32,18,77,38,5,10,39,66,75,92,59 };
    public static final Integer[] trait2 = new Integer[] { 45,18,30,3,76,49,69,93,16,36,72,45,71,76,71,4,17,31,67,97,86,18,58,93,13,51,72,13,63,56,56,33,96,68,80,36,29,60,85,76,75,53,14,77,98,38,77,75,72,58,85,19,99,58,19,84,40,8,8,17,38,19,43,36,7,62,1,91,32,84,11,85,8,40,57,73,53,55,19,3,30,80,51,97,98,93,77,81,41,24,13,15,1,13,38,19,26,50,44,30,56,39,21,55,52,21,1,60,5,18,6,98,47,53,96,42,72,78,86,40,58,79,25,31,95,90,43,2,63,62,57,37,22,59,23,28,12,78,88,92,82,64,20,91,49,4,34,70,30,18,16,56,36,57,84,77,4,49,82,10,82,25,43,14,13,31,11,31,12,71,37,6,49,67,69,73,74,77,24,66,36,95,14,78,15,64,11,72,40,68,84,60,76,62,94,17,93,24,86,38};
    
    public static final List<Integer> list1 = Arrays.asList(trait1);
    public static final List<Integer> list2 = Arrays.asList(trait2);
 
    
    public final List<Integer[]> listOfTuples = new LinkedList<>();
    
    public BunchOfMultiDimensionalPoints(){
        for (int i = 0; i < dimensions; i++){
            listOfTuples.add(new Integer[] { trait1[i], trait2[i] });
        }
    }

    
    
    
}
