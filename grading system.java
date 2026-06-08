mport java.util.Scanner;

class one{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark");
        int mark = sc.nextInt();
        try {
            if(mark>89){
                System.out.println("Grade A");

            }else if(mark>75){
                System.out.println("Grade B");


            }else if(mark>60){
                System.out.println("Grade C");

            }else{
                int result = 10/0;

            }

        }catch (ArithmeticException e){
            System.out.println("Failed");
        }
        



    }
}
