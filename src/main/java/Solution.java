import java.nio.file.FileAlreadyExistsException;

public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        double average = (t1+t2+t3+t4)/4;// remove 0.0 and return your answer
        return average;
    }

    public int roundAverage(double average) {
        int roundAverage = (int) (average+0.5);
    // remove 0 and return your answer
        return roundAverage;
    }

    public boolean isPassing(int roundedAverage) {
        return roundedAverage >=65; // remove false and return your answer

    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return (double)(shares*price);
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        if (totalStock>=0){
         return   (int)(totalStock+0.5);
        }else
          return   (int)(totalStock-0.5);
    }
    

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
       int hundreds = ((int)((userDouble / 100)+1)%10);
    
       int tens = ((int)((((userDouble % 100))/10)+1)%10);
       int ones = ((int)((userDouble%10)+1)%10);
       int tenths =((int)(((userDouble * 10)%10)+1)%10);
       System.out.println(tenths);
       int hundredths=((int)(((userDouble*100)%10)+1)%10);
double x= hundreds*100.0+tens*10.0+ones+tenths/10.0+hundredths/100.0;
//200.0 + 30 + 4 + 5/10 -> 0 
return x;   
}

        public static void main(String[] args) {
            Solution s = new Solution();
            System.out.println(s.adjustDigits(123.49));
        }
}

