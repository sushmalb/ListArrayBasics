import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;

public class WritingFile {

  private static String fileName = "emp.csv";

  private static void writeDataToCsv() {
    try {
      BufferedWriter wr = new BufferedWriter(new FileWriter(fileName));
      wr.write("name,empid,designation,salary");
      wr.newLine();
      wr.write("Arun,101,developer,25000");
      wr.newLine();
      wr.write("Rahul,102,developer,50000");
      wr.newLine();
      wr.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void readDataFromCsv() {
    try (BufferedReader re = new BufferedReader(new FileReader(fileName))) {
      String line;
      line = re.readLine();
      while ((line = re.readLine()) != null) {
        String[] data = line.split(",");
        String name = data[0].trim();
        int empId = Integer.parseInt(data[1].trim());
        int sal = Integer.parseInt(data[3].trim());
        if (sal > 40000) {
          System.out.println("Name of employee " + name + " Employee Id " + empId);
        }

      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    writeDataToCsv();
    readDataFromCsv();
  }
}