
package codingbat_10;

import java.util.Arrays;

public class CodingBat_10 {

public  String[] fizzArray2(int x){
  String []fizz = new String[x];
  
  for(int i=0;i<fizz.length;i++){
      fizz[i] = String.valueOf(i);
  }
    System.out.println(Arrays.toString(fizz));
    
    
    return fizz;
}
    public static void main(String[] args) {
       CodingBat_10 s = new CodingBat_10();
       
       s.fizzArray2(19);
        
     
    }
    
}
