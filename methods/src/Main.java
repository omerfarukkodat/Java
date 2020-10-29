public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int aranacak = 7;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
            }

        }
        if (varMi) {
            mesajVer("Sayı mevcuttur : " + aranacak);
        } else {
            mesajVer("Sayı mevcut değildir :" + aranacak)
        }

    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
