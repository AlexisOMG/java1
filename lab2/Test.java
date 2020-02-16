public class Test{
    public static void main(String[] args) {
        String[] str = new String[] {
            "1.Pe2-e4 Pe7-e5",
            "2.Bf1-c4 Nb8-c6",
            "3.Qd1-h5 Ng8-f6",
            "4.Qh5xf7#"
        };
        Chess a = new Chess(4, str);
        System.out.println("Chess notation 1:");
        a.cout();
        System.out.println("Tets 1:");
        System.out.println("    Search f1 after 1 move.");
        System.out.println("    Result: " + a.search("f1", 1));
        System.out.println("Tets 2:");
        System.out.println("    Search h5 after 1 move.");
        System.out.println("    Result: " + a.search("h5", 1));

        str = new String[] {
            "1.Pe2-e3 Pe7-e6",
            "2.Ng1-f3 Nb8-c6",
            "3.Bf1-c4 Ng8-f6",
            "4.Nb1-c3 Pd7-d6",
            "5.Pe3-e4 Pe6-e5"
        };
        a = new Chess(5, str);
        System.out.println("\nChess notation 2:");
        a.cout();
        System.out.println("Tets 1:");
        System.out.println("    Search e2 after 2 moves.");
        System.out.println("    Result: " + a.search("e2", 2));
        System.out.println("Tets 2:");
        System.out.println("    Search b8 after 1 move.");
        System.out.println("    Result: " + a.search("b8", 1));
    }
}
