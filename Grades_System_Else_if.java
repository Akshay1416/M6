class Grades_System_Else_if 
{
    public static void main(String[] args)
{
        int m = 85;

        if (m >= 90 && m <= 100) 
{
            System.out.println("Grade: A Plus");
        }
 else if (m >= 80 && m < 90) {
            System.out.println("Grade: A");
        } 
else if (m >= 70 && m < 80) {
            System.out.println("Grade: B Plus");
        } 
else if (m >= 60 && m < 70) {
            System.out.println("Grade: B");
        } 
else if (m >= 50 && m < 60) {
            System.out.println("Grade: C Plus");
        } 
else if (m >= 40 && m < 50) {
            System.out.println("Grade: c");
        } 
else if (m >= 35 && m < 40) {
            System.out.println("Grade: D");
        } 
else if (m >= 0 && m < 35) {
            System.out.println("Grade: Fail");
        } 
else {
            System.out.println("Invalid input");
        }
    }
}
