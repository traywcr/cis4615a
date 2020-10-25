// Cody Traywick
// IDS03-J. Do not log unsanitized user input

public class IDS03-J
{
  public static void main(string [] args)
  {
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + username);
    } else {
      logger.severe("User login failed for: " + username);
    }
  }
}
