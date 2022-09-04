import java.lang.reflect.Array;
import java.util.Arrays;

public class Bank {
    private Person[] clients;
    private int numberOfClients = 0;

    public Bank(Person[] clients) {
        this.clients = clients;
    }

    public Person[] getClients() {
        return clients;
    }

    public void setClients(Person[] clients) {
        this.clients = clients;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    public boolean isPersonAvailable(String name) {
        if (numberOfClients == 0) {
            return false;
        }

        for (int i = 0; i < numberOfClients; i++) {
            if (clients[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean addPerson(Person person) {
        if ((person.getName() == null) || isPersonAvailable(person.getName())) {
            return false;
        } else {
            Array.set(clients, numberOfClients, person);
            numberOfClients++;
            return true;
        }
    }

    public Person searchPersonByName(String name) {
        if (numberOfClients == 0) {
            return null;
        }

        for (int i = 0; i < numberOfClients; i++) {
            if (clients[i].getName().equals(name)) {
                return clients[i];
            }
        }
        return null;
    }

    public Person searchPersonByAccountNumber(String accountNumber) {
        if (numberOfClients == 0) {
            return null;
        }

        for (int i = 0; i < numberOfClients; i++) {
            BankAccount[] accountList = clients[i].getAccountList();

            for (int j = 0; j < clients[i].getNumberOfAccounts(); j++) {
                if (accountList[j].getAccountNumber().equals(accountNumber)) {
                    return clients[i];
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank: " + "clients = " + Arrays.toString(clients) + "; numberOfClients = " + numberOfClients;
    }
}