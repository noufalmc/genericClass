package corejava;
public class maxInteger {
    public void checkMax(int a,int b, int c)
    {
        int max=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        System.out.println("The Maximum Number is = "+max);
    }
}
