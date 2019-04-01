/**
 * Exercise 4 - Calculator (Time to Practice)
 */

public class Main {

    public static void main(String[] args) {
        Calculator basic = new Calculator();
        basic.operate("+", 3);
        basic.operate("-", 1);
        basic.operate("*", 15);
        basic.operate("/", 3);
        
        Calculator advanced = new Calculator();
        advanced.firstValue(10); //Assign 10 to result
        advanced.operate("C"); //Reset result to 0
        advanced.operate("cos", 0); //Assign cos(0) to result
        advanced.operate("C"); //Reset result to 0
        advanced.operate("sin", 1); //Assign sin(0) to result
        advanced.operate("log10", 10);
        advanced.operate("C"); //Reset result to 0
        advanced.operate("tan", 0); //Assign tan(0) to result
        advanced.operate("C"); //Reset result to 0
        advanced.operate("!", 5); //Assign the value of 5! to result (120)
        advanced.operate("C"); //Reset result to 0
        advanced.operate("e"); //Assign the value of "e" to result
        advanced.operate("+", 1.25);
        advanced.operate("+", "pi"); //Add the value of pi to result
        advanced.operate("C");
        
        //Add at least 5 different operations and share your codeboard project in the forum.
        //Calculator advanced = new Calculator();
        advanced.operate("square", 12);
        advanced.operate("C");
        advanced.operate("squareRoot", 12);
       // advanced.operate("C");
  
        advanced.operate("arcsin", 1);
        //advanced.operate("C");
       
        advanced.operate("arccos", 0);
        //advanced.operate("C");
      
        advanced.operate("arctan", 0);
        //advanced.operate("C");
    }
}
