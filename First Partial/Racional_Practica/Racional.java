class Racional{
    private int num,den;
    public Racional(){
        num=1;
        den=1;
    }
    public Racional(int n,int m){
        num=n;
        if(m==0)
            den=1;
        else 
            den = m;
    }
    public void establecer(int num,int den){
        this.num = num;
        if(den==0)
            this.den = 1;
        else 
            this.den = den;
    }
    public void random(){
        establecer((int) (Math.random()*10),(int) (Math.random()*10));
    }
    public int abs(int a){
        return a<0?-1*a:a;
    }
    //algoritmo de erastotenes
    public int gcd(int a,int b){
        if(b==0)return a;
        return a>b?gcd(b,a%b):gcd(a,b%a);
    }
    public void reduce(){
        if(this.num==0)return ;
        int gcd = gcd(abs(this.den),abs(this.num));
        this.den/=gcd;
        this.num/=gcd;
    }
    //---------------mul----------------
    public Racional mul(Racional b){
        den *= b.den;
        num *= b.num;
        this.reduce();
        return this;
    }
    public void mul(Racional A,Racional B){
        this.den = A.den * B.den;
        this.num = A.num * B.num;
    }
    //---------------div----------------
    public Racional div(Racional b){
        den *= b.num;
        num *= b.den;
        this.reduce();
        return this;
    }
    public void div(Racional A,Racional B){
        this.den = A.den * B.num;
        this.num = A.num * B.den;
        this.reduce();
    }
    //---------------resta----------------
    public Racional res(Racional b){
        int den = this.den * b.den;
        int num1 = this.num*b.den; 
        int num2 = this.den*b.num;
        this.num = num1-num2;
        this.den = den;
        this.reduce();
        return this;
    }
    public void res(Racional A,Racional B){
        int den = A.den * B.den;
        int num1 = A.num*B.den; 
        int num2 = A.den*B.num;
        this.num = num1-num2;
        this.den = den;
        this.reduce();
    }
    //---------------suma----------------
    public Racional suma(Racional b){
        int den = this.den * b.den;
        int num1 = this.num*b.den; 
        int num2 = this.den*b.num;
        this.num = num1+num2;
        this.den = den;
        this.reduce();
        return this;
    }
    public void suma(Racional A,Racional B){
        int den = A.den * B.den;
        int num1 = A.num*B.den; 
        int num2 = A.den*B.num;
        this.num = num1+num2;
        this.den = den;
        this.reduce();
    }
    
    public void imprimir(){
        System.out.print("["+num+","+den+"]");
    }

    public boolean Esigual(Racional correcta){
        double a = num/den;
        double b = correcta.num / correcta.den;
        return a==b;
    } 
    public boolean essimp(){
        return num==0 || gcd(abs(num),abs(den))==1;
    }
}