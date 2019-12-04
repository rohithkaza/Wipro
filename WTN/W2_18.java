import java.util.*;
class W2_18{  
 public static void main(String args[]){  
  int r,sum=0,temp;
  Scanner s =new Scanner(System.in);    
  temp=s.nextInt();    
  while(temp>0){    
   r=temp%10;   
   sum=(sum*10)+r;    
   temp/=10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  