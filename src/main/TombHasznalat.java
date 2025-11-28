package main;

public class TombHasznalat {
    public static void main(String[] args) {
        String aktiv = "";
        //indexek:          0   1   2   3   4
        String[] tarto1 = {"P","K","Z","-","-"};
        int tarto1Poz = 2;
        
        int hely;
        hely = 0;
        System.out.println("első elem: " + tarto1[hely]);
        
        hely = tarto1.length-1;
        System.out.println("legfelső elem: " + tarto1[hely]);
        
        hely = tarto1Poz;
        System.out.println("mozgatható elem: " + tarto1[hely]);
        
        System.out.println("elveszem a legfelső mozgathatót");
        aktiv = tarto1[tarto1Poz];
        tarto1[tarto1Poz] = "-";
        tarto1Poz--;
        
        System.out.println("tárolóbeli elhelyezése");
        if(tarto1Poz < tarto1.length-1){
            if(tarto1[tarto1Poz] == aktiv){
                tarto1[tarto1Poz] = aktiv;
                aktiv = "";
                tarto1Poz++;
            }
        }
    }
}
