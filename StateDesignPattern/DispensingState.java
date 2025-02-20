package StateDesignPattern;

 public class DispensingState implements VendingMachineState {
 
    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Cannot select an item while dispensing");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, double amount) {
        System.out.println("Cannot insert coins while dispensing");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        vendingMachine.setState(new IdleState());
        System.out.println("Item dispensed. Vending Machine is now Idle.\n");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        vendingMachine.setState(new OutOfOrderState());
        System.out.println("Vending Machine is Out of Order");
    }
 }