package Day21;

import java.util.Scanner;

class Patient {
    private int patientID;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String mobileNumber;

    public void setPatientDetails(int patientID, String name, int age, String gender, String address, String mobileNumber) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }

    public void displayPatientDetails() {
        System.out.println("PID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}

class InPatient extends Patient {
    private String roomNumber;
    private double consultationFee;
    private double testFee;
    private String doa;
    private String dischargeDate;
    private int numberOfDays;
    private double roomRent;

    public void setInPatientDetails(String roomNumber, double consultationFee, double testFee, String doa, String dischargeDate, int numberOfDays, double roomRent) {
        this.roomNumber = roomNumber;
        this.consultationFee = consultationFee;
        this.testFee = testFee;
        this.doa = doa;
        this.dischargeDate = dischargeDate;
        this.numberOfDays = numberOfDays;
        this.roomRent = roomRent;
    }

    public void displayInPatientDetails() {
        displayPatientDetails();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Test Fee: " + testFee);
        System.out.println("DOA: " + doa);
        System.out.println("Discharge Date: " + dischargeDate);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Room Rent: " + roomRent);
    }

    public double calculateTotalBill() {
        return consultationFee + testFee + (numberOfDays * roomRent);
    }
}

class Bill extends InPatient {
    private String billDate;

    public void setBillDetails(String billDate) {
        this.billDate = billDate;
    }

    public void displayBillDetails() {
        displayInPatientDetails();
        System.out.println("Date of bill: " + billDate);
        System.out.println("Total amount: " + calculateTotalBill());
    }
}

public class Pgm7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();

        int patientID = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int age = sc.nextInt();
        String gender = sc.nextLine();
        String address = sc.nextLine();
        String mobileNumber = sc.nextLine();
        bill.setPatientDetails(patientID, name, age, gender, address, mobileNumber);

        String roomNumber = sc.nextLine();
        double consultationFee = sc.nextDouble();
        double testFee = sc.nextDouble();
        String doa = sc.nextLine();
        String dischargeDate = sc.nextLine();
        int numberOfDays = sc.nextInt();
        double roomRent = sc.nextDouble();
        bill.setInPatientDetails(roomNumber, consultationFee, testFee, doa, dischargeDate, numberOfDays, roomRent);

        String billDate = sc.nextLine();
        bill.setBillDetails(billDate);
        bill.displayBillDetails();
    }
}

