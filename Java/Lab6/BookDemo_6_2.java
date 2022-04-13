class Book
{
    String author_name="R.K.Sharma";
    void display()
    {
        System.out.println("name of author : "+author_name);
    }
}

class Book_Publication extends Book{
    String book_title="2states";
    void display(){
        System.out.println("book title : "+book_title);
    }
}

class Paper_Publication extends Book{
    String paper_title="paper";
    void display(){
        System.out.println("Paper title : "+paper_title);
    }
}



public class BookDemo_6_2
{
    public static void main(String[] args)
    {

        Book b1 = new Book();
        b1.display();

        Book_Publication b2 = new Book_Publication();
        b2.display();

        Paper_Publication b3= new Paper_Publication();
        b3.display();

        System.out.println("------------------by dynamic method dispatch-----------------------------");
        Book b4 = new Book_Publication();
        b4.display();
        Book b5 = new Paper_Publication();
        b5.display();

    }
}