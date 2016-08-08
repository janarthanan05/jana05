public class RandomHelper {
public static int randint(int a,int b)
{
	return (int) (Math.random()*((b-a)+1)+a);
}
static int randdouble(int a,int b)
{
	return (int) (Math.random()*(b-a)+1);
}
}
public class Random {
public static void main(String[] args) {
	System.out.println(RandomHelper.randint(1, 10));
	System.out.println(RandomHelper.randdouble(1,10));
	}}
