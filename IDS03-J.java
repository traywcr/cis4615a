// Cody Traywick
// IDS03-J. Do not log unsanitized user input

public class IDS03-J
{
  public static void main(string [] args)
  {
    if (loginSuccessful) 
    {
      logger.severe("User login succeeded for: " + sanitizeUser(username));
    } 
    else 
    {
      logger.severe("User login failed for: " + sanitizeUser(username));
    }
    // Prevents injection attacks
    public String sanitizeUser(String username) 
    {
    return Pattern.matches("[A-Za-z0-9_]+", username))
      ? username : "unauthorized user";
    }
  }
  
}
