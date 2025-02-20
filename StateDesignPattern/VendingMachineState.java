package StateDesignPattern;

     interface VendingMachineState {
     void selectItem(VendingMachine vendingMachine);
     void insertCoin(VendingMachine vendingMachine, double amount);
     void dispenseItem(VendingMachine vendingMachine);
     void setOutOfOrder(VendingMachine vendingMachine);
 }