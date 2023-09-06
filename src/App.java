public class App {
    public static void main(String[] args) throws Exception {
        int tal1 = 2;
        int tal2 = 30;

        int summa_addition = tal1+tal2;
        int summa_subraktion = tal1-tal2;

        System.out.println("Summan av tal1 + tal2 är "+ summa_addition);
        System.out.println("Summan av tal1 - tal2 är "+ summa_subraktion);

        int produkt=tal1*tal2;
        int kvot=tal1/tal2;

        System.out.println("Produkten av tal1*tal2 är "+ produkt);
        System.out.println("Kvoten av tal1/tal2 är "+kvot);
    }
}
