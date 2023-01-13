public class Zad2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 1, 4, 5, 6, 1, 1, 3, 4, 8};
        System.out.println(getNumber(numbers));
    }

    public static int getNumber(int[] numbers) {
        int licznikMax = 0;
        int topLiczba = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int licznik = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    licznik = licznik + 1;
                }
                if (licznik > licznikMax) {
                    topLiczba = numbers[i];
                    licznikMax = licznik;
                }
            }
        }
        return topLiczba;
    }

}