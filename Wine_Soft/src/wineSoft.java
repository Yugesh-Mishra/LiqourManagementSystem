import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Info
{

{	
System.out.print("           __________________________________________________________________________________ \n");
System.out.print("          |                                           		                               |\n");
System.out.print("          |                                           		                               |\n");
System.out.print("          |                                           		                               |\n");
System.out.print("          |                                           		                               |\n");
System.out.print("          |                                           		                               |\n");
System.out.print("          |                                           		                               |\n");
System.out.print("          |                   WELCOME TO WINE SOFT- A COMPLETE LIQOUR MANAGEMENT SYSTEM      |\n");
System.out.print("          |                                                                                  |\n");
System.out.print("          |                                                                                  |\n");
System.out.print("          |                                                                                  |\n");
System.out.print("          |                                                                                  |\n");
System.out.print("          |                                                                                  |\n");
System.out.print("          |                                                                                  |\n");
System.out.print("          |                                                                                  |\n");
System.out.print("          |__________________________________________________________________________________|\n");
}
//Declaring variales to be used
Scanner scan=new Scanner(System.in);
String name;
String address;
long contact;
int age;
String bg;
String sex;
String disease;
long id;
String dadm;

void signup()
{
	    Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Below Details: ");
		System.out.println("Enter Your Username : ");
		String Username = s.nextLine();

		System.out.println("Enter Your Password : ");
		String Password = s.nextLine();	
		
		
		//String pword=s.nextLine();
		System.out.println("Enter Your registered Username : ");
		String uname=s.nextLine();
		System.out.println("Enter Your registered Password : ");
		String pword=s.nextLine();
		if(Username .equals(uname) && Password.equals(pword)) 
		{
			
			login();
			
		}
		else
		{
			System.out.println("Invalid username and password");
			System.exit(0);
		}
}


//Log in Module
void login()
{
   int a;
   String pass;
   System.out.println("           _______________________________________________________________________________________ \n");
   System.out.println("\n                WINE SOFT-A COMPLETE LIQOUR MANAGEMENT SYSTEM \n");
   System.out.println("           _______________________________________________________________________________________ \n");
   System.out.println("\n\n                ------------------------------");
  // System.out.println("\n                       LOGIN \n");	
   System.out.println("                ------------------------------\n\n");	
   //System.out.println("                Enter the Password: ");
 //  pass=scan.next();
   //if(pass.equals("wineshop"))
	//{
      System.out.print("\n\n                Access Granted!\n");
     // pressAnyKeyToContinue();
  	//}
   // else
//	{
//      System.out.print( "\n\n                Access Aborted...\n                1.Try Again\n\n                2.Exit");
//      System.out.print("\n\n              Enter the option: ");
//      try{ 
//	  a=scan.nextInt(); 
//      if(a==1)
//          login();
//      else if(a==2)
//          System.exit(0);
//      else 
//        {
//         System.out.print("\n\n            Invalid Choice\n");
//         login();
//         //System.exit(0);
//        }
//      }
//	  catch(InputMismatchException e)
//      {
//	   System.out.println("\n\n              *Enter the correct option!*\n\n");
//	   login();
//	}
//    }
}
}

class WineShop
{
	String Shop_Name = "Darbar wineshop";
	private String Owner_Name = "Yugya";
	private long Owner_Mob_No = 8779934857l;
	String Shop_Address ="lane-2,Near Upvan lake,Thane -(West)";
	long Shop_Mob_No = 8106778906l;
	String Shop_Mail_Id = "darbarwinesoft@gmail.com";
	
	public long getOwner_Mob_No() {
		return Owner_Mob_No;
	}
		
	public String getOwner_Name() {
		return Owner_Name;
	}
}

class  Beer extends WineShop 
{
	String beer1="Strong Beer";
	String beer2="Mild Beer";
	public void beer(){
		
		System.out.println("1)Strong Beer 2)Mild Beer ");
		System.out.println("***************************************");
		Scanner s = new Scanner(System.in);	
		int choice = s.nextInt();
		switch(choice)
		     {
		        case 1: strongBeer t = new strongBeer();
		        System.out.println("Selected choice : Strong Beer");
		        System.out.println("***************************************");
		        t.categorytype();
		        break;
		        
		        case 2: mildBeer t1 =new mildBeer();
		        System.out.println("Selected choice : Mild Beer");
		        System.out.println("***************************************");
		        t1.categorytype();
		        break;
		      
		        
		        default:System.out.println("Invalid Choice please enter correct option");
		        System.out.println("***************************************");
		        beer();
		     }
		
		  } 
	
}

