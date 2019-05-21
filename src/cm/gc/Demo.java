package cm.gc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

import static java.util.Collections.newSetFromMap;

public class Demo {



    public static void main(String[] args) {
      /* int[] arr = {20,30,25,45,15,2};

       int temp;
       for(int i = 0; i < arr.length-1; i++){
           for(int j = i+1;j < arr.length; j++){
               if(arr[i] > arr[j]){
                   temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
               }
           }
       }

       for (int i = 0;i < arr.length;i++){
           System.out.println(arr[i]);
       }*/


      int value = 10000000;
      Set<Integer> set = new HashSet(); // 非同步，非线程安全的Set

      while (set.size() <= value){
          Random random = new Random();
          int i1 = random.nextInt(value + 1);
          set.add(i1);
      }
        set.forEach(System.out::println);
    }
}
