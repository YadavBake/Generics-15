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