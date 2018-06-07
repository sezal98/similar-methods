import org.apache.commons.validator.UrlValidator;

public class urlValidator {
    
    public static void main(String args[]){
        
        UrlValidator urlValidator = new UrlValidator();
        System.out.println(urlValidator.isValid("http://usr:pwd@localhost")); // false
        System.out.println(urlValidator.isValid("http://username:password@192.168.10.10:4010/")); //false
        
    }
    
}