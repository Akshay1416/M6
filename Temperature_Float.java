class Temperature_Float
{
public static void main (String[]T)
{
  float t= 39.93f;
  String result=(t>=0&&t<=10)?("Very cold"):((t>=10&&t<20)?("Cold"):(t>=20&&t<30)?("Moderate"):(t>=30&&t<40)?("Summer"):(t>=40&&t<=50)?("Very hot"):("Extremely hot"));

System.out.println(result);
}
}
/* out put
 CT: SUCCESS
 RT: SUCCESS :Summer
@=64
*/