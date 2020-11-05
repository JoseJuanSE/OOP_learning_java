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
    public Racional mult(Racional b){
        den *= b.den;
        num *= b.num;
        return this;
    }
    public void mult(Racional A,Racional B){
        this.den = A.den * B.den;
        this.num = A.num * B.num;
    }
    public int gcd(int a,int b){
        if(b==0)return a;
        return a>b?gcd(b,a%b):gcd(a,b%a);
    }
    public void reduce(){
        int gcd = gcd(this.den,this.num);
        this.den/=gcd;
        this.num/=gcd;
    }
    /*public void div(int B){
        
    }*/
    public void imprimir(){
        System.out.println("["+num+","+den+"]");
    }
    public boolean mayorQue(Racional R){
		//return num*R.den > den*R.num; 
		return (double)(num/den)>(double)(R.num/R.den);	
	}
}