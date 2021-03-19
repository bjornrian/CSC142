package labs.delinqCustomers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    private static DCustomer[] delinqList;

    public static void main(String[] args) throws FileNotFoundException {
        delinqList = new DCustomer[5];
        delinqList[0] = new DCustomer("1205", "Bernt", -1.1);
        delinqList[1] = new DCustomer("2834", "Cody", 2.5);
        delinqList[2] = new DCustomer("9125", "Derek", 0.0);
        delinqList[3] = new DCustomer("9873", "Johny", 3.4);
        delinqList[4] = new DCustomer("1287", "Allison", 7.6);

        writeCustsToFile(new File("CustFile.txt"));
        removePaidCusts();
    }

    public static void writeCustsToFile(File fileToWrite) throws FileNotFoundException {
        PrintStream output = new PrintStream(fileToWrite);
        output.println(delinqList.length);
        for (DCustomer oneCust : delinqList) {
            output.println(oneCust.getId());
            output.println(oneCust.getName());
            output.println(oneCust.getBalance());
        }
        output.close();
    }

    public static void removePaidCusts() {
        int numberOfPaidCustomers = 0;
        for (int index = 0; index < delinqList.length; index++) {
            if (delinqList[index].getBalance() <= 0.0) {
                delinqList[index] = delinqList[numberOfPaidCustomers];
                delinqList[numberOfPaidCustomers] = null;
                numberOfPaidCustomers++;
            }
        }
        System.out.println("numberOfDeliquentCustomers = " + numberOfPaidCustomers);
    }
}
