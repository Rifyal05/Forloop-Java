public class genapganjil_forloop {
    public static void main(String[] args) {
        String status;
        for (int angka = 10; angka < 90; angka++) {
            if (angka % 2 == 0) {
                status = "angka genap";

            } else {
                status = "angka ganjil";
            }
              System.out.println(angka  + " adalah " + status);
        }
    }
}


