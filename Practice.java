
/**
 * Write a description of class Practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practice
{
    // instance variables - replace the example below with your own
    //a <=b
    /**
     * Constructor for objects of class Practice
     */
    public Practice()
    {

    }
    // inc opp
    public void thisIsThis()
    {
        int sum = 0;
        int num = 1;
        while(num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("The sum is: " + sum);

    }

    public void Sum(int a,int b)
    {
        int result = 0;
        while (a <= b) 
        {
            result+=a;
            a++; 
        }   

        System.out.println("The sum is: "+ result); 
    }

    public boolean isPrime(int n)
    { int divisor = 2;
        while(divisor < n ) {
            if(n % divisor == 0) {
                return false;
            }
            divisor = divisor + 1;

        }
        if(n == 1) {
            return false;

        }
        return true;
    }
     
    public void print()
    {
        System.out.print("Hello world");
    }

    public void multiplesOfFive()
    {
        int multiple = 10;
        while(multiple <= 95) {
            System.out.println(multiple);
            multiple = multiple + 5;
        }
    }
}
