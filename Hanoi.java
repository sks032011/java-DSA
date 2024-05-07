class Hanoi
{
    public static void tower(int n,String s,String h,String d){
        if (n==1) {
            System.out.println("Transfer disc"+n+"from"+s+"to"+d);
            return;
        }
        tower(n-1,s,h,d);
        System.out.println("Transfer disc"+n+"from"+s+"to"+d);
        tower(n-1,h,s,d);
    }
    public static void main(String[] args) {
        int n=3;
        tower(n,"S","H","D");
    }
}