class strongBeer extends Beer
{
	int category;
	String brand;
	String name1="Kingfisher";
	String name2="Tuborg";
	String name3="Carlsberg";
	int kf375ml=105;	
	int tb375ml=120;	
	int crls375ml=135;
	int kf650ml=160;
	int tb650ml=180;
	int crls650ml=210; 
	String ml1="375 ml";
	String ml2="650 ml";
	public void categorytype() 
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml");
		System.out.println("1) 375 ml   2)  650 ml");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : "+ml1);
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : "+ml2);
			System.out.println("***************************************");
			category2();
			
		}
		else
		{
			System.out.println("Invalid category selected");
			categorytype();
		}
		
		
		
	}	
	public void category1()
	{
		
		System.out.println("Select the brand you want");
		System.out.println("1) Kingfisher  2) Tuborg  3) Carlsberg ");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
					
			System.out.println("Selected choice : "+name1);
			System.out.println("Price is: "+kf375ml);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 can  2) 2 can   3) 3 can 4) No.Of can");
			Scanner a=new Scanner(System.in);
			int choice = a.nextInt();
			if ( choice == 1 || choice ==2 || choice==3){   
				 
				  double b = choice*kf375ml;
				  System.out.println("Selected liquor:"+name1);
				  System.out.println("Ordered Quantity:"+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "can");		     }
            else if(choice != 1 || choice != 2 ||choice != 3) {  	  
            	  double b = choice*kf375ml;
				  System.out.println("Selected liquor:"+name1);
				  System.out.println("Ordered Quantity:"+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "can");				
			}
		}		
		else if(choose==2) {
				
				System.out.println("Selected choice : "+name2);
				System.out.println("Price is: "+tb375ml);
				System.out.println("Please enter quantity you want");
				System.out.println("1) 1 can  2) 2 can   3) 3 can 4)No.Of can");
				Scanner a=new Scanner(System.in);
				double choice = a.nextDouble();
				if ( choice == 1 || choice ==2 || choice==3){   
					 
					  double b = choice*tb375ml;
					  System.out.println("Selected liquor: "+name2);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "can");			     }
				else if(choice != 1 || choice != 2 ||choice != 3) {
	            	  
	            	  double b = choice*tb375ml;
					  System.out.println("Selected liquor: "+name2);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "can");					
				}
		}
		else if(choose==3) {
			
			System.out.println("Selected choice : "+name3);
			System.out.println("Price is: "+crls375ml);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 can  2) 2 can   3) 3 can 4) No.Of can");
			Scanner a=new Scanner(System.in);
			double choice = a.nextDouble();
			if ( choice == 1|| choice ==2 || choice==3){   
				  //String name="Carlsbreg";
				  double b = choice*crls375ml;
				  System.out.println("Selected liquor: "+name3);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "can");		     }
			else if(choice != 1 || choice != 2 ||choice != 3) {
          	  
          	  double b = choice*crls375ml;
				  System.out.println("Selected liquor: "+name3);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "can");				
			}
	    }
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();	
		
		
	}
	public void category2()
	{
		
		System.out.println("Select the brand you want");
		System.out.println("1) Kingfisher  2) Tuborg  3) Carlsberg ");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
				
			System.out.println("Selected choice : "+name1);
			System.out.println("Price is: "+kf650ml);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
			Scanner a=new Scanner(System.in);
			double choice = a.nextDouble();
			if ( choice == 1|| choice ==2 || choice==3){   
				 // String name="Kingfisher";
				  double b = choice*kf650ml;
				  System.out.println("Selected liquor: "+name1);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");
				  }
			else if(choice != 1 || choice != 2 ||choice != 3) {
          	  //String name="Kingfisher";
          	  double b = choice*kf650ml;
				  System.out.println("Selected liquor: "+name1);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"/-");				
				
			}
		}		
		else if(choose==2) {
				
				System.out.println("Selected choice : "+name2);
				System.out.println("Price is: "+tb650ml);
				System.out.println("Please enter quantity you want");
				System.out.println("1) 1 bootle  2) 2 bootle   3) 3 bootle 4)No.Of bottle");
				Scanner a=new Scanner(System.in);
				double choice = a.nextDouble();
				if ( choice == 1|| choice ==2 || choice==3){   
					  //String name="Tuborg";
					  double b = choice*tb650ml;
					  System.out.println("Selected liquor: "+name2);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");			     }
				else if(choice != 1 || choice != 2 ||choice != 3) {
	            	 // String name="Tuborg";
	            	  double b = choice*tb650ml;
					  System.out.println("Selected liquor: "+name2);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"/-");				
					
				}
		}
		else if(choose==3) 
		{
			
			System.out.println("Selected choice : "+name3);
			System.out.println("Price is: "+crls650ml);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bootle  2) 2 bootle   3) 3 bootle 4)No.Of bottle");
			Scanner a=new Scanner(System.in);
			double choice = a.nextDouble();
			if ( choice == 1|| choice ==2 || choice==3){   
				  //String name="Carlsbreg";
				  double b = choice*crls650ml;
				  System.out.println("Selected liquor: "+name3);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");		     }
			else if(choice != 1 || choice != 2 ||choice != 3) {
	          	//  String name="Carlsberg";
	          	  double b = choice*crls650ml;
				  System.out.println("Selected liquor: "+name3);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");					
			}
		
	    }
		else
		{
		    	  System.out.println("Invalid Input");
		    	  category2();
		}
			System.out.println("***************************************************");
		    CustomerDetails ref22 = new CustomerDetails();
			ref22.detials1();
		
	}
}

class mildBeer extends Beer
{
	int category;
	String brand;
	String name1="Kingfisher";
	String name2="Tuborg";
	String name3="Carlsberg";
	int kf375ml=90;	
	int tb375ml=100;	
	int crls375ml=120;
	int kf650ml=150;
	int tb650ml=170;
	int crls650ml=190; 
	String ml1="375 ml";
	String ml2="650 ml";
	public void categorytype() 
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml");
		System.out.println("1) 375 ml   2)  650 ml");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : 375 ml");
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : 650 ml");
			System.out.println("***************************************");
			category2();
		}
		else
		{
			System.out.println("Invalid category selected");
			categorytype();
		}
		
	}
	public void category1()
	{
		
		System.out.println("Select the brand you want");
		System.out.println("1) Kingfisher  2) Tuborg  3) Carlsberg ");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{		
			System.out.println("Selected choice : "+name1);
			System.out.println("Price is: "+kf375ml);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 can  2) 2 can   3) 3 can 4) No.Of can");
			Scanner a=new Scanner(System.in);
			double choice = a.nextDouble();
			if ( choice == 1|| choice ==2 || choice==3){   
				  //String name="Kingfisher";
				  double b = choice*kf375ml;
				  System.out.println("Selected liquor: "+name1);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "can");		     }
			else if(choice != 1 || choice != 2 ||choice != 3) {
          	  //String name="Kingfisher";
          	  double b = choice*kf375ml;
				  System.out.println("Selected liquor: "+name1);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "can");				
			}
		}		
		else if(choose==2) {
				
				System.out.println("Selected choice : "+name2);
				System.out.println("Price is: "+tb375ml);
				System.out.println("Please enter quantity you want");
				System.out.println("1) 1 can  2) 2 can   3) 3 can 4) No.Of can");
				Scanner a=new Scanner(System.in);
				double choice = a.nextDouble();
				if ( choice == 1|| choice ==2 || choice==3){   
					  //String name="Tuborg";
					  double b = choice*tb375ml;
					  System.out.println("Selected liquor: "+name2);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "can");			     }
				else if(choice != 1 || choice != 2 ||choice != 3) {
	            	  //String name="Tuborg";
	            	  double b = choice*tb375ml;
					  System.out.println("Selected liquor: "+name2);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "can");					
				}
		}
		else if(choose==3) {
			//int price=130;
			System.out.println("Selected choice : "+name3);
			System.out.println("Price is: "+crls375ml);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 can  2) 2 can   3) 3 can 4) 4) No.Of can");
			Scanner a=new Scanner(System.in);
			double choice = a.nextDouble();
			if ( choice == 1|| choice ==2 || choice==3){   
				  //String name="Carlsbreg";
				  double b = choice*crls375ml;
				  System.out.println("Selected liquor: "+name3);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "can");		     }
			else if(choice != 1 || choice != 2 ||choice != 3) {
	          	 // String name="Carlsberg";
	          	  double b = choice*crls375ml;
				  System.out.println("Selected liquor: "+name3);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "can");				
					
			}
			
	   }
	   else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
		
		
	}
	public void category2()
	{
		System.out.print("Select the brand you want");
		System.out.print("1) Kingfisher  2) Tuborg  3) Carlsberg ");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			//int price=160;		
			System.out.println("Selected choice : "+name1);
			System.out.println("Price is: "+kf650ml);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
			Scanner a=new Scanner(System.in);
			double choice = a.nextDouble();
			if ( choice == 1|| choice ==2 || choice==3){   
				  //String name="Kingfisher";
				  double b = choice*kf650ml;
				  System.out.println("Selected liquor: "+name1);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
		     }
			else if(choice != 1 || choice != 2 ||choice != 3) {
	          	  //String name="Kingfisher";
	          	  double b = choice*kf650ml;
					  System.out.println("Selected liquor: "+name1);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
					
				}
		}		
		else if(choose==2) {
				//int price=180;
				System.out.println("Selected choice : "+name2);
				System.out.println("Price is: "+tb650ml);
				System.out.println("Please enter quantity you want");
				System.out.println("1) 1 bootle  2) 2 bootle   3) 3 bootle 4)No.Of bottle");
				Scanner a=new Scanner(System.in);
				double choice = a.nextDouble();
				if ( choice == 1|| choice ==2 || choice==3){   
					 // String name="Tuborg";
					  double b = choice*tb650ml;
					  System.out.println("Selected liquor: "+name2);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
			     }
				else if(choice != 1 || choice != 2 ||choice != 3) {
	            	 // String name="Tuborg";
	            	  double b = choice*tb650ml;
					  System.out.println("Selected liquor: "+name2);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
					
				}
		}
		else if(choose==3) 
		{
			//int price=210;
			System.out.println("Selected choice : "+name3);
			System.out.println("Price is: "+crls650ml);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bootle  2) 2 bootle   3) 3 bootle 4)No.Of bottle");
			Scanner a=new Scanner(System.in);
			double choice = a.nextDouble();
			if ( choice == 1|| choice ==2 || choice==3){   
				  //String name="Carlsbreg";
				  double b = choice*crls650ml;
				  System.out.println("Selected liquor: "+name3);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				

		     }
			else if(choice != 1 || choice != 2 ||choice != 3) {
	          	 // String name="Carlsberg";
	          	  double b = choice*crls650ml;
				  System.out.println("Selected liquor: "+name3);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
					
			}
	    }
		else{
	    	  System.out.println("Invalid Input");
	    	  category2();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
}

