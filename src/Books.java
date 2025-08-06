public class Books {

    // Kitap sınıfı

    String title;
    String author;
    int pageCount;

    public Books (String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }


    @Override
    public String toString() {
        return "📖 " + title + " - " + author + " (" + pageCount + " page)";
    }


}
