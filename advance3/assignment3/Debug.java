package advance3.assignment3;

import java.io.*;

public class Debug {

    public static void main(String[] args) {
        Customer customer = new Customer(1001, "Tan");
        SavingAccount sb1 = new SavingAccount(9001, customer, 2000, 5, 1000);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data.ser");
            ObjectOutputStream objStream = new ObjectOutputStream(fileOutputStream);
            objStream.writeObject(sb1);

            objStream.close();

            FileInputStream fin = new FileInputStream("data.ser");
            ObjectInputStream bufferdStream = new ObjectInputStream(fin);

            SavingAccount deserializedSb = (SavingAccount) bufferdStream.readObject();



        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