class Rum extends WineShop
{
	String name="Rum";
	public void rum()
	{
		System.out.print("Select the brand you want ");
		System.out.println("1)Old monk  2) Bacardi  3) McDowell’s ");
		System.out.println("***************************************");
		Scanner s = new Scanner(System.in);	
		int choice = s.nextInt();
		switch(choice)
		     {
		       case 1: OldMonk t = new OldMonk();
		        System.out.println("Selected choice : Old Monk");
		        t.oldmonk();
		        break;
		        case 2: Bacardi t1 =new Bacardi();
		        System.out.println("Selected choice : Bacardi ");
		        t1.bacardi();
		        break;
		        case 3: Mcdowell t2 =new Mcdowell();
		        System.out.println("Selected choice : Mcdowell's ");
		        t2.mcdowell();
		        break;
		        
		        default: System.out.println("Invalid Choice please enter correct option");
		        System.out.println("***************************************");
		        rum();
		     }
		
	} 
		
		
}

class OldMonk extends Rum
{
	String name= "Old monk";
	int price1= 260;
	int price2= 520;
	String om375ml ="375 ml";
	String om750ml ="750 ml";
	public void oldmonk()
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml");
		System.out.println("1) 375 ml   2)  750 ml");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : "+om375ml);
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : "+om750ml);
			System.out.println("***************************************");
			category2();
		}
		else
		{
			System.out.println("Invalid category selected");
			oldmonk();
		}
		
	}
	public void category1()
	{
		
		//double price = 260;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price1);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			  //String name="Old Monk";
			  double b = choice*price1;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	 // String name="Old monk";
          	  double b = choice*price1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	public void category2()
	{
		
		//double price = 520;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price2);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			  //String name="Old Monk";
			  double b = choice*price2;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	 // String name="Old monk";
          	  double b = choice*price2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category2();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	
}

class Bacardi extends Rum
{
	String name= "Bacardi Rum";
	int price1= 280;
	int price2= 560;
	String bc375ml ="375 ml";
	String bc750ml ="750 ml";
	public void bacardi()
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml");
		System.out.println("1) 375 ml   2)  750 ml");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : "+bc375ml);
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : "+bc750ml);
			System.out.println("***************************************");
			category2();
		}
		else
		{
			System.out.println("Invalid category selected");
			bacardi();
		}
		
	}
	public void category1()
	{
		
		//double price = 280;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price1);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			 // String name="Bacardi Rum";
			  double b = choice*price1;
			  System.out.println("Selected liquor:"+name);
			  System.out.println("Ordered Quantity:"+choice);
			  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	 // String name="Bacardi Rum";
          	  double b = choice*price1;
				  System.out.println("Selected liquor:"+name);
				  System.out.println("Ordered Quantity:"+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	public void category2()
	{
		
	//	double price = 560;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price2);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			  String name="Bacardi Rum ";
			  double b = choice*price2;
			  System.out.println("Selected liquor:"+name);
			  System.out.println("Ordered Quantity:"+choice);
			  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	  String name="Bacardi Rum ";
          	  double b = choice*price2;
				  System.out.println("Selected liquor:"+name);
				  System.out.println("Ordered Quantity:"+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category2();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
}

class Mcdowell extends Rum
{
	String name= "Mcdowell Rum";
	int price1= 270;
	int price2= 540;
	String mcd375ml ="375 ml";
	String mcd750ml ="750 ml";
	public void mcdowell()
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml");
		System.out.println("1) 375 ml   2)  750 ml");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : "+mcd375ml);
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : "+mcd750ml);
			System.out.println("***************************************");
			category2();
		}
		else
		{
			System.out.println("Invalid category selected");
			mcdowell();
		}
		
		
	}
	public void category1()
	{
		
	//	double price = 270;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price1);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			 // String name="McDowell’s Rum";
			  double b = choice*price1;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	 // String name="McDowell’s Rum";
          	  double b = choice*price1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	public void category2()
	{
		
		//double price = 540;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price2);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			  //String name="McDowell’s Rum ";
			  double b = choice*price2;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	 // String name="McDowell’s Rum ";
          	  double b = choice*price2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category2();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
}

class Whisky extends WineShop
{
    String name="Whisky";	
	public void whisky()
	{
		System.out.print("Select the brand you want ");
		System.out.println("1)Blenders Pride  2) Signature  3) Ballentine ");
		System.out.println("***************************************");
		Scanner s = new Scanner(System.in);	
		int choice = s.nextInt();
		switch(choice)
		     {
		       case 1: Blenders t = new Blenders();
		        System.out.println("Selected choice : Blenders Pride ");
		        t.blender();
		        break;
		        case 2: Signature t1 =new Signature();
		        System.out.println("Selected choice : Signature ");
		        t1.signature();
		        break;
		        case 3: Ballentine t2 =new Ballentine();
		        System.out.println("Selected choice : Ballentine ");
		        t2.ballentine();
		        break;
		        
		        default: System.out.println("Invalid Choice please enter correct option");
		        System.out.println("***************************************");
		        whisky();
		     }
		
	}
}

class Blenders extends Whisky
{
	String name= "Blenders Pride";
	int price1= 550;
	int price2= 1100;
	String bp375ml ="375 ml";
	String bp750ml ="750 ml";
	public void blender()
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml");
		System.out.println("1) 375 ml   2)  750 ml");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : "+bp375ml);
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : "+bp750ml);
			System.out.println("***************************************");
			category2();
		}
		else
		{
			System.out.println("Invalid category selected");
			blender();
		}
		
		
	}
	public void category1()
	{
		
		//double price = 500;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price1);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			//  String name="Blenders Pride ";
			  double b = choice*price1;
			  System.out.println("Selected liquor:"+name);
			  System.out.println("Ordered Quantity:"+choice);
			  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	//  String name="Blenders Pride ";
          	  double b = choice*price1;
				  System.out.println("Selected liquor:"+name);
				  System.out.println("Ordered Quantity:"+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	public void category2()
	{
		
		//double price = 1000;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price2);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			  //String name="Blenders Pride ";
			  double b = choice*price2;
			  System.out.println("Selected liquor:"+name);
			  System.out.println("Ordered Quantity:"+choice);
			  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	  //String name="Blenders Pride ";
          	  double b = choice*price2;
				  System.out.println("Selected liquor:"+name);
				  System.out.println("Ordered Quantity:"+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category2();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	
	
}

class Signature extends Whisky
{
	String name= "Signature";
	int price1= 450;
	int price2= 900;
	String sg375ml ="375 ml";
	String sg750ml ="750 ml";
	public void signature()
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml");
		System.out.println("1) 375 ml   2)  750 ml");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : "+sg375ml);
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : "+sg750ml);
			System.out.println("***************************************");
			category2();
		}
		else
		{
			System.out.println("Invalid category selected");
			signature();
		}
		
		
	}
	public void category1()
	{
		
		//double price = 400;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price1);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			 // String name="Signature ";
			  double b = choice*price1;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	  //String name="Signature ";
          	  double b = choice*price1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	public void category2()
	{
		
		//double price = 900;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price2);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			//  String name="Signature ";
			  double b = choice*price2;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	 // String name="Signature ";
          	  double b = choice*price2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category2();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	
	
}

class Ballentine extends Whisky
{
	String name= "Ballentine";
	int price1= 900;
	int price2= 900;
	String bl375ml ="375 ml";
	String bl750ml ="750 ml";
	public void ballentine()
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml");
		System.out.println("1) 375 ml   2)  750 ml");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : "+bl375ml);
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : "+bl750ml);
			System.out.println("***************************************");
			category2();
		}
		else
		{
			System.out.println("Invalid category selected");
			ballentine();
		}
		
		
	}
	public void category1()
	{
		
		//double price = 900;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price1);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			  //String name="Ballentine ";
			  double b = choice*price1;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	 // String name="Ballentine ";
          	  double b = choice*price1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	public void category2()
	{
		
		//double price = 1800;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price2);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			//  String name="Ballentine ";
			  double b = choice*price2;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	 // String name="Ballentine ";
          	  double b = choice*price2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category2();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
		
}
class Vodka extends WineShop
{
	String name="Vodka";
	public void vodka()
	{
		System.out.print("Select the brand you want ");
		System.out.println("1)Magic Moment  2) Romanov  3) Smirnoff ");
		System.out.println("***************************************");
		Scanner s = new Scanner(System.in);	
		int choice = s.nextInt();
		switch(choice)
		     {
		       case 1: MagicMoment t = new MagicMoment();
		        System.out.println("Selected choice : Magic Moment");
		        t.categorytype();
		        break;
		        case 2: Romanov t1 =new Romanov();
		        System.out.println("Selected choice : Romanav ");
		        t1.categorytype();
		        break;
		        case 3: Smirnoff t2 =new Smirnoff();
		        System.out.println("Selected choice : Smirnoff ");
		        t2.categorytype();
		        break;
		        
		        default: System.out.println("Invalid Choice please enter correct option");
		        System.out.println("***************************************");
		        vodka();
		     }		
	}
}
class MagicMoment extends Vodka
{
	String name= "Magic Moment";
	int gaprice1= 375;
	int gaprice2= 750;
	int gnprice1= 380;
	int gnprice2= 760;
	int wmprice1= 390;
	int wmprice2= 780;
	String flavour1="Green Apple";
	String flavour2="Ginger";
	String flavour3="Watermelon";
	String mm375ml ="375 ml";
	String mm750ml ="750 ml";
	
	public void categorytype() 
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml");
		System.out.println("1) 375 ml   2)  750 ml");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : 375 ml");
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : 750 ml");
			System.out.println("***************************************");
			category2();
			
		}
		else
		{
			System.out.println("Invalid category selected");
			categorytype();
		}				
		
	}
	public void category1()
	{
		
		System.out.println("Select the flavours you want in Magic moment ");
		System.out.println("1)Green Apple  2) Ginger  3) Watermelon ");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			//int price=375;		
			System.out.println("Selected choice :Green Apple Flavor");
			System.out.println("Price is: "+gaprice1);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
			Scanner a=new Scanner(System.in);
			int choice = a.nextInt();
			if ( choice == 1 || choice ==2 || choice==3){   
				  String name="Magic moment Green Apple Flavor";
				  double b = choice*gaprice1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
		     }
            else if(choice != 1 || choice != 2 ||choice != 3) {
            	  String name="Magic moment Green Apple Flavor";
            	  double b = choice*gaprice1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		}		
		else if(choose==2) {
				//int price=380;
				System.out.println("Selected choice : Ginger Flavor");
				System.out.println("Price is: "+gnprice1);
				System.out.println("Please enter quantity you want");
				System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
				Scanner a=new Scanner(System.in);
				double choice = a.nextDouble();
				if ( choice == 1 || choice ==2 || choice==3){   
					  String name="Magic moment Ginger Flavor";
					  double b = choice*gnprice1;
					  System.out.println("Selected liquor: "+name);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
			     }
				else if(choice != 1 || choice != 2 ||choice != 3) {
	            	  String name="Magic moment Ginger Flavor";
	            	  double b = choice*gnprice1;
					  System.out.println("Selected liquor: "+name);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
					
				}
		}
		else if(choose==3) {
			//int price=390;
			System.out.println("Selected choice : Water Melon Flavor");
			System.out.println("Price is: "+wmprice1);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
			Scanner a=new Scanner(System.in);
			double choice = a.nextDouble();
			if ( choice == 1|| choice ==2 || choice==3){   
				  String name="Magic moment Water Melon Flavor";
				  double b = choice*wmprice1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
		     }
			else if(choice != 1 || choice != 2 ||choice != 3) {
          	  String name="Magic moment Water Melon Flavor";
          	  double b = choice*wmprice1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
	    }
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();	
		
		
	}
	public void category2()
	{
		
		System.out.println("Select the flavours you want in Magic moment ");
		System.out.println("1)Green Apple  2) Ginger  3) Watermelon ");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			//int price=750;		
			System.out.println("Selected choice :Green Apple Flavor");
			System.out.println("Price is: "+gaprice2);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
			Scanner a=new Scanner(System.in);
			int choice = a.nextInt();
			if ( choice == 1 || choice ==2 || choice==3){   
				  String name="Magic moment Green Apple Flavor";
				  double b = choice*gaprice2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
		     }
            else if(choice != 1 || choice != 2 ||choice != 3) {
            	  String name="Magic moment Green Apple Flavor";
            	  double b = choice*gaprice2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		}		
		else if(choose==2) {
				//int price=760;
				System.out.println("Selected choice : Ginger Flavor");
				System.out.println("Price is: "+gnprice2);
				System.out.println("Please enter quantity you want");
				System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
				Scanner a=new Scanner(System.in);
				double choice = a.nextDouble();
				if ( choice == 1 || choice ==2 || choice==3){   
					  String name="Magic moment Ginger Flavor";
					  double b = choice*gnprice2;
					  System.out.println("Selected liquor: "+name);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
			     }
				else if(choice != 1 || choice != 2 ||choice != 3) {
	            	  String name="Magic moment Ginger Flavor";
	            	  double b = choice*gnprice2;
					  System.out.println("Selected liquor: "+name);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
					
				}
		}
		else if(choose==3) {
			//int price=780;
			System.out.println("Selected choice : Water Melon Flavor");
			System.out.println("Price is: "+wmprice2);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
			Scanner a=new Scanner(System.in);
			double choice = a.nextDouble();
			if ( choice == 1|| choice ==2 || choice==3){   
				  String name="Magic moment Water Melon Flavor";
				  double b = choice*wmprice2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
		     }
			else if(choice != 1 || choice != 2 ||choice != 3) {
          	  String name="Magic moment Water Melon Flavor";
          	  double b = choice*wmprice2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
	    }
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();	
			
	}
	
}
class Romanov extends Vodka
{
	String name= "Romanov";
	int gaprice1= 280;
	int gaprice2= 560;
	int gnprice1= 290;
	int gnprice2= 580;
	int wmprice1= 300;
	int wmprice2= 600;
	String flavour1="Green Apple";
	String flavour2="Ginger";
	String flavour3="Watermelon";
	String rm375ml ="375 ml";
	String rm750ml ="750 ml";
	public void categorytype() 
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml");
		System.out.println("1) 375 ml   2)  750 ml");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : "+rm375ml);
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : "+rm750ml);
			System.out.println("***************************************");
			category2();
			
		}
		else
		{
			System.out.println("Invalid category selected");
			categorytype();
		}				
		
	}
	public void category1()
	{
		
		System.out.println("Select the flavours you want in Romanov ");
		System.out.println("1)Green Apple  2) Ginger  3) Watermelon ");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			//int price=280;		
			System.out.println("Selected choice : Green Apple Flavor");
			System.out.println("Price is: "+gaprice1);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
			Scanner a=new Scanner(System.in);
			int choice = a.nextInt();
			if ( choice == 1 || choice ==2 || choice==3){   
				  String name="Romanov Green Apple Flavor";
				  double b = choice*gaprice1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
		     }
            else if(choice != 1 || choice != 2 ||choice != 3) {
            	  String name="Romanov Green Apple Flavor";
            	  double b = choice*gaprice1;
				  System.out.println("Selected liquor:"+name);
				  System.out.println("Ordered Quantity:"+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		}		
		else if(choose==2) {
				//int price=290;
				System.out.println("Selected choice : Ginger Flavor");
				System.out.println("Price is: "+gnprice1);
				System.out.println("Please enter quantity you want");
				System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
				Scanner a=new Scanner(System.in);
				double choice = a.nextDouble();
				if ( choice == 1 || choice ==2 || choice==3){   
					  String name="Romanov Ginger Flavor";
					  double b = choice*gnprice1;
					  System.out.println("Selected liquor: "+name);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
			     }
				else if(choice != 1 || choice != 2 ||choice != 3) {
	            	  String name="Romanov Ginger Flavor";
	            	  double b = choice*gnprice1;
					  System.out.println("Selected liquor: "+name);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
					
				}
		}
		else if(choose==3) {
			//int price=300;
			System.out.println("Selected choice : Water Melon Flavor");
			System.out.println("Price is: "+wmprice1);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
			Scanner a=new Scanner(System.in);
			double choice = a.nextDouble();
			if ( choice == 1|| choice ==2 || choice==3){   
				  String name="Romanov Water Melon Flavor";
				  double b = choice*wmprice1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");
		     }
			else if(choice != 1 || choice != 2 ||choice != 3) {
          	  String name="Romanov Water Melon Flavor";
          	  double b = choice*wmprice1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
	    }
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();	
		
		
	}
	public void category2()
	{
		
		System.out.println("Select the flavours you want in Romanov ");
		System.out.println("1)Green Apple  2) Ginger  3) Watermelon ");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			//int price=560;		
			System.out.println("Selected choice :Green Apple Flavor");
			System.out.println("Price is: "+gaprice2);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
			Scanner a=new Scanner(System.in);
			int choice = a.nextInt();
			if ( choice == 1 || choice ==2 || choice==3){   
				  String name="Romanov Green Apple Flavor";
				  double b = choice*gaprice2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");
		     }
            else if(choice != 1 || choice != 2 ||choice != 3) {
            	  String name="Romanov Green Apple Flavor";
            	  double b = choice*gaprice2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		}		
		else if(choose==2) {
				//int price=580;
				System.out.println("Selected choice : Ginger Flavor");
				System.out.println("Price is: "+gnprice2);
				System.out.println("Please enter quantity you want");
				System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
				Scanner a=new Scanner(System.in);
				double choice = a.nextDouble();
				if ( choice == 1 || choice ==2 || choice==3){   
					  String name="Romanov Ginger Flavor";
					  double b = choice*gnprice2;
					  System.out.println("Selected liquor: "+name);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");
			     }
				else if(choice != 1 || choice != 2 ||choice != 3) {
	            	  String name="Romanov Ginger Flavor";
	            	  double b = choice*gnprice2;
					  System.out.println("Selected liquor: "+name);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
					
				}
		}
		else if(choose==3) {
			//int price=600;
			System.out.println("Selected choice : Water Melon Flavor");
			System.out.println("Price is: "+wmprice2);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
			Scanner a=new Scanner(System.in);
			double choice = a.nextDouble();
			if ( choice == 1|| choice ==2 || choice==3){   
				  String name="Romanov Water Melon Flavor";
				  double b = choice*wmprice2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");
		     }
			else if(choice != 1 || choice != 2 ||choice != 3) {
          	  String name="Romanov Water Melon Flavor";
          	  double b = choice*wmprice2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
	    }
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();	
			
	}
	
}
class Smirnoff extends Vodka
{
	String name= "Smirnoff";
	int gaprice1= 500;
	int gaprice2= 1000;
	int gnprice1= 550;
	int gnprice2= 1100;
	int wmprice1= 550;
	int wmprice2= 1100;
	String flavour1="Green Apple";
	String flavour2="Ginger";
	String flavour3="Watermelon";
	String sf375ml ="375 ml";
	String sf750ml ="750 ml";
	public void categorytype() 
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml");
		System.out.println("1) 375 ml   2)  750 ml");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : "+sf375ml);
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : "+sf750ml);
			System.out.println("***************************************");
			category2();
			
		}
		else
		{
			System.out.println("Invalid category selected");
			categorytype();
		}				
		
	}
	public void category1()
	{
		
		System.out.println("Select the flavours you want in Smirnoff ");
		System.out.println("1)Green Apple  2) Ginger  3) Watermelon ");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			//int price=500;		
			System.out.println("Selected choice :Green Apple Flavor");
			System.out.println("Price is: "+gaprice1);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
			Scanner a=new Scanner(System.in);
			int choice = a.nextInt();
			if ( choice == 1 || choice ==2 || choice==3){   
				  String name="Smirnoff Green Apple Flavor";
				  double b = choice*gaprice1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");
		     }
            else if(choice != 1 || choice != 2 ||choice != 3) {
            	  String name="Smirnoff Green Apple Flavor";
            	  double b = choice*gaprice1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		}		
		else if(choose==2) {
				//int price=550;
				System.out.println("Selected choice : Ginger Flavor");
				System.out.println("Price is: "+gnprice1);
				System.out.println("Please enter quantity you want");
				System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
				Scanner a=new Scanner(System.in);
				double choice = a.nextDouble();
				if ( choice == 1 || choice ==2 || choice==3){   
					  String name="Smirnoff Ginger Flavor";
					  double b = choice*gnprice1;
					  System.out.println("Selected liquor: "+name);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");
			     }
				else if(choice != 1 || choice != 2 ||choice != 3) {
	            	  String name="Smirnoff Ginger Flavor";
	            	  double b = choice*gnprice1;
					  System.out.println("Selected liquor: "+name);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
					
				}
		}
		else if(choose==3) {
			//int price=550;
			System.out.println("Selected choice : Water Melon Flavor");
			System.out.println("Price is: "+wmprice1);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
			Scanner a=new Scanner(System.in);
			double choice = a.nextDouble();
			if ( choice == 1|| choice ==2 || choice==3){   
				  String name="Smirnoff Water Melon Flavor";
				  double b = choice*wmprice1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");
		     }
			else if(choice != 1 || choice != 2 ||choice != 3) {
          	  String name="Smirnoff Water Melon Flavor";
          	  double b = choice*wmprice1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity:"+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
	    }
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();	
		
		
	}
	public void category2()
	{
		
		System.out.println("Select the flavours you want in Smirnoff ");
		System.out.println("1)Green Apple  2) Ginger  3) Watermelon ");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			//int price=1000;		
			System.out.println("Selected choice :Green Apple Flavor");
			System.out.println("Price is: "+gaprice2);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
			Scanner a=new Scanner(System.in);
			int choice = a.nextInt();
			if ( choice == 1 || choice ==2 || choice==3){   
				  String name="Smirnoff Green Apple Flavor";
				  double b = choice*gaprice2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");
		     }
            else if(choice != 1 || choice != 2 ||choice != 3) {
            	  String name="Smirnoff Green Apple Flavor";
            	  double b = choice*gaprice2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
				
			}
		}		
		else if(choose==2) {
				//int price=1100;
				System.out.println("Selected choice : Ginger Flavor");
				System.out.println("Price is: "+gnprice2);
				System.out.println("Please enter quantity you want");
				System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
				Scanner a=new Scanner(System.in);
				double choice = a.nextDouble();
				if ( choice == 1 || choice ==2 || choice==3){   
					  String name="Smirnoff Ginger Flavor";
					  double b = choice*gnprice2;
					  System.out.println("Selected liquor: "+name);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");
			     }
				else if(choice != 1 || choice != 2 ||choice != 3) {
	            	  String name="Smirnoff Ginger Flavor";
	            	  double b = choice*gnprice2;
					  System.out.println("Selected liquor: "+name);
					  System.out.println("Ordered Quantity: "+choice);
					  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");				
					
				}
		}
		else if(choose==3) {
			//int price=1100;
			System.out.println("Selected choice : Water Melon Flavor");
			System.out.println("Price is: "+wmprice2);
			System.out.println("Please enter quantity you want");
			System.out.println("1) 1 bottle  2) 2 bottle   3) 3 bottle 4) No.Of bottle");
			Scanner a=new Scanner(System.in);
			double choice = a.nextDouble();
			if ( choice == 1|| choice ==2 || choice==3){   
				  String name="Smirnoff Water Melon Flavor";
				  double b = choice*wmprice2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");
		     }
			else if(choice != 1 || choice != 2 ||choice != 3) {
          	  String name="Smirnoff Water Melon Flavor";
          	  double b = choice*wmprice2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");				
				
			}
	    }
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();	
			
	}
	
}
class Scotch extends WineShop
{
	String name="Scotch";
	public void scotch()
	{
		System.out.print("Select the brand you want ");
		System.out.println("1)Johnnie Walker Red Label  2)Johnnie Walker Blue Label  3) Chivas Regal ");
		System.out.println("***************************************");
		Scanner s = new Scanner(System.in);	
		int choice = s.nextInt();
		switch(choice)
		     {
		        case 1: Redlabel t = new Redlabel();
		        System.out.println("Selected choice : Johnnie Walker Red Label ");
		        t.redlabel();
		        break;
		        case 2: Bluelabel t1 =new Bluelabel();
		        System.out.println("Selected choice : Johnnie Walker Blue Label ");
		        t1.bluelabel();
		        break;
		        case 3: Chivasregal t2 =new Chivasregal();
		        System.out.println("Selected choice : Chivas Regal  ");
		        t2.chivasregal();
		        break;
		        
		        default: System.out.println("Invalid Choice please enter correct option");
		        System.out.println("***************************************");
		        scotch();
		     }
		
	}
	
}
class Redlabel extends Scotch
{
	String name= "Johnnie Walker Red Label ";
	int price1= 1900;
	int price2= 2150;
	String rl750ml ="750 ml";
	String rl1ltr ="1 ltr";
	public void redlabel()
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml/ltr");
		System.out.println("1) 750 ml   2)  1 ltr");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : "+rl750ml);
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : "+rl1ltr);
			System.out.println("***************************************");
			category2();
		}
		else
		{
			System.out.println("Invalid category selected");
			redlabel();
		}
		
		
	}
	public void category1()
	{		
		//double price = 1900;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price1);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			  String name="Johnnie Walker Red Label ";
			  double b = choice*price1;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/-"+choice+ "bottle");
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	  String name="Johnnie Walker Red Label ";
          	  double b = choice*price1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	public void category2()
	{
		
	//	double price = 2950;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price2);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			  String name="Johnnie Walker Red Label ";
			  double b = choice*price2;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	  String name="Johnnie Walker Red Label ";
          	  double b = choice*price2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category2();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	
	
}
class Bluelabel extends Scotch
{
	String name= "Johnnie Walker Blue Label ";
	int price1= 6500;
	int price2= 8000;
	String bl750ml ="750 ml";
	String bl1ltr ="1 ltr";
	public void bluelabel()
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml/ltr");
		System.out.println("1) 750 ml   2)  1 ltr");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : "+bl750ml);
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : "+bl1ltr);
			System.out.println("***************************************");
			category2();
		}
		else
		{
			System.out.println("Invalid category selected");
		    bluelabel();
		}
		
		
	}
	public void category1()
	{
		
		//double price = 7500;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price1);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			  String name="Johnnie Walker Blue Label ";
			  double b = choice*price1;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	  String name="Johnnie Walker Blue Label ";
          	  double b = choice*price1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	public void category2()
	{
		
		//double price = 11250;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price2);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			  String name="Johnnie Walker Blue Label ";
			  double b = choice*price2;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	  String name="Johnnie Walker Blue Label ";
          	  double b = choice*price2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category2();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	
	
}

class Chivasregal extends Scotch
{
	String name= "Chivas Regal ";
	int price1= 11000;
	int price2= 16500;
	String cr750ml ="750 ml";
	String cr1ltr ="1 ltr";
	public void chivasregal()
	{
		System.out.println("***************************************");
		System.out.println("Select the category you want in ml/ltr");
		System.out.println("1) 750 ml   2)  1 ltr");
		Scanner s = new Scanner(System.in);	
		int choose = s.nextInt();
		if(choose==1)
		{
			System.out.println("Selected choice : "+cr750ml);
			System.out.println("***************************************");
			category1();	
		}
		else if(choose==2)
		{
			System.out.println("Selected choice : "+cr1ltr);
			System.out.println("***************************************");
			category2();
		}
		else
		{
			System.out.println("Invalid category selected");
			chivasregal();
		}
		
		
	}
	public void category1()
	{
		
		//double price = 11000;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price1);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			  String name="Chivas Regal ";
			  double b = choice*price1;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	  String name="Chivas Regal ";
          	  double b = choice*price1;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category1();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	public void category2()
	{
		
		//double price = 16500;
		//System.out.println("Selected choice : Old Monk");
		System.out.println("Price is: "+price2);
		System.out.println("Please enter quantity you want");
		System.out.println("1) 1 bootle  2) 2 bottle   3) 3 bottle 4)No.Of bottle");
		Scanner a=new Scanner(System.in);
		double choice = a.nextDouble();
		if ( choice == 1|| choice ==2 || choice==3){   
			  String name="Chivas Regal ";
			  double b = choice*price2;
			  System.out.println("Selected liquor: "+name);
			  System.out.println("Ordered Quantity: "+choice);
			  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");
	     }
		else if(choice != 1 || choice != 2 ||choice != 3) {
          	  String name="Chivas Regal ";
          	  double b = choice*price2;
				  System.out.println("Selected liquor: "+name);
				  System.out.println("Ordered Quantity: "+choice);
				  System.out.println("Price:"+ b +"Rs/- "+choice+ "bottle");				
				
			}
		else{
	    	  System.out.println("Invalid Input");
	    	  category2();
	      }
		System.out.println("***************************************************");
	    CustomerDetails ref22 = new CustomerDetails();
		ref22.detials1();
		
	}
	
	
}

class CustomerDetails
{
	private String name;
	private String Address;
	private long MobNo ;
	private String EmailId;
	private int OrderID;

	public String getName(){
			return name;
	}

	public void setName(String name) {
			this.name = name;
	}

	public String getAddress() {
			return Address;
	}

	public void setAddress(String address) {
			Address = address;
	}

	public long getMobNo() {
			return MobNo;
	}

	public void setMobNo(long mobNo) {
			MobNo = mobNo;
	}

	public String getEmailId() {
			return EmailId;
	}

	public void setEmailId(String emailId) {
			EmailId = emailId;
	}
									
	public int getOrderID() {
			return OrderID;
	}

	public void setOrderID(int orderID) {
			OrderID = orderID;
	}
									 


	public  void detials1(){

			Scanner s = new Scanner(System.in);
       		System.out.println("Please Enter Below Details: ");
       		System.out.println("Enter Your Name : ");
       		String name = s.nextLine();

       		System.out.println("Enter Your Address : ");
       		String Address = s.nextLine();

       		System.out.println("Enter Your Mobile No : ");
       		long MobNo = s.nextLong();

       		System.out.println("Enter Your Email ID : ");
       		String EmailId = s.next();

       		Random r= new Random();
       		int g = r.nextInt(1000000000);
	        System.out.println("Your Order ID : "+g);
	        
			System.out.println("***************************************************");
	        
	        CustomerDetails ref =new CustomerDetails();
	        
	        ref.setName(name);
	        System.out.println("Name :"+ref.getName());
	        
	        ref.setAddress(Address);
	        System.out.println("Address :"+ref.getAddress());
	        
	        ref.setMobNo(MobNo);
	        System.out.println("Mobile No :"+ref.getMobNo());
	        
	        ref.setEmailId(EmailId);
	        System.out.println("Email ID :"+ref.getEmailId());
	        
	        ref.setOrderID(g);
	        System.out.println("Order ID:"+ref.getOrderID());
	        
	        System.out.println("You have order Successfully");	        
	        System.out.println("");
			System.out.println("***************************************************");

			WineShop M1 = new WineShop();
			System.out.println("Shop Name:"+ M1.Shop_Name);		
			System.out.println("Shop Address:"+ M1.Shop_Address);
			System.out.println("Contact details :"+ M1.Shop_Mob_No);
			System.out.println("Mail ID:"+ M1.Shop_Mail_Id);
			System.out.println("***************************************************");
			System.out.println("Owner Name:"+ M1.getOwner_Name());
			System.out.println("Owner Mobile No:"+ M1.getOwner_Mob_No());
			System.out.println("***************************************************");
			System.out.println("Thank You,Please visit us again !!!!!");
	}
}

class Rate extends WineShop
{
	public void rate() {
		System.out.println("*******************************************************************");

		Beer b=new Beer();
		System.out.println("\n---------"+b.beer1+"---------\n");
		
		strongBeer A1 =new strongBeer();
		System.out.println(A1.name1 +"----"+A1.ml1+"----" +A1.kf375ml+"Rs/- can");
		System.out.println(A1.name2 +"----"+A1.ml1+"----" +A1.tb375ml+"Rs/- can");
		System.out.println(A1.name3 +"----"+A1.ml1+"----" +A1.crls375ml+"Rs/- can");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(A1.name1 +"----"+A1.ml2+"----" +A1.kf650ml+"Rs/- bottle");
		System.out.println(A1.name2 +"----"+A1.ml2+"----" +A1.tb650ml+"Rs/- bottle");
		System.out.println(A1.name3 +"----"+A1.ml2+"----" +A1.crls650ml+"Rs/- bottle");

		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("\n---------"+b.beer2+"---------\n");
		mildBeer A2 =new mildBeer();
		System.out.println(A2.name1 +"----"+A2.ml1+"----" +A2.kf375ml+"/- can");
		System.out.println(A2.name2 +"----"+A2.ml1+"----" +A2.tb375ml+"/- can");
		System.out.println(A2.name3 +"----"+A2.ml1+"----" +A2.crls375ml+"/- can");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(A2.name1 +"----"+A2.ml2+"----" +A2.kf650ml+"Rs/- bottle");
		System.out.println(A2.name2 +"----"+A2.ml2+"----" +A2.tb650ml+"Rs");
		System.out.println(A2.name3 +"----"+A2.ml2+"----" +A2.crls650ml+"Rs/- bottle");

		System.out.println("-------------------------------------------------------------------");
		
		Rum r=new Rum();
		System.out.println("\n---------"+r.name+"---------\n");
		
		OldMonk ref1=new OldMonk();
		System.out.println(ref1.name +"----"+ref1.om375ml+"----" +ref1.price1+"Rs/- bottle");
		System.out.println(ref1.name +"----"+ref1.om750ml+"----" +ref1.price2+"Rs/- bottle");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Bacardi ref2=new Bacardi();
		System.out.println(ref2.name +"----"+ref2.bc375ml+"----" +ref2.price1+"Rs/- bottle");
		System.out.println(ref2.name +"----"+ref2.bc750ml+"----" +ref2.price2+"Rs/- bottle");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Mcdowell ref3=new Mcdowell();
		System.out.println(ref3.name +"----"+ref3.mcd375ml+"----" +ref3.price1+"Rs/- bottle");
		System.out.println(ref3.name +"----"+ref3.mcd750ml+"----" +ref3.price2+"Rs/- bottle");
		
		System.out.println("-------------------------------------------------------------------");
		
		Whisky ref4=new Whisky();
		System.out.println("\n---------"+ref4.name+"---------\n");
		
		Blenders ref5=new Blenders();
		System.out.println(ref5.name +"----"+ref5.bp375ml+"----" +ref5.price1+"Rs/- bottle");
		System.out.println(ref5.name +"----"+ref5.bp750ml+"----" +ref5.price2+"Rs/- bottle");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Signature ref6=new Signature();
		System.out.println(ref6.name +"----"+ref6.sg375ml+"----" +ref6.price1+"Rs/- bottle");
		System.out.println(ref6.name +"----"+ref6.sg750ml+"----" +ref6.price2+"Rs/- bottle");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Ballentine ref7=new Ballentine();
		System.out.println(ref7.name +"----"+ref7.bl375ml+"----" +ref7.price1+"Rs/- bottle");
		System.out.println(ref7.name +"----"+ref7.bl750ml+"----" +ref7.price2+"Rs/- bottle");
		
		System.out.println("-------------------------------------------------------------------");
		
		Vodka ref8=new Vodka();
		System.out.println("\n---------"+ref8.name+"---------\n");
		
		MagicMoment ref9=new MagicMoment();
		System.out.println(ref9.name +"----"+ref9.flavour1+"----"+ref9.mm375ml+"----" +ref9.gaprice1+"Rs/- bottle");
		System.out.println(ref9.name +"----"+ref9.flavour1+"----"+ref9.mm750ml+"----" +ref9.gaprice2+"Rs/- bottle");
		System.out.println(ref9.name +"----"+ref9.flavour2+"----"+ref9.mm375ml+"----" +ref9.gnprice1+"Rs/- bottle");
		System.out.println(ref9.name +"----"+ref9.flavour2+"----"+ref9.mm750ml+"----" +ref9.gnprice2+"Rs/- bottle");
		System.out.println(ref9.name +"----"+ref9.flavour3+"----"+ref9.mm375ml+"----" +ref9.wmprice1+"Rs/- bottle");
		System.out.println(ref9.name +"----"+ref9.flavour3+"----"+ref9.mm750ml+"----" +ref9.wmprice2+"Rs/- bottle");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Romanov ref10=new Romanov();
		System.out.println(ref10.name +"----"+ref10.flavour1+"----"+ref10.rm375ml+"----" +ref10.gaprice1+"Rs/- bottle");
		System.out.println(ref10.name +"----"+ref10.flavour1+"----"+ref10.rm750ml+"----" +ref10.gaprice2+"Rs/- bottle");
		System.out.println(ref10.name +"----"+ref10.flavour2+"----"+ref10.rm375ml+"----" +ref10.gnprice1+"Rs/- bottle");
		System.out.println(ref10.name +"----"+ref10.flavour2+"----"+ref10.rm750ml+"----" +ref10.gnprice2+"Rs/- bottle");
		System.out.println(ref10.name +"----"+ref10.flavour3+"----"+ref10.rm375ml+"----" +ref10.wmprice1+"Rs/- bottle");
		System.out.println(ref10.name +"----"+ref10.flavour3+"----"+ref10.rm750ml+"----" +ref10.wmprice2+"Rs/- bottle");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Smirnoff ref11=new Smirnoff();
		System.out.println(ref11.name +"----"+ref11.flavour1+"----"+ref11.sf375ml+"----" +ref11.gaprice1+"Rs/- bottle");
		System.out.println(ref11.name +"----"+ref11.flavour1+"----"+ref11.sf750ml+"----" +ref11.gaprice2+"Rs/- bottle");
		System.out.println(ref11.name +"----"+ref11.flavour2+"----"+ref11.sf375ml+"----" +ref11.gnprice1+"Rs/- bottle");
		System.out.println(ref11.name +"----"+ref11.flavour2+"----"+ref11.sf750ml+"----" +ref11.gnprice2+"Rs/- bottle");
		System.out.println(ref11.name +"----"+ref11.flavour3+"----"+ref11.sf375ml+"----" +ref11.wmprice1+"Rs/- bottle");
		System.out.println(ref11.name +"----"+ref11.flavour3+"----"+ref11.sf750ml+"----" +ref11.wmprice2+"Rs/- bottle");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Scotch ref12=new Scotch();
		System.out.println("\n---------"+ref12.name+"---------\n");
		
		Redlabel ref13=new Redlabel();
		System.out.println(ref13.name +"----"+ref13.rl750ml+"----" +ref13.price1+"Rs/- bottle");
		System.out.println(ref13.name +"----"+ref13.rl1ltr+"----" +ref13.price2+"Rs/- bottle");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Bluelabel ref14=new Bluelabel();
		System.out.println(ref14.name +"----"+ref14.bl750ml+"----" +ref14.price1+"Rs/- bottle");
		System.out.println(ref14.name +"----"+ref14.bl1ltr+"----" +ref14.price2+"Rs/- bottle");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Chivasregal ref15=new Chivasregal();
		System.out.println(ref15.name +"----"+ref15.cr750ml+"----" +ref15.price1+"Rs/- bottle");
		System.out.println(ref15.name +"----"+ref15.cr1ltr+"----" +ref15.price2+"Rs/- bottle");
		
		
		System.out.println("           ______________________________________________________\n");
		System.out.println("\n                Thank You So Much Visit Again!! \n");
		System.out.println("           ______________________________________________________\n");
	}
	
}

public class wineSoft 
{

	public static void main(String[] args)
	{
		 Info i=new Info();
		 i.signup();
		 // i.login();
		 // i.menu();
		  int choice;
		  
			do{
			Scanner s=new Scanner(System.in);
			System.out.println("Choose the liquor you want:- ");
			System.out.println("1) Beer 2)Rum 3)Whisky 4)Vodka 5)Scotch 6)Menu ");
			System.out.println("***************************************************");
			  choice = s.nextInt();
				}while(choice>10);
			
			 if ( choice == 1) {
				 Beer ref = new Beer();
			     System.out.println("Selected choice : Beer");
			     System.out.println("*********************************************");
			     ref.beer();			    
			 }
			 else if(choice ==2)
			 {
				 Rum ref1 = new Rum();
				 System.out.println("Selected choice : Rum");
			     System.out.println("*********************************************");
			     ref1.rum();
				 			 
			 }
			 else if(choice ==3)
			 {
				 Whisky ref1 = new Whisky();
				 System.out.println("Selected choice : Whisky");
				 System.out.println("*********************************************");
			     ref1.whisky();
				 		 
			 }
			 else if(choice ==4)
			 {
				 Vodka ref1 = new Vodka();
				 System.out.println("Selected choice : Vodka");
				 System.out.println("*********************************************");
			     ref1.vodka();
				 		 
			 }
			 else if(choice ==5)
			 {
				 Scotch ref1 = new Scotch();
				 System.out.println("Selected choice : Scotch");
				 System.out.println("*********************************************");
			     ref1.scotch();
				 		 
			 }
			 else if(choice==6)
			 {
				 Rate ref1 = new Rate();
				 System.out.println("Selected choice : Menu");
				 ref1.rate();
				 //System.out.println("*********************************************");
			 }
		  }
		  
		
}


