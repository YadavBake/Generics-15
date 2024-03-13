	
												Generics Part-5 || generics method
											=========================================

  

 -> We can declare type parameter either at class level or at method level.

	------------------------------------------
	Declaring Type parameter at class level :
	------------------------------------------

				class Test<T>
				{
					We can use 'T'
					within this class
					based on our 
					requirement 
				}
	------------------------------------------
	Declaring Type parameter at method level:
	------------------------------------------
	
		- we have to declare type parameter just before return type.
		
			class Test
			{
				
				public <T> void m1(T ob)
				{
					We can use 'T'
					anywhere within 
					this method based on 
					our requirement.
				}
			}
	
	
  -> We can define bounded types even at Method level also : 

	public <T> void m1()
	
	public <T extends Number> m1()
	
	public <T extends Runnable> m1()
	
	public <T extends Number & Runnable> m1()
	
	public <T extends Comparable & Runnable> m1()
	
	public <T extends Number & Comparable & Runnable> m1()
		
	public <T extends Runnable & Number> m1() //invalid[ First we have to take class and then intreface]

	public <T extends Number & Thread > m1() // invalid [We can't extends more then one class ]

	

-------------------------------------
 Communication with Non-Generic Code 
-------------------------------------

 -> If we send Generic Object to Non-Generic area then it's behaving like Non-Generic object. Similarly if we send 
	Non-Generic object to Generic area then it starts behaving like Generic object.That is the location in which 
	object prasent based on that behaviour will be defined.
	
	
	class Test
	{
		public static void main(String arg[])
		{
			ArrayList<String> l = new ArrayList<String>();<--------
			l.add("durga");										  |
			l.add("ravi");										  |
			//l.add(10);// invalid CE: 							  |// Generic Area  	
			m1(l);												  |	
			System.out.println(l); // [durga,ravi,10,10.5,true]	  |
			//l.add(10.5);//invalid CE:<---------------------------
			
		}
		public static void m1(ArrayList l )
		{<---------------------------------
			l.add(10);					  |
			l.add(10.5);                  |// Non-Generic area 
			l.add(true);                  |
		}<---------------------------------
	}                                     
 
 
 ------------
  Conclusion 
 ------------

 -> The main objectives or purpose of generics is to provide type safety and to resolve type casting problems.

 -> Type safety and type-casting both are applicable at compile time hence Generics conecept also applicable only at 
	compile but not at runtime.
	
 -> At the time of compilation as the last step Generic Syntax will be removed and hence for the JVM generics syntax 
	 won't be available.
		
 -> Hence a the following declaration are equal: 
 
 
		ArrayList l = new ArrayList<String>(); |	
        ArrayList l = new ArrayList<Integer>();|
        ArrayList l = new ArrayList<Double>(); |//=> All this declaration are equal
		ArrayList l = new ArrayList();		   |	
 
		
		import java.util.*;
		class Test
		{
			public static void main(String args[])
			{
				ArrayList l = new ArrayList<String>();	
				l.add(10);
				l.add(10.5);
				l.add(true);
				System.out.println(l); // [10,10.5,true]
			}
		}

 -> The following declaration are equal.
 
	ArrayList<String> l = new ArrayList<String>(); |	
    ArrayList<String> l = new ArrayList();		   |//=>This Two  declaration are equal
    
 -> For this ArrayList objects we can add only String type of Objects. 
 
  
 -> 
 
		import java.util.*;
		class Test
		{
			
			public void m1(int i )	=> m1(int)
			{
				
			}
			public int m1(int i)	=> m1(int)	
			{
			  return 10
			}
			public static void main(String args[])
			{
				t.m1(10);  
			}
		} // CE: m1(int) is already define in Test
 
 
		import java.util.*;
		class Test
		{															   		 		
			                                                           	At compile Time 
			public void m1(ArrayList<String> l ) => m1(ArrayList l)	   ----------------	
			{                                                          
				                                                        1. Compile code normally by considering 
			}                                                              generics syntax.
			                                                            
			public void m1(ArrayList<Integer> l ) => m1(ArrayList l)	2. remove generics syntax.
			{                                                           
				                                                        3. Compile once again resultant code  
			}
		} //CE: name clash: both method having same erasure 
 
	
	
	
	
	
	
	
	
	
	
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 