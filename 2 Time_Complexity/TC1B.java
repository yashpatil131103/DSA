import java.util.Scanner;
class TC1B{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ret = Sumofnumber(num);
        System.out.println(ret);

    }
   static int Sumofnumber(int num){
        int sum=0;
        for(int i=0;i<=num;i++){
           sum =sum+i;
        }
        return sum;
    }
}