public class Armstrong 
{
    public static void main(String args[])
    {
        int N=253;
        int temp;
        int org=N;
        int Armstrong=0;

        while(N>0)
        {
            temp=N%10;
            temp=temp*temp*temp;
            Armstrong=Armstrong+temp;
            N=N/10;
        }

        if(Armstrong==org)
        System.out.println("This is an ArmStrong Number");
        else
        System.out.println("This is NOT an ArmStrong Number");
    }
    
}
