
import java.io.*;

public class Journal {
    IOProcessor processor=new IOProcessor();
    void writeJurnal() {
        String nameWork=null;
        processor.print("Введите класс\n");
        String klass=null;
        klass=processor.read(klass);
        processor.print("Введите название предмета\n");
        nameWork=processor.read(nameWork);
        String name=null;
        processor.print("Введите ФИО ученика\n");
        name=processor.read(name);
        String date=null;
        processor.print("Введите дату\n");
        date=processor.read(date);
        String ocenka=null;
        processor.print("Введите оценку\n");
        ocenka=processor.read(ocenka);

            try(FileWriter writer=new FileWriter("jurnal//"+klass+".csv",true)) {
                writer.write(nameWork+";"+name+";"+date+";"+ocenka+";\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    void readJurnaj(){
        processor.print("Введите класс\n");
        String klass=null;
        klass=processor.read(klass);
        try{
           FileReader reader=new FileReader("jurnal//"+klass+".csv");
            int s;
            while ((s= reader.read())!=-1){
                processor.print((char)s+"\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
