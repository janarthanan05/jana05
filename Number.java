
public class Num23 {

	
	public static void main(String[] args) {
		int count=3;
		int o=count;
		char temp;
      int len=args[0].length();
      len=len-1;
      char[] c=args[0].toCharArray();
      while(count!=0)
      {
    	  int c=0;
    	  int j=0;
    	  for(int k=0;k<len;k++)
    	  {
    		  if(d[j]<d[k])
    		  {
    			  j=k;
    			  c=k;
    		  }
    	  }
    	  for(int l=c;l<len;l++)
    	  {
    		  d[l]=d[l+1];
    	  }
    	  count--;
    	  c[len]=0;
    	 len = len--;
      }
      for(int j=0;j<=len-o;j++)
      {
      for(int k=j;k<=len-o;k++)
      {
    	  if(d[k]<d[j])
    	  {
    		temp=d[k];
    		d[k]=d[j];
    		d[j]=temp;
    	  }
      }
      }
      for(int j=0;j<=len-o;j++)
      {
    	  System.out.print(d[j]);
      }
	}
