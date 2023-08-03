class ternary
{
    public static void main(String args[])
    {
        int a=3,b=4;
        //String k=a>b?"1":"0";
        String p=a%2==0?"1":"0";
        //if(k=="1")
        //{
          //  System.out.println("a is greater");
        //}
        //else if(k=="0")
        //{
          //  System.out.println("b is greater");
        //}
         if(p=="1")
        {
            System.out.println("a is even");
        }
        else if(p=="0")
        {
            System.out.println("a is odd");
        }
    }
}