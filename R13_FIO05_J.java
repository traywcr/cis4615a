//  Cody Traywick
//  Rule 13. Input Output (FIO)
//  FIO05-J. Do not expose buffers or their backing arrays methods to untrusted code

public class R13_FIO05_J
{
  final class Wrap
  {
    private char[] dataArray;

    public Wrap()
    {
      dataArray = new char[10];
      // Initialize
    }

    public CharBuffer getBufferCopy()
    {
      return CharBuffer.wrap(dataArray).asReadOnlyBuffer();
    }
  }
}
