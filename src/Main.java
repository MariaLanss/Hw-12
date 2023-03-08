public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Рэй", "Брэдбери");
        Author author2 = new Author("Пауло", "Коэльо");
        Author author3 = new Author("Дэвид", "Сэлинджер");
        Book book1 = new Book("451 градус по Фаренгейту", author1, 1953);
        Book book2 = new Book("Алхимик", author2, 1988);
        Book book3 = new Book("Над пропастью во ржи", author3, 1951);
        printBookProperties(book1);
        printBookProperties(book2);
        book2.setYearOfPublication(2014);

        printBookProperties(book2);
        System.out.println(book3.toString());
        System.out.println(author3.toString());
        System.out.println(book1.equals(book3));
    }
    public static void printBookProperties(Book book) {
        System.out.println(book.getBookTitle() + " " + book.getAuthor() + " " + book.getYearOfPublication());
    }

}