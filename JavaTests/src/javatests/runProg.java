package javatests;

// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.FileWriter;
// import java.io.IOException;
import java.io.*;
import java.sql.*;

public class runProg {
    public static void inheritance() {
        Parent p1 = new Parent();
        Child c1 = new Child();
        c1.name();
        p1.name();
        p1.sign();
        c1.sign();        
    }

    public static void dbcon() {
        try {
            // load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // creating connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "12345");
    
            if(con.isClosed()) {
                System.out.println("Connection closed!");
            }
            else {
                System.out.println("Connection created :)");
    
                // create table
                String q = "create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
                // create statement
                Statement stmt = con.createStatement();
                stmt.executeUpdate(q);
                System.err.println("Table Created in database.");
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fileByte() {
        try {
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt");
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
                System.out.println(data);
            }
            in.close();
            out.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    
    public static void fileCharCopyFile() {
        try {
            FileReader in = new FileReader("input.txt");
            FileWriter out = new FileWriter("output.txt");
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
                System.out.println(data);
            }
            in.close();
            out.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static void fileCharReadWrite() {
        try {
            FileWriter writer = new FileWriter("write.txt");
            writer.write("line-1\nline number @2\nthis will be the last line!");
            writer.close();
            
            FileReader fr = new FileReader("write.txt");
            char[] a = new char[50];
            fr.read(a);
            for (char c : a) {
                System.out.println(c);
            }
            fr.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void fileRandAcc() {
        try {
            RandomAccessFile raf = new RandomAccessFile("write.txt", "rw");
            
            raf.writeUTF("Hello World");
            raf.writeUTF("Hi");
            
            raf.seek(0);
            System.out.println(raf.readUTF());
            
            long pos = raf.getFilePointer();
            System.out.println("Current position: " + pos);
            System.out.println(raf.readUTF());
            
            raf.seek(0);
            System.out.println(raf.readUTF());
            raf.seek(13);
            System.out.println(raf.readUTF());

            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void fileObj() {
        Person p1 = new Person("Sugam Karki", 22, "M");
        Person p2 = new Person("Lionel Messi", 37, "M");

        try {
            FileOutputStream fos = new FileOutputStream(new File("objects.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.close();
            fos.close();
            
            FileInputStream fis = new FileInputStream(new File("objects.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person pr1 = (Person) ois.readObject();
            Person pr2 = (Person) ois.readObject();
            System.out.println(pr1.toString());
            System.out.println(pr2.toString());
            ois.close();
            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // inheritance();
        // dbcon();
        // fileByte();
        // fileCharCopyFile();
        // fileCharReadWrite();
        // fileRandAcc();
        fileObj();
    }   
}