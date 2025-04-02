package ch12_inheritance.book;

public class EBook extends Book{
    private double fileSize;
    private String format;

    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    public EBook(String title, String author) {
        super(title, author);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void displayInfo() {
        System.out.println("제목 : " + this.getTitle());
        System.out.println("저자 : " + this.getAuthor());
        System.out.println("파일 크기 : " + this.getFileSize() + "MB");
        System.out.println("파일 형식 : " + this.getFormat());
    }
}