public class Books implements Comparable<Books>{
    private String name;
    private int page;
    private String author;
    private int publishYear;

    public Books(String name, int page, String author, int publishYear) {
        this.name = name;
        this.page = page;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    @Override
    public int compareTo(Books o) {
        return getName().compareTo(o.getName());
    }
}
