class user{
	 String name;
	 String password;
	 int  age; 
	 String mobileNumber;
	 String gmail;
	}
class Book{ 
	          String bookName;
	          String catagories;
              String authorName; 
	          String languages;
}
class card{
                        String cardName;
                    	String address;
	                    String mobileNumber;
	                    String gMail;
	}
class reminderMessage{
        String bookNmae; 
	    String bookAvailable;
	    String date;
	}
public class classObj {
	public static void main(String args[]) 
	{ 
user Rahim = new user();  
		Rahim.name="AbdulRahim"; 
		Rahim.password="Mashaallah";
		Rahim.age=19;
		Rahim.mobileNumber="7448725788";
		Rahim.gmail="blacklover2311@gmail.com";
		
Book myFav = new Book();
        myFav.authorName="Allah";
        myFav.bookName="Nabi's Life ";
        myFav.catagories="Lifestyle";
        myFav.languages="English";
card myCard = new card();
        myCard.cardName="AbdulRahiim";
        myCard.address="Thindivanam ramamoorthy street,Vandimedu,Villupuram,";
        myCard.gMail="Abdulrahimns0816@gmail.com";
        myCard.mobileNumber="8680925788";
        
reminderMessage msg = new reminderMessage();
       msg.bookNmae="Nabi's Life";
       msg.bookAvailable="All Book Available";
       msg.date="11-11-2002";
 }
}
