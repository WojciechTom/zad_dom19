public class TablicaTest {
    public static void main(String[] args) throws NoSuchElementException {
        Tablica tab = new Tablica();
        int[] tab1 = {1,2,3,2,3};

        System.out.println("najczęściej wystepująca wartość to \n " + tab.moda(tab1));

    }

}
