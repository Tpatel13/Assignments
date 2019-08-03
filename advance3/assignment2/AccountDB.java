package advance3.assignment2;

import java.io.*;
import java.util.ArrayList;

public class AccountDB implements java.io.Serializable {
    String file = "/Users/tirthpatel/Desktop/account.dat";

    public int saveAccount(Account account) {
        int status = 0;
        try {
            String data = account.getAccountNo() + ":" + account.getBalance() + "\n";
            FileOutputStream fileOut =
                    new FileOutputStream("/Users/tirthpatel/Desktop/accounts.ser", true);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(data);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch (Exception e) {
            System.out.println("exception");
            status = 1;
        }

        return status;
    }


    public Account getAccount(int accountId) {
        Account account = null;
        boolean count = true;

        try {

            Customer customer=null;

            FileInputStream fileReader=new FileInputStream("/Users/tirthpatel/Desktop/accounts.ser");
            ObjectInputStream objectReader=null;

            objectReader=new ObjectInputStream(fileReader);
            String data[]=null;
            String input=objectReader.readObject().toString();
            while(input!=null)
            {
                data=input.split(":");
                if(Integer.parseInt(data[0])==accountId)
                {
                    account = new Account();

                    account.setAccountNo(Integer.parseInt(data[0]));
                    account.setBalance(Double.parseDouble(data[1]));
                    break;
                }

                //input=objectReader.readLine();

//       ObjectInputStream oos = new ObjectInputStream(new FileInputStream("/Users/tirthpatel/Desktop/accounts.ser"));
//
//            String data[]=null
//            //Checking
//            System.out.println(oos.readObject());
//            System.out.println(oos.readObject());


        }
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return null;
        }
        return null;
//
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        try {
//            fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            String[] data = null;
//            String input = bufferedReader.readLine();
//            while (input != null) {
//                data = input.split(":");
//                if (Integer.parseInt(data[0]) == accountId) {
//                    account = new Account();
//                    account.setAccountNo(Integer.parseInt(data[0]));
//                    account.setBalance(Double.parseDouble(data[1]));
//                    break;
//                }
//
//                input = bufferedReader.readLine();
//            }
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        } finally {
//            if (null != bufferedReader) {
//                try {
//                    bufferedReader.close();
//                } catch (IOException ioException) {
//                    ioException.printStackTrace();
//                }
//            }
//
//            if (null != fileReader) {
//                try {
//                    fileReader.close();
//                } catch (IOException ioException) {
//                    ioException.printStackTrace();
//                }
//            }
//        }
//        return account;
    }
}
