package protected;

public class Author {
    
    Person p = new Person();

    public Author() {
        // akan terjadi error di sini karena atribut name 
        // telah diberikan modifier protected
        p.name = "Petani Kode";
    }
    
}