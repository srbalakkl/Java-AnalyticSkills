package MegaByteConverter;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kb) {
        if (kb < 0) {
            System.out.println("Invalid Value");
        } else {
//            2500 KB = 2 MB and 452 KB
            int mb = kb / 1024;
            int kilobyte = kb % 1024;
            System.out.println(kb + " KB = " + mb + " MB and " + kilobyte + " KB");
        }
    }

    public static void main(String[] args) {

//        MegaBytesConverter obj = new MegaBytesConverter();
        printMegaBytesAndKiloBytes(0);
    }
}
