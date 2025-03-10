package com.universalsorter.model;

public class Book implements Storable,Comparable {

    private final String author;
    private final String title;
    private final Integer numberOfPages;



    private Book(String author, String title, Integer numberOfPages) {
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }


    public static Builder builder() {
        return new Builder();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


    public static class Builder {
        private String author;
        private String title;
        private Integer numberOfPages;


        public Book.Builder author(String author) {
            this.author = author;
            return this;
        }

        public Book.Builder title(String title) {
            this.title = title;
            return this;
        }

        public Book.Builder page(Integer numberOfPages) {
            this.numberOfPages = numberOfPages;
            return this;
        }

        public Book build() {
            if (author == null || title == null || numberOfPages < 1) {
                throw new IllegalStateException("Введены некорректные данные");
            }
            return new Book(author, title, numberOfPages);
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String serialize() {
        return String.format("Book,%s,%s,%d", author, title, numberOfPages);
    }

    @Override
    public Storable deserialize(String data) {
        String[] parts = data.split(",");
        if (parts.length != 4 || !"Book".equals(parts[0])) {
            throw new IllegalArgumentException("Некорректные данные для десериализации Book: " + data);
        }
        return Book.builder()
                .author(parts[1])
                .title(parts[2])
                .page(Integer.parseInt(parts[3]))
                .build();
    }
    @Override
    public String toString() {
        return "Автор: " + author + "\n" +
                "Название книги: " + title + "\n" +
                "Количество страниц: " + numberOfPages+"\n";
    }
}
