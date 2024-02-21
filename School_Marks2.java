class School_Marks2 
{
    public static void main(String[] SM) {
        // Print basic information
        System.out.println("        ");
        System.out.println("                     D.Y.Patil");
        System.out.println("                        scc");
        System.out.println("Name=D.Y.Patil                        Date=00/00/0000");
        System.out.println("ROLL no=69             Sec=A             Exam=10TH");
        System.out.println("        ");

        // Print subjects and marks obtained
        System.out.println("Subject               Full Marks        Marks Obtain");
        System.out.println("__________________________________________________________");
        System.out.println("1 Maths               100                69");
        System.out.println("2 Physics             100                69");
        System.out.println("3 Chem                100                69");
        System.out.println("4 History             100                69");
        System.out.println("5 CS                  100                69");
        System.out.println("__________________________________________________________");

        // Calculate total marks and percentage
        int m1 = 69, m2 = 69, m3 = 69, m4 = 69, m5 = 69;
        int totalMarks = m1 + m2 + m3 + m4 + m5;
        double percent = (totalMarks * 100) / 500;

        // Print total marks and percentage
        System.out.println("Total                 500               " + totalMarks);
        System.out.println("__________________________________________________________");

        // Determine grade based on percentage
        String grade = (percent >= 100) ? "A" :
                      (percent >= 60) ? "B" :
                      (percent >= 40) ? "C" :
                      (percent >= 35) ? "D" : "F";

        // Print percentage and grade
        System.out.println("Percentage            " + percent + "                           " + grade);
        System.out.println("        ");

        // Determine performance based on percentage
        String performance = (percent >= 100) ? "V Very good" :
                             (percent >= 60) ? "Very good" :
                             (percent >= 40) ? "Moderate" :
                             (percent >= 35) ? "Poor" : "Fail";

        // Print performance and signature
        System.out.println(performance + "                                   " + "Sign  Akshay");
    }
}

/* out put
 CT: SUCCESS
 RT: SUCCESS :
                     D.Y.Patil
                        scc
Name=D.Y.Patil                        Date=00/00/0000
ROLL no=69             Sec=A             Exam=10TH

Subject               Full Marks        Marks Obtain
__________________________________________________________
1 Maths               100                69
2 Physics             100                69
3 Chem                100                69
4 History             100                69
5 CS                  100                69
__________________________________________________________
Total                 500               345
__________________________________________________________
Percentage            69.0                           B

Very good                                   Sign  Akshay
*/
