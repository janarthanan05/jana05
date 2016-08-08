public class Even_Odd

{

    public static void main(String[] args) 

    {

        int o;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");

        o = s.nextInt();

        int c[] = new int[o];
        System.out.println("Enter all the elements:");

        for (int i = 0; i < n; i++) 

        {

            c[i] = s.nextInt();

        }

        System.out.print("Odd numbers:");

        for(int i = 0 ; i < n ; i++)

        {

            if(c[i] % 2 != 0)

            {

                System.out.print(c[i]+" ");

            }

        }

        System.out.println("");

        System.out.print("Even numbers:");

        for(int i = 0 ; i < n ; i++)

        {

            if(c[i] % 2 == 0)

            {

                System.out.print(c[i]+" ");

            }

        }

    }}
