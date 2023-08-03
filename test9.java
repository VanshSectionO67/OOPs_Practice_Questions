class test9
{
    public static void main(String args[])
    {
        int num=414,rem=0,rev=0;
        int temp=num;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(rev==temp)
        System.out.println(temp+" is a pallendrome no");
        else
        System.out.println(temp+" is not a pallendrome no");
    }
}