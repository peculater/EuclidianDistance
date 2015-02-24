/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.billylieurance.euclidiandistance;

/**
 *
 * @author wlieurance
 */
public class App {

    private static final Integer iterations = 500_000;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Long start, stop, elapsed;
        Double result;
        
        System.out.println("Naive implementation x" + iterations.toString() + " gives");
        start = System.currentTimeMillis();
        result = naive();
        stop = System.currentTimeMillis();
        elapsed = stop - start;
        System.out.println("  " + result.toString() + " in " + elapsed.toString() + " milliseconds");
        
        System.out.println("Naive implementation with primitive data types x" + iterations.toString() + " gives");
        start = System.currentTimeMillis();
        result = naivePrimitive();
        stop = System.currentTimeMillis();
        elapsed = stop - start;
        System.out.println("  " + result.toString() + " in " + elapsed.toString() + " milliseconds");
        
        System.out.println("Java8 map-reduce implementation x" + iterations.toString() + " gives");
        start = System.currentTimeMillis();
        result = java8();
        stop = System.currentTimeMillis();
        elapsed = stop - start;
        System.out.println("  " + result.toString() + " in " + elapsed.toString() + " milliseconds");
        
        System.out.println("GPU implementation x" + iterations.toString() + " gives");
        start = System.currentTimeMillis();
        result = gpu();
        stop = System.currentTimeMillis();
        elapsed = stop - start;
        System.out.println("  " + result.toString() + " in " + elapsed.toString() + " milliseconds");

    }
    
    
    public static Double naive(){
        Double result  = 0d;
        for (int j = 0; j < iterations; j++) {
            Integer running = 0;
            for (int i = 0; i < BunchOfMultiDimensionalPoints.dimensions; i++) {
                Integer t1 = BunchOfMultiDimensionalPoints.trait1[i];
                Integer t2 = BunchOfMultiDimensionalPoints.trait2[i];
                running += (t1 - t2) * (t1 - t2);
            }
            result = Math.sqrt(running);
        }
        //System.out.println("  Running is " + running.toString());
        return result;
    }
    
    public static Double naivePrimitive(){
        Double result  = 0d;
        for (int j = 0; j < iterations; j++) {
            int running = 0;
            for (int i = 0; i < BunchOfMultiDimensionalPoints.dimensions; i++) {
                int t1 = BunchOfMultiDimensionalPoints.primitiveTrait1[i];
                int t2 = BunchOfMultiDimensionalPoints.primitiveTrait2[i];
                //running += (t1 - t2) * (t1 - t2);
                running += (t1 - t2)*(t1 - t2);
            }
            result = Math.sqrt(running);
        }
        //System.out.println("  Running is " + running.toString());
        return result;
    }
    
    public static Double java8(){
       Double result  = 0d;
       BunchOfMultiDimensionalPoints bomdp = new BunchOfMultiDimensionalPoints();
       for (int j = 0; j < iterations; j++) {
         result  = Math.sqrt(bomdp.listOfTuples.stream().mapToInt((squareable) -> (squareable[0] - squareable[1]) * (squareable[0] - squareable[1])).sum());
       }
        //System.out.println("  Running is " + running.toString());
        return result;
    }

    
    public static Double gpu(){
        
        return 0d;
    }

}
