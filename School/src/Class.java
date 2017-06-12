import java.io.*;
import java.util.*;

public class Class {
    public Collection klass1(){
        Collection co1=new ArrayList();
            try {
                BufferedReader br = new BufferedReader(new FileReader("classList//1.csv"));
                String line;
                Scanner scanner;
                while ((line = br.readLine()) != null) {
                    scanner = new Scanner(line);
                    scanner.useDelimiter(",");
                    while (scanner.hasNext()) {
                        String data = scanner.next();
                        co1.add(data);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        return co1;
    }
    public Collection klass2(){
        Collection co1=new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader("classList//2.csv"));
            String line;
            Scanner scanner;
            while ((line = br.readLine()) != null) {
                scanner = new Scanner(line);
                scanner.useDelimiter(",");
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    co1.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return co1;
    }
    public Collection klass3(){
        Collection co1=new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader("classList//3.csv"));
            String line;
            Scanner scanner;
            while ((line = br.readLine()) != null) {
                scanner = new Scanner(line);
                scanner.useDelimiter(",");
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    co1.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return co1;
    }
    public Collection klass4(){
        Collection co1=new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader("classList//4.csv"));
            String line;
            Scanner scanner;
            while ((line = br.readLine()) != null) {
                scanner = new Scanner(line);
                scanner.useDelimiter(",");
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    co1.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return co1;
    }
    public Collection klass5(){
        Collection co1=new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader("classList//5.csv"));
            String line;
            Scanner scanner;
            while ((line = br.readLine()) != null) {
                scanner = new Scanner(line);
                scanner.useDelimiter(",");
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    co1.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return co1;
    }

}