class Percentage1
{
 public static void main (String[]P)
{
  int physics = 85;
  int chem = 72;
  int history = 45;
  int maths = 86;
  int cs = 85;
  
 int sum= physics+chem+history+maths+cs;
 double percent= (sum/100)*500;//correct
                 //(sum/500)*100;//0



 int percentage = (int ) percent;
 boolean check =(percentage%2==0);
 String result = (percentage%2==0) ? ("the number is even") : ("the number is odd");
System.out.println(check);
System.out.println(result);

}
}
/* out put
 CT: SUCCESS
 RT: SUCCESS :true
*/