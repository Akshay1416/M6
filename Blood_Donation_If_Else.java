class Blood_Donation_If_Else
{
 public static void main(String[] SIE)
{
char blood_type='o';
int hemoglobin=13;
int age=25;
//Yes(Y) NO (N)
char diseases='N';
char drugs_and_alcohal='N';

if(age>=20&&age<=60)
  {
   if(hemoglobin>=13)
      {
       if(diseases=='N')
          {
           if(drugs_and_alcohal=='N')
              {
               System.out.println("You are eligible for blood donation");
              } 
            else
               {
                System.out.println("You are not eligible for blood donation");
               }   
          }
       else
          {
           System.out.println("You are not eligible for blood donation");
          }    
      }
    else
      {
       System.out.println("You are not eligible for blood donation");
      }
  }
else
{
 System.out.println("You are not eligible for blood donation");
}


}
}


/* out put
 CT: SUCCESS
 RT: SUCCESS : Sorry you did get admission
*/