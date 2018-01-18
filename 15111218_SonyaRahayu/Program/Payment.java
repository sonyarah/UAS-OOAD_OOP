class Payment{

    Registration regis = new Registration();
    Perwalian wali = new Perwalian();

    void notifRegis(){
        System.out.println ("");
        System.out.println ("\t Please, payment before for registration IDR 999.999");
        System.out.println ("");
        regis.payment();
    }
    void notifPerwalian(){
        System.out.println("");
        System.out.println ("\t Please, payment before perwalian IDR 10.000.000");
        System.out.println ("");
        wali.pembayaran();
    }



}