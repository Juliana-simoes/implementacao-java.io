import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new IOFilePersistence("user.csv");
        System.out.println(persistence.write("Juliana;jusim@google.com;08/08/2025"));
        System.out.println("---------------------");
        System.out.println(persistence.write("Noah;Noah@google.com;12/08/2025"));
        System.out.println("---------------------");
        System.out.println(persistence.findAll());
        System.out.println("---------------------");
        System.out.println(persistence.remove("Ana"));
        System.out.println("---------------------");
        System.out.println(persistence.findBy("12"));
        System.out.println("---------------------");
        System.out.println(persistence.replace("Juliana" , "Hebrain"));
        System.out.println("---------------------");
        System.out.println(persistence.findAll());

    }

}
