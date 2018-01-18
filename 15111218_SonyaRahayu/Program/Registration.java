import java.util.Scanner;

class Registration{
    String nama, email, alamat,coba;
    String save, exit;
    int thn_lahir, umur, no_hp, bill;
    String ans1, ans2, ans3;
    Boolean i;
    static int nilai, score1, score2, score3;


    void registrasi(){
        Menu menu = new Menu();
        Scanner input = new Scanner (System.in);

       System.out.println ("\t ___________________________________________________");
        System.out.println ("\t \t\t\t   Welcome to");
        System.out.println ("\t Sistem Informasi Akademik (SIA) Example University");
        System.out.println ("\t \t\t    REGISTRATION FORM");
        System.out.println ("\t ...................................................");
        System.out.print ("\t Name           : ");
        nama = input.nextLine();
        System.out.print("\t Email          : ");
        email = input.nextLine();
        System.out.print("\t Tahun Lahir    : ");
        thn_lahir = input.nextInt();
        System.out.print("\t No. HP         : ");
        no_hp = input.nextInt();
        System.out.print("");
        coba = input.nextLine();
        System.out.print("\t Address        : ");
        System.out.print("");
        alamat = input.nextLine();
        System.out.println("");

        System.out.print("\t Do you want save this page? (Y/N)    : ");
        save = input.nextLine();

        if(save.equalsIgnoreCase("y") || save.equalsIgnoreCase("Y")){
            System.out.println("\t Data Successfully Saved!");
            umur = 2018 - thn_lahir;

            if(umur < 19){
                System.out.println("\t Sorry your age under 19th. Thanks for try to Registration.");
                System.out.print("\t Exit ? (Y/N) ");
                exit = input.nextLine();

                if(exit.equalsIgnoreCase("n") || exit.equalsIgnoreCase("N")){
                    menu.menu();
                }
            }else{
                testing();
            }
        }else{
            System.out.println ("\t Save data is FAILED!");
            System.out.println ("\t................................");
            System.out.print ("\t Do you want terminate this program? Your data will lose. (Y/T) ");
                exit = input.nextLine();

            if(exit.equalsIgnoreCase("n") || exit.equalsIgnoreCase("N")){
                   menu.menu();
                }
        }

    }

    /*public final static void clearConsole(){
        try {final String os = System.getProperty("os.name");
        if (os.contains ("Windows")){
            Runtime.getRuntime().exec("cls");
        }else{
            Runtime.getRuntime().exec("clear");
        }}catch (final Exception e);
    }
    }*/

    void payment(){
        Menu menu = new Menu ();
        Payment pay = new Payment();
        Scanner input = new Scanner (System.in);

        System.out.println ("\t ___________________________________________________");
        System.out.println ("\t \t\t\t    Welcome to");
        System.out.println ("\t Sistem Informasi Akademik (SIA) Example University");
        System.out.println ("\t \t\t PAYMENT CONFIRMATION FORM");
        System.out.println ("\t ....................................................");
        System.out.print("\t Please input the nominal     : ");
            bill = input.nextInt();

        if(bill == 999999){
            System.out.println("\t Your Payment is Accepted. Thanks");
            System.out.println("\t ________________________________");
            System.out.println("\t \t NIM : 15111218");
            System.out.println("\t Welcome to Example University"); 
            System.out.print("");
            coba = input.nextLine();
            System.out.print("\t Back To Menu ? (Y/N) : ");
            System.out.print("");
            save = input.nextLine();

            if(save.equalsIgnoreCase("y") || save.equalsIgnoreCase("Y")){
                menu.menu();
                }        
        }else{

            System.out.println("\t Your Payment is Rejected. Please try again.");
            System.out.print("\t Reload Payment Confirmation Form? (true/false): ");
            i = input.nextBoolean();

            if(i == true){
                pay.notifRegis();
           }

        
                //if(save.equalsIgnoreCase("y") || save.equalsIgnoreCase("Y")){
                  //  pay.notifRegis();
                //}
        }

    }

    void testing(){

        Payment pay = new Payment(); 
        Scanner input = new Scanner (System.in);
        //cls;
        System.out.println ("");
        System.out.println ("\t ___________________________________________________");
        System.out.println ("\t \t\t\t   Welcome to");
        System.out.println ("\t Sistem Informasi Akademik (SIA) Example University");
        System.out.println ("\t \t\t    TEST FORM");
        System.out.println ("\t ...................................................");
        System.out.println ("\t\t\t\t Goodluck!");
        System.out.println ("\t 1. Apa kepanjangan STTB? ");
        System.out.println ("\t a. Shark Turutut Turutut Baby   b. Sekolah Tinggi Teknologi Bandung");
        System.out.print("\t Answer : ");
            ans1 = input.nextLine();
        System.out.println ("\t 2. Ada berapa satpam di STTB? ");
        System.out.println ("\t a. 4 orang              b. Tidak ada");
        System.out.print("\t Answer : ");
            ans2 = input.nextLine();
        System.out.println ("\t 3. Berapa jumlah motor yang terparkir di STTB setiap hari minggu? ");
        System.out.println ("\t a. 100 motor            b. Tak terhingga");
        System.out.print("\t Answer : ");
            ans3 = input.nextLine();

        int score = 0;
        if(ans1.equalsIgnoreCase("b") || ans1.equalsIgnoreCase("B")){
            score1 = 30;
        }
        if(ans2.equalsIgnoreCase("a") || ans2.equalsIgnoreCase("A")){
            score2 = 40;
        }
        if(ans3.equalsIgnoreCase("b") || ans3.equalsIgnoreCase("B")){
            score3 = 30;
        }

        nilai = score + score1 +score2 +score3 ;
        

        if(nilai == 100 || nilai == 70){
            System.out.println("");
            System.out.println("\t Congratulation..Congratulation Your Passed");
            System.out.println("\t with Score: " +nilai);
            pay.notifRegis();
        }else{
            System.out.println("\t So Sorry, Youve FAILED.\n\t Just come back in next years. \n\t Keep FIGHTING!");
        }
    }


}