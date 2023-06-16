import java.io.File;

public class FileHandling {
  public static void main(String[] args) {
    try {
      String fn = "first.txt";
      File f1 = new File(fn);
      f1.createNewFile();
      System.out.println("File " + f1.getName() + " created");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
