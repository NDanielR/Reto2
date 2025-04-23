package util;

import java.util.Scanner;

public class ScannerSingleton {
    private static Scanner scn;

    private ScannerSingleton() {
        // Constructor privado para evitar instanciación externa
    }

    public static Scanner getInstance() {
        if (scn == null) {
            scn = new Scanner(System.in);
        }
        return scn;
    }

    public static void close() {
        if (scn != null) {
            scn.close();
            scn = null;
        }
    }
}
