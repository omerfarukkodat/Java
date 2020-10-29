public class Main {

    public static void main(String[] args) {
        /*int number = 13;
        if (number < 2) {
            System.out.println("Sayı Asal Değildir");
            return;
        }
        for (int i = 2; i < number; i++) {
            int remainder = number % i;
            if (remainder == 0) {
                System.out.println("Sayı Asal Değildir");
                return;
            }
            else if (remainder!=0){
                System.out.println("Sayı Asaldır");

            }
        }
    }
}*/


        boolean İsPrime = true;

        if(number<2){
            System.out.println("Sayı Asal Değildir");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                İsPrime = false;
            }
        }
        if (İsPrime) {
            System.out.println("Sayı Asaldır");
        }else{
            System.out.println("Sayı Asal Değildir");
        }
    }
}
