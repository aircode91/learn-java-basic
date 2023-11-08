public class TypeDataArray {
    public static void main(String[] args) {
        String[] stringArray; //metode 1
        // String[] stringArray2 = new String[3]; //metode 2

        /** Metode 1 */
        stringArray = new String[3];
        stringArray[0] = "Agus";
        stringArray[1] = "Firman";
        
        /* Metode 2 */
        String[] names = {
            "Agus", "Firman"
        };
        

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

        // Replace value of array
        stringArray[1]  = "Budi";
        System.out.println(stringArray[1]);
        System.out.println(names[1]);

        // Array Integer
        int[] arrayInt = new int[]{
            1,2,3,4,5,6,7,8,9
        };
        System.out.println(arrayInt);

        long[] arrayLong = {
            10L, 20L, 30L
        };
        System.out.println(arrayLong);


        // Count length of array
        System.out.println(arrayInt.length);


        // Array multidimensi
        String[][] members = {
            {"Agus", "Firman"},
            {"Risna", "Novianti"},
            {"Izza", "Hilyah", "Nafisah"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[2][1]);
    }
}
