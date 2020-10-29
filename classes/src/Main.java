public class Main {

    public static void main(String[] args) {
	CustomerManager customerManager = new CustomerManager();
	CustomerManager customerManager2 = new CustomerManager();
	customerManager = customerManager2;
	customerManager.Add();
	customerManager.Remove();
	customerManager.Update();

    int sayi1 = 10;
    int sayi2 = 20;
    sayi2 = sayi1;
    sayi1 = 25;
        System.out.println(sayi2);
        int [] sayilar1 = new int[] {1,2,23};
        int [] sayilar2 = new int [] {45,34,59};
        sayilar2 = sayilar1;
        sayilar1[0] = 23;
        System.out.println(sayilar2[0]);

}
}
