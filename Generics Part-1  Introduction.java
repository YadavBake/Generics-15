
													Generics Part-1 || Introduction
												======================================

============
  Generics 
============

	1. Introduction.
	2. Generic classes.
	3. Bounded Type.
	4. Generic methods and wild-card charcter(?).
	5. Communication witn Non-Generic Code.
	6. conclusions.
	
	
----------------
  Introduction
----------------

	-------------------------------------------------------------------------------------------------
 -> |The main objective of generics are to provide type safety and to resolve type casting problems.|
	-------------------------------------------------------------------------------------------------

----------------------
 Case 1: Type Safety  
----------------------

 -> Array's are type safe that is we can give the guarantee for the type of element prasent inside array.
 
 -> For example if our programming requirement is to hold only String type of objects we can choice String array by 
	mistake if we are trying to add any other type of objects we will get compile time error.
	
	Ex.


		String s [] = new String[10000];
		s[0]="Durga";
		s[1]="Ravi";
		s[2]= new Integer(10); // incompatible types found: java.lang.Integer required: java.lang.String
		s[2]="Shiva";
	
 -> Hence a String [] array can contain only String type of objects. Due to this we can give the guarantee for the type 
	of elements prasent inside array hence a arrays are safe to use with respect to type that is Array's are type safe.
	

 -> But collections are not type safe that is we can't give the guarantee for the type of elements prasent inside the 
	collection.
	
 -> For example if our programming requirement to hold only String type of objects, and if we choice ArrayList, By mistake
	if you are trying to add any other type of object we won't get any compile time error but the program may fail at
	runtime.

	Ex. 
	
	
		ArrayList l = new ArrayList()
		l.add("durga");
		l.add("Ravi");
		l.add(new Integer(10));
		
		
		String name1 = (String)l.get(0);
		String name2 = (String)l.get(1);
		String name3 = (String)l.get(2); // RE: ClassCastException	
		

 -> Hence a we can't give the guarantee for the type of elements prasent inside collection due to this collections are 
	not safe to use with respect to type that is collections are not type safe.
	
	
-----------------------	
 Case 2: Type Casting 	
-----------------------

 -> In the case of Arrays at the time retrivel it is not required to performe type casting because there is guarantee 
    for the type of elements prasent inside Array.
 
 
		Ex. 
		
			String [] s = new String [10000];
			s[0] = "Durga";
			
			
			String name1 = s[0]; // Here type casting is not required

 -> But in the case of Collections at the time of retrivel compulsory we should performe type casting because there is 
	no guarantee for the type of elements prasent inside collection.
	
			
		Ex. 	
			
			ArrayList l = new ArrayList();
			l.add("Durga");
			
			
			String name1 = l.get(0);// CE: incompatible types found: java.lang.Object, required: java.lang.String.
			String name1 = (String)l.get(0); //valid and type casting mandatory.

 -> Hence a type casting is bigger problem in collections.
 
 -> To overcome above problems of collections sun people introduced Generics concept in 1.5v version.
 
 -> Hence a the main objectives of Generics are :
 
		1. To provide Type Safety.
		
		2. To resolve Type-casting problems.
		
		
 






































 