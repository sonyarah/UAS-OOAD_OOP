import java.util.Scanner;
//import javax.swing;

class Menu {
	int chs;
	Registration regis = new Registration();
	Payment pay = new Payment();

/*public void menu(){
	String menus = JOptionPane.showInputDialog
	("_______________________________________________\n
		Welcome to\nSistem Informasi Akademik (SIA) Kampus Unversity\n
		\t\tMENU\t\t\n1.PMB (Penerimaan Mahasiswa Baru)\n2. Perwalian\n3.Exit\n
		_____________________________________________\n
		Chose")
}	*/
	 void menu(){
		Scanner input = new Scanner (System.in);

		System.out.println ("\t ___________________________________________________");
	 	System.out.println ("\t \t\t   Welcome to");
		System.out.println ("\t Sistem Informasi Akademik (SIA) Example University");
		System.out.println ("\t \t\t\t    MENU");
		System.out.println ("\t ...................................................");
		System.out.println ("\t 1. PMB (Penerimaan Mahasiswa Baru)");
		System.out.println ("\t 2. Perwalian");
		System.out.println ("\t 3. Exit");
		System.out.println ("\t ___________________________________________________");
		System.out.print ("\t Choose the Menu (1-3): ");

		chs = input.nextInt();

		switch (chs){
			case 1:
				regis.registrasi();
				break;
			case 2:
				pay.notifPerwalian();
				break;
			case 3:
				break;
			default:
				System.out.println("Choose the Menu 1-3");
				menu();

		}
	}
}