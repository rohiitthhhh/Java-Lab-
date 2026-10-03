class Book
{
    String title;
    String author;
    double price;

    Book()
    {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    Book(String t, String a, double p)
    {
        title = t;
        author = a;
        price = p;
    }

    void display()
    {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public static void main(String[] args)
    {
        Book b1 = new Book();
        Book b2 = new Book("Java", "James", 500);

        b1.display();
        b2.display();
    }
}
