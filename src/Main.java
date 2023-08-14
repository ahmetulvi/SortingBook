import java.util.TreeSet;


public class  Main {
    public static void main(String[] args) {
        TreeSet<Book> books=new TreeSet<>();
        Book b1=new Book("1984",450,"George Orwell","1949");
        Book b2=new Book("Simyacı",350,"Paulo Coelho","1988");
        Book b3=new Book("Zengin Baba Yoksul Baba",250,"Robert T. Kiyosaki","1997");
        Book b4=new Book("Hayvan Çiftliği",320,"George Orwell","1945");
        Book b5=new Book("Kürk Mantolu Madonna",430,"Sabahattin Ali","1943");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);


        for (Book bookName:books){
            System.out.println("Book Name: "+bookName.getName()+
                    "\nNumber of Page: "+bookName.getPageNumber()+
                    "\nAuthor: "+bookName.getAuthor()+
                    "\nPublish Date: "+bookName.getPublishDate());
            System.out.println("*********************************************");
        }
        System.out.println(" ");
        TreeSet<Book> books1=new TreeSet<>(new OrderPageNumberComparator());
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        System.out.println("Order by Page Number");
        for (Book bookPage:books1){
            System.out.println("Book Name: "+bookPage.getName()+
                    "\nNumber of Page: "+bookPage.getPageNumber()+
                    "\nAuthor: "+bookPage.getAuthor()+
                    "\nPublish Date: "+bookPage.getPublishDate());
            System.out.println("*********************************************");
        }

    }
}