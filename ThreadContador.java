public class ThreadContador extends Thread {
    @Override
    public void run() {
        Fil f1 = new Fil();
        String name = this.getName();
        System.out.println("[" + name + "]");

        for (int i = 0; i < 11; i++) {

           
            if (i == 10) {
                System.out.println(f1 + " Finalizado " + i + "/10");
            }else{
                 System.out.println(f1 + " voy por " + i + "/10");
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
