import java.util.Scanner;
class grades {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int a[]=new int[10];
        System.out.println("Enter the marks of the students");
        for(int i=0;i<10;i++) {
            a[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<10;i++) {
            for(int j=i+1;j<10;j++) {
                if(a[i]>a[j]) {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<10;i++) {
            if(a[i]<40)
            System.out.println(a[i] + " FAIL");
            if(a[i]>=40 && a[i]<=50)
            System.out.println(a[i] + " PASS");
            if(a[i]>50 && a[i]<=75)
            System.out.println(a[i] + " MERIT");
            if(a[i]>75)
            System.out.println(a[i] + " DISTINCTION");
        }
    }
 }
