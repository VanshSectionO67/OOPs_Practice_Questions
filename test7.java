class test7
{
    public static void main(String args[])
    {
        int num=123,rem=0,rev=0;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("Reverse of number is "+rev);
    }
}