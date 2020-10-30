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
    //algoritmo de erastotenes
    public int gcd(int a,int b){
        if(b==0)return a;
        return a>b?gcd(b,a%b):gcd(a,b%a);
    }
    public void reduce(){
        if(this.num==0)return ;
        int gcd = gcd(this.den,this.num);
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
        den *= b.den;
        num *= b.num;
        return this;
    }
    public void res(Racional A,Racional B){
        this.den = A.den * B.den;
        this.num = A.num * B.num;
        this.reduce();
    }
    //---------------suma----------------
    public Racional sum(Racional b){
        

        this.reduce();
        return this;
    }
    public void sum(Racional A,Racional B){
        this.den = A.den + B.den;
        this.num = A.num + B.num;
        this.reduce();
    }
    
    public void imprimir(){
        System.out.println("["+num+","+den+"]");
    }
}