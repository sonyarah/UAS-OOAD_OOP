import java.util.Scanner;
class Perwalian extends Registration{

    String save, apv;
    Boolean i;
    int bill, nim, jur, sem;

    void pembayaran(){
        Payment pay = new Payment();
        Scanner input = new Scanner (System.in);

        System.out.println ("\t ___________________________________________________");
        System.out.println ("\t \t\t\t   Welcome to");
        System.out.println ("\t Sistem Informasi Akademik (SIA) Example University");
        System.out.println ("\t \t\t    PAYMENT CONFIRMATION FORM");
        System.out.println ("\t ...................................................");
        System.out.print ("\t Please input the nominal: ");
        bill = input.nextInt();
        if(bill == 10000000){
            System.out.println("\t Your Payment is Accepted. Thanks");
            System.out.println("\t ...................................................");
            pwali();
        }else{
            System.out.println("\t Your Payment is Rejected. Pls try again.");
            System.out.print("\t Reload Payment Confirmation Form? (true/false): ");
            i = input.nextBoolean();

            if(i == true){
                pay.notifPerwalian();
            }
        }
    }
    
    void pwali(){
        Scanner input = new Scanner(System.in);
        System.out.println ("\t ___________________________________________________");
        System.out.println ("\t \t\t\t   Welcome to");
        System.out.println ("\t Sistem Informasi Akademik (SIA) Example University");
        System.out.println ("\t \t\t    PERWALIAN");
        System.out.println ("\t ...................................................");
        System.out.print   ("\t NIM \t\t\t : ");
        nim = input.nextInt();
        System.out.print   ("\t Jurusan \t\t : 1. TIF \n \t\t\t\t   2. DKV \n \t\t\t\t   3. TI\n");
        System.out.print   ("\t Choose Jurusan \t : ");
        jur = input.nextInt();
        System.out.print   ("\t Semester (1/2/3) \t : ");
        sem = input.nextInt();

        if (sem == 1 && jur == 1){
            matkultif1();
        }else if (sem == 2 && jur == 1){
            matkultif2();
        }else if (sem == 3 && jur == 1){
            matkultif3();
        }else if (sem == 1 && jur == 2){
            matkuldkv1();
        }else if (sem == 2 && jur == 2){
            matkuldkv2();
        }else if (sem == 3 && jur == 2){
            matkuldkv3();
        }else if (sem == 1 && jur == 3){
            matkulti1();
        }else if (sem == 2 && jur == 3){
            matkulti2();
        }else if (sem == 3 && jur == 3){
            matkulti3();
        }else{
            System.out.println ("");
            System.out.println ("\tReload Perwalian.");
            //cls;
            pwali();
        }

    }

    void matkultif1(){
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        System.out.print ("\t is the Lecturer Approved? (Y/N) : ");
            apv = input.nextLine();

            if(apv.equalsIgnoreCase("y") || apv.equalsIgnoreCase("Y")){
        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t\t\t\t Sistem Informasi Akademik (SIA) Example University ");
        System.out.println ("\t\t\t\t\t\t    KARTU RENCANA STUDI MAHASISWA");
        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t NIM  : 15111218 \t\t\t\t\t\t Jurusan  :" +jur);
        System.out.println ("\t Nama : Sonya R  \t\t\t\t\t\t Semester :" +sem);
        System.out.println ("\t ................................................................................................");
        System.out.println ("\t| MATAKULIAH\t\t\t|\t\t  DOSEN  \t  |\t\t   SKS \t\t    |");
        System.out.println ("\t|1. Belajarjavayuks\t\t|\tFrencius\t\t  |\t\t 3 SKS\t\t    |");
        System.out.println ("\t|2. Javalagiyuks\t\t|\tFrencius\t\t  |\t\t 3 SKS\t\t    |");
        System.out.println ("\t|3. Yuksjavalagi\t\t|\tFrencius\t\t  |\t\t 3 SKS\t\t    |");
        System.out.println ("\t|-----------------------------------------------------------------------------------------------|");
        System.out.println ("\t| Dibuat oleh : \t\t\t\t\t\t\t Disetujui oleh:\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|(Mahasiswa) \t\t\t\t\t\t\t\t\t (Dosen)\t    |");
        System.out.println ("\t|_______________________________________________________________________________________________|");
        System.out.println("");
        System.out.println("Back to Menu? (Y/N): ");
        System.out.print("");
            save = input.nextLine();

            if(save.equalsIgnoreCase("y") || save.equalsIgnoreCase("Y")){
                menu.menu();
                }
            }else{
                System.out.println ("\t\t Sorry you cannot do Perwalian.");
                menu.menu();
            }
        }

