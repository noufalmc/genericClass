package corejava;
public class maxInteger {
    public void checkMax(float a,float b, float c)
    {
        float max=a;
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
