public class ForLoop {
        /**
         * for.. statement digunakan untuk melakukan perulangan pada suatu proses
         * dengan min value dan max value yang sudah ditentukan
         * syntax : for(int <value> ; <value conditon> ; <value incremental>)
         * contoh : for(int angka=0;angka < 10 ; anga++)
         * contoh  diatas digunakan untuk mencetak angka dari 0 s/d 9
         */
        public static void main(String[] args) {
            // misalnya mencetak angka 1 sampai 5 secara manual
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
            System.out.println(5);
            //dengan menggunakan statement FOR maka syntaxnya
            for (int angka=1;angka<6;angka++){
                System.out.println(angka);
            }
        }
    }


