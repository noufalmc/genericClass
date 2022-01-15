package corejava;
public class maxInteger {
    public void checkMax(String a,String b,String c)
    {
        String max=a;
        if(b.length()>max.length())
        {
            max=b;
        }
        if(c.length()>max.length())
        {
            max=c;
        }
        System.out.println("The Maximum Number is = "+max);
    }
}
