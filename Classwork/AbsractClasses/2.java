class Scratch {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println(bankA.getBalance() + bankB.getBalance()+ bankC.getBalance());
    }
}

abstract class Bank {
    abstract String getBalance();
}


class BankA extends Bank{

    @Override
    String getBalance() {
        return ("Balance in bank A is 100\n");
    }
}

class BankB extends Bank{

    @Override
    String getBalance() {
        return ("Balance in bank B is 150\n");
    }
}
class BankC extends Bank{

    @Override
    String getBalance() {
        return ("Balance in bank C is 200\n");
    }
}