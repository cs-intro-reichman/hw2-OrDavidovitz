// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		int F ;
		String str = args[1];	
		if (str.equals("V"))
		{
				for (int i = 1; i <= N; i++)
				{
					int counter = 0;
					if (i%2!=0)
					{
						System.out.print(i + " ");
						counter+=1;
						F=i*3+1;
						while (F!=1)
						{
							if (F%2==0)
							{
								System.out.print(F + " ");
								counter+=1;
								F/=2;
							}
							else
							{
								System.out.print(F + " ");
								counter+=1;
								F=F*3+1;
							}
						}
						System.err.print(F + " ");
						counter++;
					}	
					else
					{
						System.out.print(i + " ");
						counter++;
						F=i;
						while (F!=1)
						{ 
							if (F%2==0) 
							{
							F/=2;
							System.out.print(F + " ");
							counter++;
							}
							else
							{
								F=F*3+1;
								System.out.print(F + " ");
								counter++;
							}
						}

					}
					System.out.print(" (" + counter+")");
					System.out.println();
				}
				System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
		else if (str.equals("C"))
		{
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}

				
			}
		}
