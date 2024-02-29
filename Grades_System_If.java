class Grades_System_If

{
    public static void main(String[] GSI) 
{
        int m = 85; 

        if (m >= 90 && m <= 100) 
        {
            System.out.println("Grade: A Plus");
        }
        if (m >= 80 && m < 90) 
        {
            System.out.println("Grade: A");
        }
        if (m >= 70 && m < 80) 
        {
            System.out.println("Grade: B Plus");
        }
        if (m >= 60 && m < 70) 
        {
            System.out.println("Grade: B");
        }
        if (m >= 50 && m < 60) 
        {
            System.out.println("Grade: C Plus");
        }
        if (m >= 40 && m < 50) 
        {
            System.out.println("Grade: C");
        }
        if (m >= 35 && m < 40) 
        {
            System.out.println("Grade: D");
        }
        if (m >= 0 && m < 35) 
        {
            System.out.println("Grade: Fail");
        }
        
    }
}
