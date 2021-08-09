import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class first {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        long A=in.nextLong();
        long B=in.nextLong();
        long C=in.nextLong();
        long D=in.nextLong();
        long res=-1000000000000000000l;
        if(A*C>res){
            res=A*C;
        }
        if(A*D>res){
            res=A*D;
        }
        if(B*C>res){
            res=B*C;
        }
        if(B*D>res){
            res=B*D;
        }
        System.out.print(res);
    }
}