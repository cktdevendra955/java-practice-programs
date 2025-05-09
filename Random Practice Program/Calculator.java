class Calculator{
    

    public int calculate(int a, int b){          
        return a+b;
    }

    public int calculate(int a, int b, int c){        
        return a*b*c;        
    }

    public double calculate(double a, double b){        
        return (a+b)/2;
        
    }

    public int calculate(String str){        
        return str.length();
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum : " + c.calculate(10,20));
        System.out.println("Product : " + c.calculate(10,20,30));
        System.out.println("Avrage : " + c.calculate(10.5,4.5));
        System.out.println("String Length : " + c.calculate("Devendra"));
        
    }
}