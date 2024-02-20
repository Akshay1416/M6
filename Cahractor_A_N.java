class Cahractor_A_N
{
public static void main (String[]CAN)
{
   char c = 'a';
   String result= (c>='a'&&c<='z'|| c>='A'&& c<='Z') ? ("alphabet") : ("not alphabet");

// String result1- (c>=97 && c<=122 || c>= 65 && c<=90) ? ("alphabet") : ("not alphabet"); 

System.out.println("This " +c+ " Cahractor is " + result);
}
}
/* out put
 CT: SUCCESS
 RT: SUCCESS :This a Cahractor is alphabet
*/