        void matkultif2(){
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        System.out.print ("\t is the Lecturer Approved? (Y/N) : ");
            apv = input.nextLine();

            if(apv.equalsIgnoreCase("y") || apv.equalsIgnoreCase("Y")){

        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t\t\t\t Sistem Informasi Akademik (SIA) Example University ");
        System.out.println ("\t\t\t\t\t\t    KARTU RENCANA STUDI MAHASISWA");
        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t NIM  : 15111218 \t\t\t\t\t\t Jurusan  :" +jur);
        System.out.println ("\t Nama : Sonya R  \t\t\t\t\t\t Semester :" +sem);
        System.out.println ("\t ................................................................................................");
        System.out.println ("\t| MATAKULIAH\t\t\t|\t\t  DOSEN  \t  |\t\t   SKS \t\t    |");
        System.out.println ("\t|1. javatimeyuhu\t\t|\tInidosen\t\t  |\t\t 2 SKS\t\t    |");
        System.out.println ("\t|2. timeforjavaa\t\t|\tInidosen\t\t  |\t\t 3 SKS\t\t    |");
        System.out.println ("\t|3. isjavatimeee\t\t|\tInidosen\t\t  |\t\t 2 SKS\t\t    |");
        System.out.println ("\t|-----------------------------------------------------------------------------------------------|");
        System.out.println ("\t| Dibuat oleh : \t\t\t\t\t\t\t Disetujui oleh:\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|(Mahasiswa) \t\t\t\t\t\t\t\t\t (Dosen)\t    |");
        System.out.println ("\t|_______________________________________________________________________________________________|");
        System.out.println ("");
        System.out.print   ("\tBack to Menu? (Y/N): ");
        System.out.print   ("");
            save = input.nextLine();

            if(save.equalsIgnoreCase("y") || save.equalsIgnoreCase("Y")){
                menu.menu();
                }   
        }else{
            System.out.println ("Sorry you cannot do Perwalian.");
            menu.menu();
        }
    }

        void matkultif3(){
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        System.out.print("\t is the Lecturer Approved? (Y/N) : ");
            apv = input.nextLine();

            if(apv.equalsIgnoreCase("y") || apv.equalsIgnoreCase("Y")){
        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t\t\t\t Sistem Informasi Akademik (SIA) Example University ");
        System.out.println ("\t\t\t\t\t\t    KARTU RENCANA STUDI MAHASISWA");
        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t NIM  : 15111218 \t\t\t\t\t\t Jurusan  :" +jur);
        System.out.println ("\t Nama : Sonya R  \t\t\t\t\t\t Semester :" +sem);
        System.out.println ("\t ................................................................................................");
        System.out.println ("\t| MATAKULIAH\t\t\t|\t\t  DOSEN  \t  |\t\t   SKS \t\t    |");
        System.out.println ("\t|1. ini matkul  \t\t|\tInidosen\t\t  |\t\t 2 SKS\t\t    |");
        System.out.println ("\t|2. asli matkull\t\t|\tItudosen\t\t  |\t\t 2 SKS\t\t    |");
        System.out.println ("\t|3. matkul baru \t\t|\tIyadosen\t\t  |\t\t 2 SKS\t\t    |");
        System.out.println ("\t|-----------------------------------------------------------------------------------------------|");
        System.out.println ("\t| Dibuat oleh : \t\t\t\t\t\t\t Disetujui oleh:\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|(Mahasiswa) \t\t\t\t\t\t\t\t\t (Dosen)\t    |");
        System.out.println ("\t|_______________________________________________________________________________________________|");
        System.out.println ("");
        System.out.print   ("\tBack to Menu? (Y/N): ");
        System.out.print   ("");
            save = input.nextLine();

            if(save.equalsIgnoreCase("y") || save.equalsIgnoreCase("Y")){
                menu.menu();
                }   
        }else{
            System.out.println ("Sorry you cannot do Perwalian.");
            menu.menu();
        }
    }

