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
            "5.Pe3-e4 Pe6-e5",
            "6.Kc1-c2 Pe5xc2"
        };
        a = new Chess(6, str);
        System.out.println("\nChess notation 2:");
        a.cout();
        System.out.println("Tets 1:");
        System.out.println("    Search e2 after 2 moves.");
        System.out.println("    Result: " + a.search("e2", 2));
        System.out.println("Tets 2:");
        System.out.println("    Search b8 after 1 move.");
        System.out.println("    Result: " + a.search("b8", 1));
        System.out.println("Tets 3:");
        System.out.println("    Search c1 after 3 moves.");
        System.out.println("    Result: " + a.search("c1", 3));

        str = new String[] {
            "1.Pb2-b3 Pa7-a6",
            "2.Pb3-b4 Pa6-a5",
            "3.Pb4xa5 Pd7-d5"
        };
        a = new Chess(3, str);
        System.out.println("\nChess notation 3:");
        a.cout();
        System.out.println("Tets 1:");
        System.out.println("    Search b2 after 2 moves.");
        System.out.println("    Result: " + a.search("b2", 2));
        System.out.println("Tets 2:");
        System.out.println("    Search a7 after 3 move.");
        System.out.println("    Result: " + a.search("a7", 3));

    }
}
