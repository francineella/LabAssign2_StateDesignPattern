package StateDesignPattern;

public class VendingMachineTest {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        
        vendingMachine.insertCoin(.50);
        vendingMachine.selectItem();
        vendingMachine.insertCoin(1.0);
        vendingMachine.dispenseItem();
        vendingMachine.selectItem();
        vendingMachine.setOutOfOrder();
        vendingMachine.insertCoin(0.5);
    }
    
}