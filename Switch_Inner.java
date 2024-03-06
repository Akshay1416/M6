class Switch_Inner
{
 public static void main(String[] SI)
{

int x =2;
int y =1;
int sum=x+y;
switch(x)
{
case 1: switch (y)
               {
                case 1:System.out.println(sum+x);
                break;
                case 2:System.out.println(sum+y);
                break;
                default:System.out.println("invalid input"); 
                 }
break;

case 2:  switch (y)
                {case 1:System.out.println(sum+y);
                 break;
                case 2:System.out.println(sum+x);
                break;
                default:System.out.println("invalid input"); 

                }
break;

default :System.out.println("Invalid input");


}





}
}