        void matkuldkv1(){
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        System.out.print ("\t is the Lecturer Approved? (Y/N) : ");
            apv = input.nextLine();

            if(apv.equalsIgnoreCase("y") || apv.equalsIgnoreCase("Y")){

        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t\t\t\t Sistem Informasi Akademik (SIA) Example University ");
        System.out.println ("\t\t\t\t\t\t    KARTU RENCANA STUDI MAHASISWA");
        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t NIM  : 15111218 \t\t\t\t\t\t Jurusan  :" +jur);
        System.out.println ("\t Nama : Sonya R  \t\t\t\t\t\t Semester :" +sem);
        System.out.println ("\t ................................................................................................");
        System.out.println ("\t| MATAKULIAH\t\t\t|\t\t  DOSEN  \t  |\t\t   SKS \t\t    |");
        System.out.println ("\t|1. Matkul DKV 1  \t\t|\tDosendkv\t\t  |\t\t 2 SKS\t\t    |");
        System.out.println ("\t|2. Matkul DKV 2 \t\t|\tDKVdosen\t\t  |\t\t 1 SKS\t\t    |");
        System.out.println ("\t|3. Matkul DKV 3 \t\t|\tDKV1doss\t\t  |\t\t 2 SKS\t\t    |");
        System.out.println ("\t|-----------------------------------------------------------------------------------------------|");
        System.out.println ("\t| Dibuat oleh : \t\t\t\t\t\t\t Disetujui oleh:\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t| (Mahasiswa) \t\t\t\t\t\t\t\t\t (Dosen)\t    |");
        System.out.println ("\t|_______________________________________________________________________________________________|");
        System.out.println ("");
        System.out.print   ("\tBack to Menu? (Y/N): ");
        System.out.print   ("");
            save = input.nextLine();

            if(save.equalsIgnoreCase("y") || save.equalsIgnoreCase("Y")){
                menu.menu();
                }   
        }else{
            System.out.println ("Sorry you cannot do Perwalian.");
            menu.menu();
        }
    }

        void matkuldkv2(){
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        System.out.print ("\t is the Lecturer Approved? (Y/N) : ");
            apv = input.nextLine();

            if(apv.equalsIgnoreCase("y") || apv.equalsIgnoreCase("Y")){

        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t\t\t\t Sistem Informasi Akademik (SIA) Example University ");
        System.out.println ("\t\t\t\t\t\t    KARTU RENCANA STUDI MAHASISWA");
        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t NIM  : 15111218 \t\t\t\t\t\t Jurusan  :" +jur);
        System.out.println ("\t Nama : Sonya R  \t\t\t\t\t\t Semester :" +sem);
        System.out.println ("\t ................................................................................................");
        System.out.println ("\t| MATAKULIAH\t\t\t|\t\t  DOSEN  \t  |\t\t   SKS \t\t    |");
        System.out.println ("\t|1. Matkul DKV 3  \t\t|\tDKVDOSN1\t\t  |\t\t 1 SKS\t\t    |");
        System.out.println ("\t|2. Matkul DKV 2 \t\t|\tDKVDOSN2\t\t  |\t\t 1 SKS\t\t    |");
        System.out.println ("\t|3. Matkul DKV 1 \t\t|\tDKVDOSN3\t\t  |\t\t 1 SKS\t\t    |");
        System.out.println ("\t|-----------------------------------------------------------------------------------------------|");
        System.out.println ("\t| Dibuat oleh : \t\t\t\t\t\t\t Disetujui oleh:\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t| (Mahasiswa) \t\t\t\t\t\t\t\t\t (Dosen)\t    |");
        System.out.println ("\t|_______________________________________________________________________________________________|");
        System.out.println ("");
        System.out.print   ("\tBack to Menu? (Y/N): ");
        System.out.print   ("");
            save = input.nextLine();

            if(save.equalsIgnoreCase("y") || save.equalsIgnoreCase("Y")){
                menu.menu();
                }   
        }else{
            System.out.println ("Sorry you cannot do Perwalian.");
            menu.menu();
        }
    }

