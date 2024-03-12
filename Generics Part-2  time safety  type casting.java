	
												Generics Part-2 || time safety || type casting
											====================================================



 -> For example to hold only String type of Object we can create Generic version of ArrayList Object as follows.


	ArrayList l  = new ArrayList(); // Normal ArrayList
	
	--------------------------------------------------
	|ArrayList <String>  l = new ArrayList<String>();| // Generic version Of ArrayList
	--------------------------------------------------
	
	- For this ArrayList we can add only String type of Objects by mistake if we are trying to add any other type then we 
	  will get compile time error.
	
		Ex. 
			l.add("Durga");
			l.add("Ravi");
			l.add(new Integer(10)); //CE: Incompatible 	
			l.add("Shiva");
		
	- Hence a through Generic we are getting type safety.


 -> At the time of retrivel we are not required to performe type casting.

	Ex. 
	
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("Durga"); // adding the data into the ArrayList 
		
		String name = l.get(0); // retriving the data and type casting is not required.
 
 -> Hence a through Generic we can solve type casting problem.


 -> 
 
	--------------------------------------------------------------------------------------------------------------------
	|	ArrayList l = new ArrayList();						ArrayList <String>  l = new ArrayList<String>();		   |	
	--------------------------------------------------------------------------------------------------------------------	
	|												    |															   |	
	|1. It is a non-generic version of ArrayList object | 1. It is a generic version of ArrayList object.              |
	|---------------------------------------------------|--------------------------------------------------------------|                                                                                                                 
	|2. For this ArrayList we can add any type of Object| 2. For this ArrayList we can add only String type of Objects | 	
	|	and hence it is not type safe.					|	and it is type Safe.                                       |
	|---------------------------------------------------|--------------------------------------------------------------|
	|3. At the time of retrivel compulsory we have to   | 3. At the time of retrivel we are not required to performe   |
	|	performe type casting .							|	type-casting.                                              |
	--------------------------------------------------------------------------------------------------------------------
	
----------------	
 Conclusion - 1 
----------------

	-> Polymorphisam concept applicable only for the base type but not for paramiter type.(Uses Parent reference to 
	   hold child object is the concept of Polymorphisam.


					Collection 								
					   |                                    		|new ArrayList();		
					   |                                    		|new LinkedList();		
					 List(I)                                List l =|new Vector();		 	
					   |		                            		|new Stack();	
			----------------------------		   
			|		   |			   |	
		ArrayList	LinkedList		 Vector	
									   |	
									 Stack


						
	1. ArrayList<String> l = new ArrayList<String>();					
		|			|
	  Base 	    paramiter		
	  type 		  type 
				  
				  
		List<String> l = new ArrayList<String>();
		
		Collection<String>  l = new ArrayList<String>();
		
		ArrayList<Object> l  = new ArrayList<String>(); // invalid CE:incompatible types found: ArrayList<String>
														// required: ArrayList<Object>
														
														
		Ex. 
			import java.util.*;
			Class Test 
			{
				public static void main(String args[])
				{
					ArrayList <String> l = new ArrayList<String>();
					List<String> l = new ArrayList<String>();
					Collection<String>  l = new ArrayList<String>();
					//ArrayList <Object> l = new ArrayList<String>();
				}
			}
																

 ----------------														
  Conclusion - 2
 ----------------
 
 -> For the type paramiter we can provide any class or interface name but not primitives if we are trying to provide 
	primitive then we will get compile time error saying unexpected type found:int required:reference.
  
		Ex. 
 
		ArrayList<int> l = new ArrayList<int>(); // invalid CE: unexpected type found:int required:reference.
 
 ====================
 2. Generic classes.
 ====================

  -> Until 1.4v version a non-generic version of ArrayList is declare as follows: 
  
  
			1.4v version
			
				class ArrayList
				{
					add(Object o)
						
					Object get(int index)
				}
		
		- The argument to add method is object and hence we can add any type of Object to the ArrayList due to this 
		  we are missing type Safety.

		- The return type of get method is Object hence at the time of retrivel we have to performe type casting.
		

 -> But in 1.5v version a generic version of ArrayList class is declared as follows:
 
	
				
				
 
			1.5v version 
							|---> // T is type paramiter.
			class ArrayList<T>									
			{                                                   
				                                                
				add (T t)                                       
				                                                
				T get(int index)
			}
		
		- Based on our runtime requirement 'T' will be replaced with our provided type.
		
		- For example to hold only String type of Objects a generic version ArrayList Object can be  created as follows:
		
			------------------------------------------------
			|ArrayList<String> l = new ArrayList<String>();|
			------------------------------------------------
			
		- For this requirement compiler considard version of ArrayList class is as follows:
		
				class ArrayList<String>
			    {
			    	add(String s)
			    	String get(int index)
			    }
			
		- The argument to add() method is String type hence a we can add only String type of Objects by mistake if we are 
		  trying to add any other type we will get compile time error.
			
			l.add("Durga");
			l.add(new Integer(10));//invalid CE: cannot find symbol, Symbol: method add(java.lang.Integer)
									// Location: class ArrayList<String>
			
		- Hence a through generic we are getting type safety.

		- The return type of get() method is String and hence a at the time of retrivel we are not required to performe
		  type casting.
			
			String name1 = l.get(0);// Here type casting is not required.
			

	-> In generic we are associating a type paramiter to the class. Such type of paramiter raised classes are nothing 
	   but generic classes or Template classes. 
	   
	
	-> Based on our requirement we can define our own Generic classes also.
	
						Ex. 
	
								class Account<T>
								{
								
								}
								
						Account <Gold> a1 = new Account<Gold>():
						Account <platinum> a2 = new Account<Platinum>():
			
	
	Eg: 


		class Gen<T>
		{
			T ob;
			Gen(T ob)
			{
				this.ob=ob;
			}
			public void show()
			{
				System.out.println("The type of ob "+ob.getClass().getName());
			}
			public T getOb()
			{
				return ob;
			}
			
		}
				
		
		class GenDemo
		{
			public static void main(String args[])
			{
				Gen<String> g1 = new Gen<String>("Durga");
				g1.show(); //The type of Ob java.lang.String.
				System.out.println(g1.getOb()); //durga
				
				
				Gen <Integer> g2 = new Gen<Integer>(10);
				g2.show(); //The type of Ob java.lang.Integer.
				System.out.println(g2.getOb()); //10
 
				Gen <Double> g3 = new Gen<Double>(10.5);
				g3.show(); //The type of Ob java.lang.Double.
				System.out.println(g3.getOb()); //10.5
			}
		}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 