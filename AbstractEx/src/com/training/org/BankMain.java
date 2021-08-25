package com.training.org;

abstract class Bank {
    abstract public int getBankInterest();

    public void bankMessage(String bankName) {
        System.out.println("bankMessage is called" + bankName);
    }
}

class SBI extends Bank {
    @Override
    public int getBankInterest() {
        return 6;
    }
}

class AXIS extends Bank {
    @Override
    public int getBankInterest() {
        return 8;
    }
}

class ICICI extends Bank {

    @Override
    public int getBankInterest() {
        return 7;
    }
}

public class BankMain {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        b1.bankMessage("SBI");
        System.out.println("Bank Interst " + b1.getBankInterest());

        b1 = new ICICI();
        b1.bankMessage("ICICI");
        System.out.println("Bank Interst " + b1.getBankInterest());

        b1 = new AXIS();
        b1.bankMessage("AXIS");
        System.out.println("Bank Interst " + b1.getBankInterest());


    }
}
