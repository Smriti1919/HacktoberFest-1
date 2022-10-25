import java.util.*;
class Main{ 
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter a numnber to find its factorial");
  int n=sc.nextInt();
  int f=1;
  for(int i=1;i<=n;i++)
    f*=i;
  System.out.println(f);
 }
}
