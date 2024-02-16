class Largest_Number1
{
 public static void main (String [] ln)
{

int a=10, b=20, c=30, e=40;

 
//kunal
//int result = (a > b) ? ((a > c) ? (a):(( c > e) ? (c) : (e) )) :(( b > c ) ? (b) : (( c > e ) ? (c) : (e) ));

int result = (a > b) ? ((a > c) ? ((a > e) ? a : e) : ((c > e) ? c : e)) : ((b > c) ? ((b > e) ? b : e) : ((c > e) ? c : e));

System.out.println(result);

}
}
/* out put
 CT: SUCCESS
 RT: SUCCESS :40
*/ 