package Tinh_Tien_Dien;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Scanner;

public class Test {
  static String nameHeadHouse;
  static int numberHome;
  static int oldIndex;
  static int newIndex;

    public Test() {
    }

    public Test(String nameHeadHouse, int numberHome, int oldIndex, int newIndex) {
        this.nameHeadHouse = nameHeadHouse;
        this.numberHome = numberHome;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public static void inputInfoCustomer() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten chu ho: ");
        String name = sc.nextLine();
        Test.nameHeadHouse = name;

        System.out.println("Nhap so nha: ");
        int idHome = sc.nextInt();
        Test.numberHome = idHome;

        System.out.println("Nhap so cong to dien cu: ");
        int oldIndex = sc.nextInt();
        Test.oldIndex = oldIndex;

        System.out.println("Nhap so cong to dien moi: ");
        int newIndex = sc.nextInt();
        Test.newIndex = newIndex;

        sc.close();
    }



    public static void calculatorElectricCustomer() {
        int totalMoney = (newIndex - oldIndex) * 750;
        System.out.println("So tien dien cua nha: " + numberHome + " la: " + totalMoney);;
    }

    public static void main(String[] args) {
        Test.inputInfoCustomer();
        Test.calculatorElectricCustomer();
    }
}
