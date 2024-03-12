
									Generics Part-4 || generics method ||generics wildcard characters(?)
								==========================================================================

--------------------------------------------
 Generic Methods and Wild Card character(?)								
--------------------------------------------

  1. m1(ArrayList<String> l) :
  
		1. We can call this method  by passing ArrayList of only String type.
		
		2. But within the method we can add only String type of Objects to the List by mistake if we are trying to add 
		   any other type then we will get compile time error.
		
			m1(ArrayList<String> l)
			{
				l.add("A");//valid 
				l.add(null);// valid 
				l.add(10);// invalid CE: 
			}

  2. m1(ArrayList<?> l) :

		1. We can call this by passing ArrayList of any unknown type or any type. 
		
				ArrayList<String> l1 = new ArrayList<String>();
				m1(l1);
				
				
				ArrayList<Integer> l2 = new ArrayList<Integer>();
				m1(l2);
				
				
				ArrayList<Student> l3 = new ArrayList<Student>();
				m1(l3);
				
		2.  But within the method we can't add anything to the list except null. Because we don't know the type exctly.
			null is allowed because it is value for any type.
		
				m1(ArrayList<?> l)
				{
					l.add(10.5);//invalid 
					l.add("A");//invalid
					l.add(10);//invalid
					l.add(nulll);//valid
						
				}
			
			- This type of methods are best sutable for read only operation.
			
				m1(ArrayList<?> l)
				{
					System.out.println(l);
				}
				
				
  3. m1(ArrayList<?> extends x> l) :


		1. 'X' can be Either class or interface.
		
		 - If 'X' is a class then we can call this method by passing ArrayList of either 'x' type or it's child classes.
			
		 -	If 'X' is an interface then we can  call this method by passing ArrayList of either 'x' type or it's 
			implementation classes.
			
		 -  But within the method we can't add anything to the list except null.Because we don't know the type of 'X'
			exctly.
			
		 - This type of method also best sutaible for read only operation.
		 
		 
		 
  4. m1(ArrayList<? super X> l) :

		1. 'X' can be either class or interface.
		
		  - If 'x' is class then we can call this method by passing ArrayList of either 'x' type or it's super classes. 
		  
		  - If 'X' is an interface then we can call this method by passing ArrayList of either 'x' type or super class 
			of implementation 'X' 
			
			
					Object       Runnable(I)
						|		    |
						|			| 
						--- Thread---
						
		2. But within the method we can add 'X' type of object and null to the list.

			m1(ArrayList<? super X> l)
			{
				l.add(x);
				l.add(null);
			}
			


 -> 
 
	import java.util.*;
	class Test
	{
		public static void main(String args[])
		{
			
		
			ArrayList<String> l = new ArrayList<String>(); //valid 
			
			ArrayList<?> l = new ArrayList<String>();//valid 
			
			ArrayList<?> l = new ArrayList<Integer>();//valid 
			
			ArrayList<? extends Number > l = new ArrayList<Interger>();//valid 
			
			ArrayList<? extends Number> l = new ArrayList<String>(); //invalid CE: incompatible type found: ArrayList
																	// <String> required: ArrayList<? Number>
																	
			ArrayList<? super String> l = new ArrayList<Object>();//valid 
			
			ArrayList<?> l = new ArrayList<?>();//invalid CE: unexpected type found: ? required: class or interface 
												// without bound.
												
			ArrayList<?> l = new ArrayList<?k extends Number>();//invalid CE: unexpected type found: ? required: class or 
															//interface without bound. 
		}
	}
	