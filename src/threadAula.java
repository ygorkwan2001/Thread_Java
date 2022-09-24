public class threadAula extends Thread{

    @Override
    public void run(){
        System.out.println("ID: "+ threadAula.currentThread().getId());
    }

    public static void main(String[] args) {
        threadAula t1 = new threadAula();
        threadAula t2 = new threadAula();

        t1.start();
        t2.start();


    }

}
