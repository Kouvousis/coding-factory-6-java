package gr.aueb.cf.ch15.bankapp;

import java.util.Arrays;

public class JointOverdraftAccount extends OverdraftAccount {
    private User[] otherHolders;

    public JointOverdraftAccount() {

    }

    public JointOverdraftAccount(String iban, User holder, double balance, User[] otherHolders) {
        super(iban, holder, balance);
        this.otherHolders = new User[otherHolders.length];
        for (int i = 0; i < otherHolders.length; i++) {
            this.otherHolders[i] = new User(otherHolders[i]);
        }
    }

    public User[] getOtherHolders() {
        User[] otherHolders = new User[this.otherHolders.length];
        for (int i = 0; i < otherHolders.length; i++) {
            otherHolders[i] = new User(this.otherHolders[i]);
        }
        return otherHolders;
    }

    public void setOtherHolders(User[] otherHolders) {
        this.otherHolders = new User[otherHolders.length];
        for (int i = 0; i < otherHolders.length; i++) {
            this.otherHolders[i] = new User(otherHolders[i]);
        }
    }

    @Override
    protected boolean isSsnValid(String ssn) {
        boolean areOthersValid = false;

        for (User user : otherHolders) {
            if (user.getSsn().equals(ssn)) {
                areOthersValid = true;
                break;
            }
        }

        return super.isSsnValid(ssn) || areOthersValid;
    }

    @Override
    public String toString() {
        return "JointOverdraftAccount{" +
                ", uuid=" + getUuid() +
                ", holder=" + getHolder() +
                ", otherHolders=" + Arrays.toString(otherHolders) +
                ", balance=" + getBalance() +
                '}';
    }
}
