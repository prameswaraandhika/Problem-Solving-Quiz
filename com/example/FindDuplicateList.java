import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateList {
    public static void main(String[] args) {

        List<String> listStudent = List.of(
                "Andhika",
                "Putri",
                "Ica",
                "Goku",
                "Andhika",
                "Khabib",
                "Michu");

        Set<String> unique = new HashSet<>();

        for (String student : listStudent) {
            // add pada set mengembalikan true jika berhasil dan false jika tidak berhasil
            // jika data terbaca duplikasi maka unique tidak bisa menambahkan data tersebut
            if (!unique.add(student)) {
                System.out.println(student);
            }
        }

    }
}
