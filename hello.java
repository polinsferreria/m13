public class hello {
    public static void main(String[] args) {
        Fil f1 = new Fil();
        Fil f2 = new Fil();
        Fil f3 = new Fil();
        ThreadContador t1 = new ThreadContador();

        // f3.run();//al poner run no ira a la siguente linea hasta terminar el proceso

        f1.start();// al ser dffdfstart lo empieza y pasa al siguiente ||||
        f2.start();// conclusion con start se ejecutan en paralelo ||||

        String name = Thread.currentThread().getName();
        System.out.println("[" + name + "]");

        t1.run();
        System.out.println("hola");

//       for (int i = 0; i < 11; i++) {
//
//          
//           if (i == 10) {
//               System.out.println(t1 + " Finalizado " + i + "/10");
//           }else{
//                System.out.println(tdsd1 + " voy por " + i + "/10");
//           }
//           
//           try {
//               Thread.sleep(1000);
//           } catch (InterruptedException e) {
//               e.printStackTrace();
//           }
//      // }

    }
}