class Test1<T extends Runnable> 
{
	public static void main(String args[])
	{
		//Test1<Integer> t1 = new Test1<Integer>();
		//Test1<String>  t2 = new Test1<String>(); 
		
		Test1<Runnable> t1 = new Test1<Runnable>();
		Test1<Thread> t2 = new Test1<Thread>();
		//Test1<Integer> t1 = new Test1<Integer>(); 
		
		
		
		
	}
}