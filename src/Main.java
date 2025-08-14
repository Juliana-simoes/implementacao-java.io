import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;
import br.com.dio.persistence.NIOFilePersistence;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new IOFilePersistence("user.csv");
        System.out.println("-----------IOFilePersistence----------");

        System.out.println("Write");
        System.out.println(persistence.write("Juliana 08/08/2025"));
        System.out.println(persistence.write("Noah 12/08/2025"));
        System.out.println(persistence.write("Thiago 17/08/2025"));
        System.out.println("---------------------");
        System.out.println("FindAll");
        System.out.println(persistence.findAll());
        System.out.println("---------------------");
        System.out.println("Remove");
        System.out.println(persistence.remove("Ana"));
        System.out.println(persistence.remove("Noah"));
        System.out.println("---------------------");
        System.out.println("FindBY");
        System.out.println(persistence.findBy("12"));
        System.out.println("---------------------");
        System.out.println("Replace");
        System.out.println(persistence.replace("Juliana" , "Hebrain 14/08/2025"));
        System.out.println("---------------------");
        System.out.println("FindAll");
        System.out.println(persistence.findAll());

        System.out.println("-----------NIOFilePersistence----------");

        FilePersistence persistenceNIO = new NIOFilePersistence("user.csv");
        System.out.println("Write");
        System.out.println(persistenceNIO.write("Nome: Ana Santos 15/08"));
        System.out.println(persistenceNIO.write("Nome: Lis Maria  1/08"));
        System.out.println(persistenceNIO.write("Nome: Joao Paz 13/08"));
        System.out.println("---------------------");
        System.out.println("FindAll");
        System.out.println(persistenceNIO.findAll());
        System.out.println("---------------------");
        System.out.println("FindBy");
        System.out.println(persistenceNIO.findBy("Ana"));
        System.out.println(persistenceNIO.findBy("Maria"));
        System.out.println("---------------------");
        System.out.println("Remove");
        System.out.println(persistenceNIO.remove("Ana"));
        System.out.println(persistenceNIO.remove("Joana"));
        System.out.println("---------------------");
        System.out.println("FindAll");
        System.out.println(persistenceNIO.findAll());
        System.out.println("---------------------");
        System.out.println("Replace");
        System.out.println(persistenceNIO.replace("Lis" , "Hebrain 14/08/2025"));

    }

}
