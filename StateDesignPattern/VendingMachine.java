package StateDesignPattern;

    public class VendingMachine {
        private double balance;
        private VendingMachineState state;

        public VendingMachine() {
            this.balance = 0;
            this.state = new IdleState();
        }

        public void selectItem() {
            state.selectItem(this);
        }

        public void insertCoin(double amount) {
            state.insertCoin(this,balance);
        }
        public void dispenseItem() {
            state.dispenseItem(this);
        }
        public void setOutOfOrder() {
            state.setOutOfOrder(this);
        }

        public void setState(VendingMachineState state) {
            this.state = state;
        }

        public VendingMachineState getState() {
            return state;
        }

        public void addBalance(double amount) {
            this.balance += amount;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    
        public double getBalance() {
            return balance;
        }


    }