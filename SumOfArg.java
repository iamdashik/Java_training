class SumOfArg
{
	public static boolean isParsable(String input)
	{
    boolean parsable = true;
    try{
        Integer.parseInt(input);
    }catch(NumberFormatException e){
        parsable = false;
    }
    return parsable;
	}
	
	public static void main(String arg[])
	{
		
		if(arg.length>2 || arg.length<2)
		{
			System.out.println("Error of entering parameters. You should enter 2 Integer parameters like this: java SumOfArg.java arg1 arg2");
		}
		else
		{
			try
			{
				Integer.parseInt(arg[0]);
				Integer.parseInt(arg[1]);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Error of entering parameters. You should enter 2 Integer parameters like this: java SumOfArg.java arg1 arg2");
			}
			System.out.println(Integer.parseInt(arg[0])+Integer.parseInt(arg[1]));
		}
	}
	
}