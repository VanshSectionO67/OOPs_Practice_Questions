class test3
{
    public static void main(String args[])
    {
        int a=4;
        if(a%2==0)
        {
            System.out.println("No. is Even");
        }
        else if(a%3==0){
            System.out.println("No is divisible by 3");
        }
        else if(a%3!=0)
        {
            System.out.println("No is not divisible by 3");
        }
        else
        {
            if(a%3==0){
            System.out.println("No is divisible by 3");
        }
        else if(a%3!=0)
            System.out.println("No is Odd");
        }


    }
}