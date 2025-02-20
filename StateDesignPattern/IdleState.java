package StateDesignPattern;

    public class IdleState implements VendingMachineState {

        @Override
        public void selectItem(VendingMachine vendingMachine) {
            vendingMachine.setState(new ItemSelectedState());
            System.out.println("Item selected. Please Insert Coins.");
        }

        @Override
        public void insertCoin(VendingMachine vendingMachine, double amount) {
            System.out.println("Please select an item first\n");
        }

        @Override
        public void dispenseItem(VendingMachine vendingMachine) {
            System.out.println("Cannot dispense item. No item selected\n");
        }

        @Override
        public void setOutOfOrder(VendingMachine vendingMachine) {
            vendingMachine.setState(new OutOfOrderState());
            System.out.println("Vending Machine is Out of Order");
        }
        
    }