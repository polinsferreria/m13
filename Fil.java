
public class Fil extends Thread {
    @Override
    public void run() {
        String name = this.getName();
        System.out.println("[" + name + "]");
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
