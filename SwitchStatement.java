public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "E";

        // switch (nilai) {
        //     case "A":
        //         System.out.println("Selamat, anda lulu dengan baik");
        //         break;
        //     case "B":
        //         System.out.println("Selamat, anda lulus dengan cukup baik");
        //         break;
        //     case "C":
        //     case "D":
        //         System.out.println("Maaf, anda belum lulus");
        //         break;

        //     default:
        //         System.out.println("Sepertinya anda salah jurusan");
        //         break;
        // }

        // Switch Lambda
        // switch (nilai) {
        //     case "A" -> System.out.println("Selamat, anda lulu dengan baik");
        //     case "B" -> System.out.println("Selamat, anda lulus dengan cukup baik");
        //     case "C", "D" -> System.out.println("Maaf, anda belum lulus");
        //     default -> {
        //         System.out.println("Sepertinya anda salah jurusan");
        //     }
        // }

        // Switch Lambda without yield
        // String pesan;
        // switch (nilai) {
        //     case "A" -> pesan = "Selamat, anda lulu dengan baik";
        //     case "B" -> pesan = "Selamat, anda lulus dengan cukup baik";
        //     case "C", "D" -> pesan = "Maaf, anda belum lulus";
        //     default -> {
        //         pesan = "Sepertinya anda salah jurusan";
        //     }
        // }

        // System.out.println(pesan); 
        
        // Switch Lambda with yield
        String pesan = switch (nilai) {
            case "A": yield "Selamat, anda lulu dengan baik";
            case "B": yield "Selamat, anda lulus dengan cukup baik";
            case "C", "D": yield "Maaf, anda belum lulus";
            default : yield "Sepertinya anda salah jurusan";
        };

        System.out.println(pesan);
    }
}
