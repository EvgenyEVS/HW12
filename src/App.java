public class App {
    public static void main(String[] args) {

        Author levTolstoy = new Author("Лев", "Толстой");
        Author julesVerne = new Author("Jules", "Verne");

        Book warAndPeace = new Book("Война и мир", 1886, levTolstoy);
        Book mysteriousIsland = new Book("Mysterious Island", 2021, julesVerne);

        System.out.println("Удивительное погружение в эпоху войн против Наполеона, \n" +
                "со сложным сюжетом и тонкими переживаниями. Настоящая русская классика! \n" +
                "Рекомендуем книгу " + levTolstoy.getAuthorName() + " " + levTolstoy.getAuthorSurname() + " " + warAndPeace.getBookName()
                + ", впервые издана в " + warAndPeace.getPublicationYear() + " году.");

        System.out.println();
        System.out.println(mysteriousIsland.getBookName() + " - это увлекательные приключения. " + julesVerne.getAuthorName() + " " + julesVerne.getAuthorSurname()
                + " как всегда \nпомещает своих героев в необычные условия, на этот раз - " + mysteriousIsland.getBookName() + "!");

        mysteriousIsland.setPublicationYear(2024);
        System.out.println();
        System.out.println("Книга " + mysteriousIsland.getBookName() + " переиздана в " + mysteriousIsland.getPublicationYear() +
                " году" + " с красочными картинками для детей.");


    }
}