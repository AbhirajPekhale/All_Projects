package q14_multithread;


class E {
    void printTable(int n) { //method not synchronized  
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class MyThread extends Thread {
    Table t;
    MyThread(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }

}
class MyThreaD extends Thread {
    Table t;
    MyThreaD(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}

class TestSynchronization1 {
    public static void main(String args[]) {
        Table obj = new Table(); //only one object  
        MyThread t1 = new MyThread(obj);
        MyThreaD t2 = new MyThreaD(obj);
        t1.start();
        t2.start();
    }
}