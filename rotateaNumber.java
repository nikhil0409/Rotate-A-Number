import java.util.Scanner;

public class rotateaNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nod = 0;
        int temp = n ;
        while(temp!=0){
            temp = temp/10;
            nod++;
        }
        k = k%nod;
        if(k<0)
            k = k + nod;
        int div = (int)Math.pow(10, k);
        int mul = (int)Math.pow(10, nod-k);

        int quo = n/div;
        int rem = n%div;

        int rotatedNumber = mul*rem + quo;
        System.out.println(rotatedNumber);
    }
}
