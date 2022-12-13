import java.util.ArrayList;
import java.util.List;

public class Main {
    static ArrayList<String> dolap = new ArrayList<String>();

    public static void main(String[] args) {

        openAndClose(0);

        String str = "A";
        int sayac=0;
        for(int i=0; i<1000; i++)
        {
            if(dolap.get(i).equalsIgnoreCase(str))
            {
                System.out.println(i + " nolu dolap açıktır.");
                sayac++;
            }
        }
        System.out.println("-----");
        System.out.println("Toplamda " + sayac + " adet açık dolap mevcuttur.");

    }

public static int openAndClose(int k) {

    if (k>=1 && k < 999) {
        for (int i = 0; i < 1000; i = i + k) {
            if(dolap.get(i).equalsIgnoreCase("K")) {
                dolap.set(i,"A");
            }
            else {
                dolap.set(i,"K");
            }
        }
        return openAndClose(k + 1);
    } else if (k == 0) {
        for (int j = 0; j < 1000; j++) {
            dolap.add(j, "K");
        }
        return openAndClose(k + 1);
    } else {
        return 0;
    }
}
}