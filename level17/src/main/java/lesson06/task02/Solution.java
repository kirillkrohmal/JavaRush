package lesson06.task02;

/* Предложения
Не используя synchronized сделайте так, чтобы количество сделанных и принятых предложений было одинаковым.
*/

public class Solution {
    public static volatile int proposal = 0;

    public static void main(String[] args) {
        new MakeProposal().start();
        new AcceptProposal().start();
    }

    private static class MakeProposal extends Thread{
        @Override
        public void run() {
            int thisProposal = proposal;

            while (proposal < 10) {
                System.out.println("Сделано предложение №" + (thisProposal + 1));
                proposal = ++thisProposal;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.getStackTrace();
                }
            }

        }
    }

    private static class AcceptProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (proposal < 10) {
                if (thisProposal != proposal)
                    System.out.println("Принято предложение №" + proposal);
                    thisProposal = proposal;
            }
        }
    }
}


