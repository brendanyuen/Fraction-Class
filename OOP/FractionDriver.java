class FractionDriver{

    public static void main(String args[]){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(1,2);
        Fraction f3 = new Fraction(1,2);
        System.out.println(f1);
        System.out.println(f2);
        
        System.out.println(Fraction.add(f2,f3));
        System.out.println(Fraction.subtract(f2,f3));
        System.out.println(Fraction.multiply(f2,f3));
        System.out.println(Fraction.divide(f2,f3));
        
        
        Fraction f4= new Fraction(0,0);
        
        Fraction f5= new Fraction(1,0);
        
        Fraction f6 =new Fraction(-1,-1);
        System.out.println(f6);
    }
    
    
}