// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String str = args[0];
            String UpStr = str.toUpperCase();
            int times = Integer.parseInt(args[1]);
                 for (int i = 0 ; i<str.length();i++)
                  {
                   System.out.print("Give me ");
                   char ch= UpStr.charAt(i);
                   switch (ch)
                   {
                                case 'A':
                                case 'E':
                                case 'F':
                                case 'H':
                                case 'I':
                                case 'L':
                                case 'M':
                                case 'N':
                                case 'O':
                                case 'R':
                                case 'X':
                                case 'S':
                                        System.out.println("an " + ch + ": " + ch + "!");
                                break;
                                default:
                                        System.out.println("a  " + ch + ": " + ch + "!");
                    }
                  }
                        System.out.println("What does that spell?");
                    while (times>0)
                    {
                       System.out.println(UpStr + "!!!"); 
                       times--;
                    }

        }
}
