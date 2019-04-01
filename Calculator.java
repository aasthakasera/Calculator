import java.lang.Math;

public class Calculator {
    Number result;
    
    public Calculator() {
        this.result = 0;
    }
    
    public void operate (String operator, Number num1) {
        //Make it better! Give a better solution for operate(String, Number)
        Number result = 0;
        switch (operator) {
            case "+": {
                result = this.result.doubleValue() + num1.doubleValue();
                break;
            }
            case "-": {
                result = this.result.doubleValue() - num1.doubleValue();
                break;
            }
            case "/": {
                result = this.result.doubleValue() / num1.doubleValue();
                break;
            }
            case "*": {
                result = this.result.doubleValue() * num1.doubleValue();
                break;
            } 
            case "sin": {
                result = Math.sin(num1.doubleValue());
                break;
            }
            case "cos": {
                result = Math.cos(num1.doubleValue());
                break;
            }
            case "tan": {
                result = Math.tan(num1.doubleValue());
                break;
            }
            case "log": {
                result = Math.log(num1.doubleValue());
                break;
            }
            case "log10": {
                result = Math.log10(num1.doubleValue());
                break;
            }
            case "!": {
                int y = num1.intValue();
                for(int i = num1.intValue()-1;i>0;i--)
                {
                    y = y*i;
                }
                result = y;
                break;
            }
            case "square":
            {
                result =  num1.intValue()*num1.intValue();
                break;
            }
            case "squareRoot": {
                result = Math.sqrt(num1.doubleValue());
                break;
            }
            case "arcsin": {
                result = Math.asin(num1.intValue());
                break;
            }
            case "arccos": {
                result = Math.acos(num1.intValue());
                break;
            }
            case "arctan": {
                result = Math.atan(num1.intValue());
                break;
            }
            default: {
                result = num1;
            }
        }
        if (operator == "cos" || operator == "sin" || operator == "tan" )
        {
            System.out.println(operator + " " + num1.doubleValue() + " = " + result.doubleValue());
        }
        else if (operator == "log" || operator == "log10")
        {
            System.out.println(operator + " " + "(" + num1.doubleValue() + ")" + " = " + result.doubleValue());
        }
        else if(operator == "square" || operator == "squareRoot" || operator == "arcsin" || operator == "arccos" || operator == "arctan")
        {
            System.out.println(operator + " " + num1.doubleValue() + " = " + result.doubleValue());
        }
        else if(operator == "!")
        {
            System.out.println(num1.intValue() + "!" + " = " + result.doubleValue());
        }
        else
        System.out.println(this.result.doubleValue() + " " + operator + " " + num1.doubleValue() + " = " + result.doubleValue());
        this.result = result;
    }
    
        public void operate (String operator) {
        //Complete the missing implementation
        double newValue = 0;
        switch (operator) {
            case "C": {
                newValue = 0;
                break;
            }
            case "e": {
                newValue = Math.E;
                break;
            }
            case "pi": {
                newValue = Math.PI;
                break;
            }
            default: {
                newValue = 0;
            }
                
        }
       
        this.result = newValue;
        System.out.println(this.result.doubleValue());
    }
    public void operate (String operator,String constant) {
        double cons1 = 0;
        switch(constant)
        {
            case "pi":
            {
                cons1 = Math.PI;
                break;
            }
            case "e":
            {
                cons1 = Math.E;
                break;
            }
            default :
            {
                cons1 = 0;
            }
        }
        operate(operator,cons1);
    }
    public void firstValue(Number num1) {
        this.result = num1;
    }
    
}
