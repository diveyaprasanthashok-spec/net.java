import java.util.Scanner;
public class JavaApplication20 {
    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
       int temp=n;
       int sn =0;
       while(temp!=0){
           int digit=temp%10;
           int fact = 1;
           for(int i=1;i<=digit;i++){
               fact=fact*i;
           }
           
           sn=sn+fact;
            temp=temp/10;
       }
       temp=n;
       if(sn==n ){
       
       System.out.println(n+" is strong number");
       }else{
           System.out.println(n+" is NOT strong number");
       }
    }
    
}
