public class CountDown {   // Klassenname (Modul) entspricht Dateiname
    public static void main(String[] args) {  // Standard Hauptprogram
        int i=10;                                  // declare variable
        while (i>0) {                   // while loop (for simplicity)
            System.out.println(i);                     // print number
            if (i == 8) {
                System.out.println("ignition sequence start");
            }
            i = i - 1;          // core code almost identical to C/C++
        }
        System.out.println("liftoff!");
    }
}