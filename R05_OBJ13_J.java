// Cody Traywick
// Rule 05. Object Orientation (OBJ)
// OBJ13-J. Ensure that references to mutable objects are not exposed

public class R05_OBJ13_J
{
  public static final SomeType [] SOMETHINGS = { ... };
  public static final getSomethings() 
  {
    return SOMETHINGS.clone();
  }
}
