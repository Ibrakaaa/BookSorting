import javax.sound.midi.Soundbank;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        TreeSet<Books> book = new TreeSet<>();

        Books Book1 = new Books("Kendime Dusunceler",144,"Marcus Aurelius",180);
        Books Book2 = new Books("Sevda Sozleri",322,"Cemal Sureya",1990);
        Books Book3 = new Books("Bulbulu Oldurmek",355,"Harper Lee",1963);
        Books Book4 = new Books("Serenad",481,"Zulfu Livaneli",2015);
        Books Book5 = new Books("Bu Ulke",339,"Cemil Meric",1975);

        book.add(Book1);
        book.add(Book2);
        book.add(Book3);
        book.add(Book4);
        book.add(Book5);

        System.out.println("Ada Gore Liste: ");
        System.out.println("------------------------------------------------------------");
        for(Books books:book){
            System.out.println("Kitap Adi : \n"+books.getName()+
                    ", Sayfa Sayisi : "+books.getPage()+
                    ", Yazarin Ismi : "+books.getAuthor()+
                    ", Yayin Yili : "+ books.getPublishYear());
            System.out.println("------------------------------------------------------------");

        }
        TreeSet<Books> book1 = new TreeSet<>(new Comparator<Books>() {
            @Override
            public int compare(Books o1, Books o2) {
                return o1.getPage() - o2.getPage();

            }
        });
        book1.add(Book1);
        book1.add(Book2);
        book1.add(Book3);
        book1.add(Book4);
        book1.add(Book5);
        System.out.println();
        System.out.println("***********************************************************");
        System.out.println("***********************************************************");
        System.out.println();
        System.out.println("Safya Sayisina Gore: ");
        System.out.println("------------------------------------------------------------");
        for(Books books:book1){
            System.out.println("Kitap Adi : \n"+books.getName()+
                    ", Sayfa Sayisi : "+books.getPage()+
                    ", Yazarin Ismi : "+books.getAuthor()+
                    ", Yayin Yili : "+ books.getPublishYear());
            System.out.println("------------------------------------------------------------");

        }




    }
}
