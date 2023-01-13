public class Names {
    public static void main(String[] args) {

        String[] names = {"Ania", "Kasia", "Basia", "Olek", "Sebastian", "Alex", "Ola", "Wojtel", "Maks", "Olgierd", "Janek",
                "Paweł"};
        getLongestString(names);
        System.out.println(getLongestString(names));
        getShortestStgetring(names);
        System.out.println(getShortestString(names));
        getDupa(names);
        System.out.println(getDupa(names));
        System.out.println(procent(names));

    }

    public static String getLongestString(String[] names) {
        int index = 0;
        int nameLength = names[0].length();
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > nameLength) {
                index = i;
                nameLength = names[i].length();
            }
        }
        return names[index];
    }

    public static String getShortestString(String[] names) {
        int index = 0;
        int nameLength2 = names[0].length();
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() < nameLength2) {
                index = i;
                nameLength2 = names[i].length();
            }
        }
        return names[index];
    }
    public static int getDupa(String[] names) {
        int index = 0;
        for (int i =0; i<names.length; i++){
            if (names[i].endsWith("a")){
                index ++;
            }
        }
        return index;
    }

    public static double procent(String[] names) {
        double procent = Double.valueOf(getDupa(names))/ names.length *100;
        return procent;
    }
}
