public class ForEach {
    
    public static void main(String[] args) {
        

        String[] names = {
            "Agus", "Firman", "Izza", "Hilyah", "Nafisah"
        };

        // Perulangan without foreach
        for(var i = 0; i < names.length; i++ ){
            System.out.println(names[i]);
        }

        System.out.println("For Each");

        // Perulangan with foreach
        for (String value : names) {
            System.out.println(value);
        }

    }

}
