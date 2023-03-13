// "Harmonik ortalama, gözlem sonuçlarının terslerinin, aritmetik ortalamasının tersidir."
// https://tr.wikipedia.org/wiki/Harmonik_ortalama

public class DizilerdekiElemanlarinHarmonikOrtalamasi {
    public static void main(String[] args) {
        int[] list = {1, 4, 4};
        double harmonikOrtalama = 0.0, harmonikSeri = 0.0;
        int elemanSayisi = list.length;

        for (int i = 0; i < list.length; i++)
            harmonikSeri += 1.0 / list[i];

        harmonikOrtalama = elemanSayisi / harmonikSeri;
        System.out.println("Harmonik ortalama: " + harmonikOrtalama);
    }
}
