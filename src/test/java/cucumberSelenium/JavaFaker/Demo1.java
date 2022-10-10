package cucumberSelenium.JavaFaker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Demo1 {

    public int expected = 10;
    public int sum (int a, int b){
        return a + b;
    }
 @Test
 public void testSum(){
     Assertions.assertEquals(expected, sum(5, 5));
 }

    public static void main(String[] args) {

    }
//    public boolean either24(int[] nums) {
//        int two = 0;
//        int four = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == 2 && nums [i + 1] == 2) two ++;
//            if (nums[i] == 4 && nums [i + 1] == 4) four ++;
//        }
//        if (two ! = 0 && four ! = 0)
//        return false;
//  else return two ! = 0 || four ! = 0;
//    }
}
