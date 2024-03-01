public class Palindrome
    {
        private static Scanner in;

        public static void main(String[] args)
        {
            String s,str1,str2;
            Scanner scan =new Scanner (System.in);
            System.out.println("Enter the string");
            String s = in.nextLine();
            StringBuffer str1 = new StringBuffer();
            StringBuffer str2 = new StringBuffer();
            str1.reverse();
            System.out.println("orignal string="+str2);
            System.out.println("reveser string="+str1);
             if(String.valueOf(str1).compareTo(String.valueOf(str2))==0)

                System.out.println("palindrom");

             else
                 System.out.println("not palindrom");
        }
    }