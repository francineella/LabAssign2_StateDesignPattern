package StateDesignPattern;

    public class ItemSelectedState implements VendingMachineState {
        @Override
        public void selectItem(VendingMachine vendingMachine) {
            System.out.println("Item already selected. Please insert coins to continue.\n");
        }

        @Override
        public void insertCoin(VendingMachine vendingMachine, double amount) {
            vendingMachine.addBalance(amount);
            System.out.println("Coin Inserted \n Balance: " + vendingMachine.getBalance());
            vendingMachine.setState(new DispensingState());
            vendingMachine.dispenseItem();
        }

        @Override
        public void dispenseItem(VendingMachine vendingMachine) {
            System.out.println("Please insert coins first\n");
        }

        @Override
        public void setOutOfOrder(VendingMachine vendingMachine) {
            vendingMachine.setState(new OutOfOrderState());
            System.out.println("Vending Machine is Out of Order");
        }
    }