        void matkuldkv3(){
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        System.out.print("\t is the Lecturer Approved? (Y/N) : ");
            apv = input.nextLine();

            if(apv.equalsIgnoreCase("y") || apv.equalsIgnoreCase("Y")){

        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t\t\t\t Sistem Informasi Akademik (SIA) Example University ");
        System.out.println ("\t\t\t\t\t\t    KARTU RENCANA STUDI MAHASISWA");
        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t NIM  : 15111218 \t\t\t\t\t\t Jurusan  :" +jur);
        System.out.println ("\t Nama : Sonya R  \t\t\t\t\t\t Semester :" +sem);
        System.out.println ("\t ................................................................................................");
        System.out.println ("\t| MATAKULIAH\t\t\t|\t\t  DOSEN  \t  |\t\t   SKS \t\t    |");
        System.out.println ("\t|1. Matkul DKV   \t\t|\tDKVDOSN3\t\t  |\t\t 3 SKS\t\t    |");
        System.out.println ("\t|2. Matkul DKV  \t\t|\tDKVDOSN2\t\t  |\t\t 3 SKS\t\t    |");
        System.out.println ("\t|3. Matkul DKV  \t\t|\tDKVDOSN1\t\t  |\t\t 3 SKS\t\t    |");
        System.out.println ("\t|-----------------------------------------------------------------------------------------------|");
        System.out.println ("\t| Dibuat oleh : \t\t\t\t\t\t\t Disetujui oleh:\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t| (Mahasiswa) \t\t\t\t\t\t\t\t\t (Dosen)\t    |");
        System.out.println ("\t|_______________________________________________________________________________________________|");
        System.out.println ("");
        System.out.print   ("\tBack to Menu? (Y/N): ");
        System.out.print   ("");
            save = input.nextLine();

            if(save.equalsIgnoreCase("y") || save.equalsIgnoreCase("Y")){
                menu.menu();
                }   
        }else{
            System.out.println ("Sorry you cannot do Perwalian.");
            menu.menu();
        }
    }

        void matkulti1(){
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        System.out.print("\t is the Lecturer Approved? (Y/N) : ");
            apv = input.nextLine();

            if(apv.equalsIgnoreCase("y") || apv.equalsIgnoreCase("Y")){

        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t\t\t\t Sistem Informasi Akademik (SIA) Example University ");
        System.out.println ("\t\t\t\t\t\t    KARTU RENCANA STUDI MAHASISWA");
        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t NIM  : 15111218 \t\t\t\t\t\t Jurusan  :" +jur);
        System.out.println ("\t Nama : Sonya R  \t\t\t\t\t\t Semester :" +sem);
        System.out.println ("\t ................................................................................................");
        System.out.println ("\t| MATAKULIAH\t\t\t|\t\t  DOSEN  \t  |\t\t   SKS \t\t    |");
        System.out.println ("\t|1. TI yeah      \t\t|\tTIDOSEN1\t\t  |\t\t 3 SKS\t\t    |");
        System.out.println ("\t|2. Finally java  \t\t|\tTIDOSEN2\t\t  |\t\t 3 SKS\t\t    |");
        System.out.println ("\t|3. Kunjungan pab \t\t|\tTIDOSEN3\t\t  |\t\t 3 SKS\t\t    |");
        System.out.println ("\t|-----------------------------------------------------------------------------------------------|");
        System.out.println ("\t| Dibuat oleh : \t\t\t\t\t\t\t Disetujui oleh:\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t| (Mahasiswa) \t\t\t\t\t\t\t\t\t (Dosen)\t    |");
        System.out.println ("\t|_______________________________________________________________________________________________|");
        System.out.println ("");
        System.out.print   ("\tBack to Menu? (Y/N): ");
        System.out.print   ("");
            save = input.nextLine();

            if(save.equalsIgnoreCase("y") || save.equalsIgnoreCase("Y")){
                menu.menu();
                }   
        }else{
            System.out.println ("Sorry you cannot do Perwalian.");
            menu.menu();
        }
    }

