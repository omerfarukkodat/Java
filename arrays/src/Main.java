public class Main {

    public static void main(String[] args) {
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Selim";
        ogrenciler[1] = "Kemal";
        ogrenciler[2] = "Ali";
        ogrenciler[3] = "Ömer";
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("=========");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}

