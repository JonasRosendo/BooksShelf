package br.com.jonasrosendo.booksshelf;

public class Book {

    String title, category;
    int description, thumbnail;

    public Book() {
    }

    public Book(String title, int description, String category, int thumbnail) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
