class test_ten
{
    public static void main(String args[])
    {
        int num=1234,rem=0,rem2=0;
        while(num!=0)
        {
            rem=num%10;
            break;
        }
        int last=rem;
        while(num!=0)
        {
            rem2=num%10;
            num=num/10;
        }
        int first=rem2;
        System.out.println("First digit of no is "+first);
        System.out.println("Last digit of no is "+last);
    }
}