    void matkulti2(){
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        System.out.print ("\t is the Lecturer Approved? (Y/N) : ");
            apv = input.nextLine();

            if(apv.equalsIgnoreCase("y") || apv.equalsIgnoreCase("Y")){

        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t\t\t\t Sistem Informasi Akademik (SIA) Example University ");
        System.out.println ("\t\t\t\t\t\t    KARTU RENCANA STUDI MAHASISWA");
        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t NIM  : 15111218 \t\t\t\t\t\t Jurusan  :" +jur);
        System.out.println ("\t Nama : Sonya R  \t\t\t\t\t\t Semester :" +sem);
        System.out.println ("\t ................................................................................................");
        System.out.println ("\t| MATAKULIAH\t\t\t|\t\t  DOSEN  \t  |\t\t   SKS \t\t    |");
        System.out.println ("\t|1. T Industri\t\t|\tTIDOSEN1\t\t  |\t\t 1 SKS\t\t    |");
        System.out.println ("\t|2. T Industri  \t\t|\tTIDOSEN2\t\t  |\t\t 1 SKS\t\t    |");
        System.out.println ("\t|3. T Industri \t\t|\tTIDOSEN3\t\t  |\t\t 1 SKS\t\t    |");
        System.out.println ("\t|-----------------------------------------------------------------------------------------------|");
        System.out.println ("\t| Dibuat oleh : \t\t\t\t\t\t\t Disetujui oleh:\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t| (Mahasiswa) \t\t\t\t\t\t\t\t\t (Dosen)\t    |");
        System.out.println ("\t|_______________________________________________________________________________________________|");
        System.out.println ("");
        System.out.print   ("\tBack to Menu? (Y/N): ");
        System.out.print   ("");
            save = input.nextLine();

            if(save.equalsIgnoreCase("y") || save.equalsIgnoreCase("Y")){
                menu.menu();
                }   
        }else{
            System.out.println ("Sorry you cannot do Perwalian.");
            menu.menu();
        }
    }

     void matkulti3(){
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        System.out.print("\t is the Lecturer Approved? (Y/N) : ");
            apv = input.nextLine();

            if(apv.equalsIgnoreCase("y") || apv.equalsIgnoreCase("Y")){

        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t\t\t\t Sistem Informasi Akademik (SIA) Example University ");
        System.out.println ("\t\t\t\t\t\t    KARTU RENCANA STUDI MAHASISWA");
        System.out.println ("\t ________________________________________________________________________________________________");
        System.out.println ("\t NIM  : 15111218 \t\t\t\t\t\t Jurusan  :" +jur);
        System.out.println ("\t Nama : Sonya R  \t\t\t\t\t\t Semester :" +sem);
        System.out.println ("\t ................................................................................................");
        System.out.println ("\t| MATAKULIAH\t\t\t|\t\t  DOSEN  \t  |\t\t   SKS \t\t    |");
        System.out.println ("\t|1. T Industri1 \t\t|\tTIDOSEN1\t\t  |\t\t 2 SKS\t\t    |");
        System.out.println ("\t|2. T Industri2  \t\t|\tTIDOSEN2\t\t  |\t\t 2 SKS\t\t    |");
        System.out.println ("\t|3. T Industri3 \t\t|\tTIDOSEN3\t\t  |\t\t 2 SKS\t\t    |");
        System.out.println ("\t|-----------------------------------------------------------------------------------------------|");
        System.out.println ("\t| Dibuat oleh : \t\t\t\t\t\t\t Disetujui oleh:\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t|\t\t\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println ("\t| (Mahasiswa) \t\t\t\t\t\t\t\t\t (Dosen)\t    |");
        System.out.println ("\t|_______________________________________________________________________________________________|");
        System.out.println ("");
        System.out.print   ("\tBack to Menu? (Y/N): ");
        System.out.print   ("");
            save = input.nextLine();

            if(save.equalsIgnoreCase("y") || save.equalsIgnoreCase("Y")){
                menu.menu();
                }   
        }else{
            System.out.println ("Sorry you cannot do Perwalian.");
            menu.menu();
        }
    }
}
