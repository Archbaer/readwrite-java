import java.io.*;
import java.util.Scanner;

public class Main {
    public static void textFileWrite() {
        Person person = new Person("Nick", 25, 75);
        String message = person.toString();
        try  {
            FileWriter fileObj = new FileWriter("file1.txt");
            fileObj.write(message);
            System.out.println("File written with FileWriter...");
            fileObj.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static void binaryFileWrite() {
        byte[] numbers = {10, 20, 30, 40, 50}; // Just some sample numbers
        try (FileOutputStream fileObj = new FileOutputStream("file2.dat")) {
            for (int i=0; i< numbers.length; i++) {
                fileObj.write(numbers[i]);
            }
            System.out.println("File written with FileOutputStream...");
            fileObj.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }


    public static void printWrite() {
        String data;
        try {
            PrintWriter fileObj = new PrintWriter("file3.txt");
            Scanner in = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = in.nextLine();
            System.out.println("Enter age: ");
            int age = in.nextInt();
            System.out.println("enter weight: ");
            double weight = in.nextDouble();
            Person person = new Person(name,age,weight);

            data = person.toString();
            fileObj.println(data);
            fileObj.close();
            System.out.println("File written with PrintWriter...");
        }
        catch(IOException e) {
            e.getStackTrace();
        }
    }
    public static void streamWrite() {
        try {
            FileOutputStream file = new FileOutputStream("file4.dat");
            DataOutputStream fileObj = new DataOutputStream(file);
            Person person = new Person("Nick", 25, 75);
            fileObj.writeUTF(person.name);
            fileObj.writeInt(person.age);
            fileObj.writeDouble(person.weight);
            fileObj.flush();
            fileObj.close();
            System.out.println("File written with DataOutputStream...");
        }
        catch(IOException e) {
            e.getStackTrace();
        }
    }
    public static void main(String[] args) throws Exception{
        textFileWrite();
        binaryFileWrite();
        printWrite();
        streamWrite();
    }
}