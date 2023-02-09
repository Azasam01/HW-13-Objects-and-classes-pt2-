public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("James", "Joyce");

        Book book1 = new Book("Ulysses", author1, 1921);
        book1.setYearOfPublication(1922);
        System.out.println("Title of the book - " + book1.getName());
        System.out.println("Author of the book - " + book1.getAuthor());
        System.out.println("Year of publication of the book - " + book1.getYearOfPublication());

        System.out.println("author1.hashCode() = " + author1.hashCode());
        System.out.println("book1.hashCode() = " + book1.hashCode());


        Author author2 = new Author("Fyodor", "Dostoyevsky");

        Book book2 = new Book("Crime and Punishment", author2, 1866);
        System.out.println("Title of the book - " + book2.getName());
        System.out.println("Author of the book - " + book2.getAuthor());
        System.out.println("Year of publication of the book - " + book2.getYearOfPublication());

        System.out.println("author2.hashCode() = " + author2.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());

        System.out.println("author1.equals(author2)? " + author1.equals(author2));
        System.out.println("book1.equals(book2)? " + book1.equals(book2));


    }
}