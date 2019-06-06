
/**
 Stores a sequence of integer data values and supports some computations
 with it.

 CS 455 Lab 4.
 */
import java.util.ArrayList;
public class Nums {

    private ArrayList<Integer> nums;

    /**
     Create an empty sequence of nums.
     */
    public Nums () {
        this.nums = new ArrayList<>();
    }

    /**
     Add a value to the end of the sequence.
     */
    public void add(int value) {
        this.nums.add(value);
    }


    /**
     Return the minimum value in the sequence.
     If the sequence is empty, returns Integer.MAX_VALUE
     */
    public int minVal() {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < this.nums.size(); i++) {
            if (this.nums.get(i) < minValue) {
                minValue = this.nums.get(i);
            }
        }
        return minValue;    // stub code to get it to compile

    }

    /**
     Prints out the sequence of values as a space-separated list
     on one line surrounded by parentheses.
     Does not print a newline.
     E.g., "(3 7 4 10 2 7)", for empty sequence: "()"
     */
    public void printVals() {
        String printStr = "(";
        for (int i = 0; i < this.nums.size(); i++) {
            printStr += this.nums.get(i).toString();
            if (i < (this.nums.size()-1)) {
                printStr += " ";
            }
        }
        printStr += ")";
        System.out.print(printStr);
    }

    /**
     Returns a new Nums object with all the values from this Nums
     object that are above the given threshold.  The values in the
     new object are in the same order as in this one.
     E.g.: call to myNums.valuesGT(10) where myNums = (3 7 19 4 21 19 10)
     returns      (19 21 19)
     myNums after call:  (3 7 19 4 21 19 10)
     The method does not modify the object the method is called on.
     */
    public Nums valuesGT(int threshold) {

        Nums nums1 = new Nums();
        for (int i = 0; i < this.nums.size(); i++) {
            if (this.nums.get(i) > threshold) {
                nums1.add(this.nums.get(i));
            }
        }
        return nums1;  // stub code to get it to compile
    }
}
