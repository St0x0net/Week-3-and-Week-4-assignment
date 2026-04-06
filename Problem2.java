class Client {
    String name;
    int riskScore;
    double balance;

    Client(String name, int riskScore, double balance) {
        this.name = name;
        this.riskScore = riskScore;
        this.balance = balance;
    }
    public String toString() { return name + ":" + riskScore; }
}

public class Problem2 {
    public static void main(String[] args) {
        Client[] clients = {
                new Client("C", 80, 5000),
                new Client("A", 20, 10000),
                new Client("B", 50, 2000)
        };

        // Bubble Sort (ASC)
        for (int i = 0; i < clients.length - 1; i++) {
            for (int j = 0; j < clients.length - i - 1; j++) {
                if (clients[j].riskScore > clients[j+1].riskScore) {
                    Client temp = clients[j];
                    clients[j] = clients[j+1];
                    clients[j+1] = temp;
                }
            }
        }

        // Insertion Sort (DESC)
        for (int i = 1; i < clients.length; i++) {
            Client key = clients[i];
            int j = i - 1;
            while (j >= 0 && clients[j].riskScore < key.riskScore) {
                clients[j + 1] = clients[j];
                j--;
            }
            clients[j + 1] = key;
        }

        System.out.println("Top 3 Risks: " + clients[0] + ", " + clients[1] + ", " + clients[2]);
    }
}