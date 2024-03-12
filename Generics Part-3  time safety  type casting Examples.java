
										Generics Part-3 || time safety || type casting Examples
									===============================================================

-------------------
   Bounded Types 
-------------------

  -> We can bound the type parameter for a particular range by using extends keyword such types are called Bounded types.
 
		Ex. 
		
			class Test<T>	
            {
            	
            }
			
			- As the type parameter we can pass any type and there are no restrictions and hence it is unbounded type.
				
				Test<Integer> t1 = new Test<Integer>(); //valid 
				Test<String>  t2 = new Test<String>(); // valid 
 
		Ex.
		
			Syntax for bounded type :
		    
		    					 |-->// X is either class or interface 
		    class Test<T extends X>
		    {
		    
		    }
		
			- X can be either class or interface.
			
			- X is a class then as the type parameter we can pass Either X type or it's child classes.
			
			- X is an interface then as the type parameter we can pass Either X type or it's implementation classes.
		
		
		
			class Test<T extends Number> class Test<T implements Runable> class Test<T super String>
			{                            {                                {
	                                                                      
			}//valid                     }//invalid                       }//invalid 
		

			
            class Test<T extends Number >
			{
            	public void m1()
            	{
            		T a,b;
            		System.out.println(a+b);
            		System.out.println(a*b);
            		System.out.println(a/b);
            	}
            }
            
            
            				Number
            				  |
                  -----------------------------
                  |	   |	 |	 |	  |	      |	
                 byte short int long float double 
            	 


				
				
			class Test<T extends Number>	
			{                           	
			                            	
			}
			
			Test<Integer> t1 = new Test<Integer>(); //valid	
			Test<String>  t2 = new Test<String>(); // invalid CE: type parameter java.lang.String is not in its bound.	
				
				
				
			class Test <T extends Runnable>
			{
				
			}
			Test<Runnable> t1 = new Test<Runnable>();//valid 
			Test<Thread> t2 = new Test<Thread>();//valid 
			Test<Integer> t1 = new Test<Integer>(); //invalid CE: type parameter java.lang.Integer is not in its buond.

		
		class Test1<T> 
		{
			public static void main(String args[])
			{
				Test<Integer> t1 = new Test<Integer>();
				Test<String>  t2 = new Test<String>(); 
			}
		}
				
 -> We can define bounded types even in combinations also.
 
 
	Ex.
	
	class Test<T extends Number & Runnable> 
	{
					
	}
	
	- As the type parameter we can take anything which should be child class of Number and should implements Runnable 
	  interface.
	  
	  
	class Test<T extends Runnable & Comparable> 
	{
	
	}//valid 
	
	class Test<T extends Number & Runnable & Comparable>
	{
	
	}//valid 
	
	class Test<T extends Runnable & Number >
	{
	
	}// invalid  [Because we have to take class first followed by interface next.]
	
	class Test<T extends Number & Thread>
	{
	
	}//invalid [Becuase we can't extends more then class simultaneously]
	
	
 Note: 

	1. We can define bounded types only by using extends keyword and we cant use implements and super keywords. But we 
	   can replace implements keyword purpose with extends keyword.
	
	Ex.
	
	class Test<T extends Number> class Test<T implements Runnable> class Test<T extends Runnable>
	{                            {                                 {
	}//valid                     }//invalid                        }//valid 
		
	class Test<T super String>	
	{	
	}//invalid	
		
		
	2. As the type parameter 'T' we can take any valid java indentifier but it is convention to use 'T'. 

				
	class Test<T> class Test<X> class Test<A> class Test<Durga>
	{             {             {            {
	                                         
	}             }             }            }
		
		
	3. Based on our requirement we can declare any number of type parameters and all this type parameters should be 
	   separated with ',' comma.


	class Test<A,B> class Test<x,y,z> class HashM<K,V>
	{               {                 {
	                                  
	}               }                 }
									  HashMap<Integer, String> h1 = new HashMap<Integer,String>();
				
	
	
	
	
	
	
	
	
    
	
		 
	
	
	
	
	
	