package StateDesignPattern;

 public class OutOfOrderState implements VendingMachineState{
 
    @Override
        public void selectItem(VendingMachine vendingMachine) {
            System.out.println("Vending Machine is Out of Order");
        }

        @Override
        public void insertCoin(VendingMachine vendingMachine, double amount) {
            System.out.println("Vending Machine is Out of Order");
        }

        @Override
        public void dispenseItem(VendingMachine vendingMachine) {
            System.out.println("Vending Machine is Out of Order");
        }

        @Override
        public void setOutOfOrder(VendingMachine vendingMachine) {
            System.out.println("Vending Machine is Out of Order");
        }
 }