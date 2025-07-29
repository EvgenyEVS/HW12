public class App {
    public static void main(String[] args) {

        Author levTolstoy = new Author("Лев", "Толстой");
        Author julesVerne = new Author("Jules", "Verne");

        Book warAndPeace = new Book("Война и мир", 1886, levTolstoy);
        Book mysteriousIsland = new Book("Mysterious Island", 2021, julesVerne);


        System.out.println("Метод toString. " + levTolstoy.toString());
        System.out.println("Метод toString. " + julesVerne.toString());
        System.out.println();

        System.out.println("Метод toString. " + warAndPeace.toString());
        System.out.println("Метод toString. " + mysteriousIsland.toString());
        System.out.println();

        System.out.println("Результат сравнения объектов (Author.) " +
                "levTolstoy и julesVerne: " + levTolstoy.equals(julesVerne));
        System.out.println("levTolstoy.hashCode() = " + levTolstoy.hashCode());
        System.out.println("julesVerne.hashCode() = " + julesVerne.hashCode());
        System.out.println();

        System.out.println("Результат сравнения объектов (Book.) " +
                "mysteriousIsland и warAndPeace: " + mysteriousIsland.equals(warAndPeace));
        System.out.println("mysteriousIsland.hashCode() = " + mysteriousIsland.hashCode());
        System.out.println("warAndPeace.hashCode() = " + warAndPeace.hashCode());

    }
}