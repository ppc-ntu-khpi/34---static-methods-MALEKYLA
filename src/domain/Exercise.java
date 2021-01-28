public class Exercise
{
    public static void main(String[] args)
    {
        int a[]={1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        int sum=732;
        int k=a.length-1;
        while(k>=0)
        {
            if(a[k]>sum)
            {
                k--;
            }
            else
            {
                System.out.println(sum+" - "+a[k]);
                sum-=a[k];
            }
        }
        return;
    }
}
