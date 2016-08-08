public class PrimeIntervals{
public static int main(String[] args)
{
Scanner s=new Scanner(System.in);
    int m, n1, j, flag1;
    System.out.println("Enter two numbers(intevals):");
    int b=s.nextInt();
    int c=s.nextInt();
    while (b < c)
    {
        flag1=0;

        for(i=2; i<=b/2; ++i)
        {
            if(b%i == 0)
            {
                flag1=1;
                break;
            }
        }

        if (flag1 == 0)
            printf("%d ",b);

        ++b;
    }

    return 0;
