/* package codechef; // don't place package name! */
/*we are calculating the maxsum in three stacks
  but the elements in all the stacks should be equal(Constraint)
*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class threeStack
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner in=new Scanner(System.in);
		    int sum1=0,sum2=0,sum3=0;
		    Stack<Integer> s1=new Stack<>(),s2=new Stack<>(),s3=new Stack<>();
		    for (int i=1;i<=5 ;i++)
		    {//Pushing the elements in Stack1
		    s1.push(i);sum1+=i;
		    }
		    for(int i=2;i<=5;i++){//Pushing the elements in Stack2
		    s2.push(i);sum2+=i;
		    }
		    for(int i=0;i<=4;i++){//Pushing the elements in Stack3
		    s3.push(i);
		    sum3+=i;
		    }
		    boolean flag=false;
		    while(true)
		    {
		        if(s1.size()==0 || s2.size()==0 || s3.size()==0)
		        break;
		        if(sum1==sum2 && sum2==sum3)
		        {
		            System.out.println(sum1);
		            flag=true;
		        }
		        if(sum1>=sum2 && sum2>=sum3)
		        {
		            sum1-=s1.pop();
		        }
		        else if(sum2>=sum1 && sum2>=sum3)
		        {
		            sum2-=s2.pop();
		        }
		        else if(sum3>=sum1 && sum3>=sum2)
		        {
		            sum3-=s3.pop();
		        }
		    }
		    if(!flag)
		    System.out.println("Max is not possible using the given elements in Stack");
		} 
		catch(Exception e)
		{
		    
		}
	}
}
