//
//class MyTask extends Thread{
//    @Override
//    public void run(){
//        for(int doc=1;doc<=10;doc++)
//        {
//            System.out.println("@@Printing Document@@ "+doc);
//        }
//    }
//}
//
//public class Threading {
//    public static void main(String[] args) {
//        //whatever we write in here will be executed by main thread
//        //Threads always execute the jobs in a sequence
//        //Execution Context
//
//
//        System.out.println("++Application Started==");
//
//        MyTask T1=new MyTask();
//        T1.start();
//
//        //Some Code to print tthe documents
//        for(int doc=1;doc<=10;doc++)
//        {
//            System.out.println("Printing Document "+doc);
//        }
//
//        MyTask T2=new MyTask();
//        T2.start();
//        System.out.println("++Application Finished");
//    }
//}

class CAW{

}

class MyTask extends CAW implements Runnable{
    @Override
    public void run(){
        for(int doc=1;doc<=10;doc++)
        {
            System.out.println("@@Printing Document@@ "+doc);
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        //whatever we write in here will be executed by main thread
        //Threads always execute the jobs in a sequence
        //Execution Context


        System.out.println("++Application Started==");

        Runnable r=new MyTask();
        Thread task=new Thread(r);
        task.start();


        //Some Code to print tthe documents
        for(int doc=1;doc<=10;doc++)
        {
            System.out.println("Printing Document "+doc);
        }

        System.out.println("++Application Finished");
    }
}

