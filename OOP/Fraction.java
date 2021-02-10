class Fraction{
    private int num;
    private int denom;

    public Fraction(){
        this.num=1;
        this.denom=1;

    }

    public Fraction(int num, int denom){
        this.num=num;
        if(denom==0){
            System.out.println("Error");
            denom=1;
        }
        
        else{
            this.denom=denom;   
        }
        if(this.num<0&&this.denom<0){
            this.num=Math.abs(this.num);   
            this.denom=Math.abs(this.denom);
        }
        
    }

    public Fraction(String str){
        int slashIndex = str.indexOf("/");
        String n = str.substring(0, slashIndex);
        String d = str.substring(slashIndex+1);
        this.num = Integer.parseInt(n);
        int trapped = Integer.parseInt(d);
        if (trapped == 0) {
            System.out.println("Error");
            denom = 1;
        } else {
            this.denom = trapped;
        }

    }

    public Fraction(Fraction f){
        this.num=f.num;
        this.denom=f.denom;
    }

    public int getNum(){
        return this.num;   
    }

    public int getDenom(){
        return this.denom;   
    }

    public String toString(){
        return this.num+"/"+this.denom;   
    }

    public double toDouble(){
        return (double)this.num/this.denom;   
    }

    public void reduce() { 
        
        int gcf = gcf(this.num, this.denom);
        this.num = this.num / gcf;
        this.denom = this.denom / gcf; 
    }

    public int gcf(int a, int b) {
        //calculates and returns the GCF between two numbers

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
        {
            return 1;
        }

        while (a != b)
        {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public static Fraction multiply(Fraction a,Fraction b){
        int newNum=a.num*b.num;
        int newDenom=a.denom*b.denom;
        Fraction ans = new Fraction(newNum , newDenom);
        ans.reduce();
        return ans;
    }

    public static Fraction divide(Fraction a,Fraction b){
        if(b.num==0){
            System.out.println("Error");
            return new Fraction(1,1);
        }
        else{
            int newNum=a.num*b.denom;
            int newDenom=a.denom*b.num;
            Fraction ans = new Fraction(newNum , newDenom);
            ans.reduce();
            return ans;
        }
    }

    public static Fraction add(Fraction a,Fraction b){
        int newNum=a.num*b.denom+a.denom*b.num;
        int newDenom=a.denom*b.denom;
        Fraction ans = new Fraction(newNum , newDenom);
        ans.reduce();
        return ans;
    }

    public static Fraction subtract(Fraction a,Fraction b){
        int newNum=a.num*b.denom-a.denom*b.num;
        int newDenom=a.denom*b.denom;
        Fraction ans = new Fraction(newNum , newDenom);
        ans.reduce();
        return ans;
    }
}