public class es49 {
    public static void Main(String[] args) {
        Computer computer = new Computer("Dell", "Optiplex 7010", "Windows 10 Pro");
        Smartphone smartphone = new Smartphone("Android", "Redmi Note 12 Pro 5G", 3479300813L);

        computer.accendi();
        smartphone.chiama();
    }
}