
package enkapsulasi_user;


public class Enkapsulasi_User {


    public static void main(String[] args) {
         
        User Renn = new User( "a" , "b" , 1, true);
        
        Renn.setUsername("Reno");
        Renn.setPassword("manyala");
        Renn.setId(32);
        Renn.setStatus(false);
        
        
        
        
        
        System.out.println("Username : "+Renn.getUsername());
        System.out.println("Password : "+Renn.getPassword());
        System.out.println(" id: " +Renn.getId());
        System.out.println("Status : "+Renn.getStatus());
      
    }
    
}
