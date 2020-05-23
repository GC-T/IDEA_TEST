package test.org.tanggc;

import java.util.Date;

/**
 * Auther: tanggc
 * Date: 2020/5/23 15:52
 * Description:
 */
public class FactoryImpl implements Factory {
    private static String dbName;
    private String accessType;

    @Override
    public void getFlouwer() {

        Date date = new Date();
        String name = new String();

        if (name != null && name != "") {

        }

        System.out.println("username name is zhangsan");

    }


    public  static  void  accessDb(String dbName){
        System.out.println("succ");
    }

    public  void accessDbFace(String dbName) {
            this.dbName =dbName + accessType;

        mutiAccessDb(dbName);
    }

    private static void mutiAccessDb(String dbName) {
        validate(dbName);
        accessDb(dbName);
        accessDb(dbName);
        accessDb(dbName);
        accessDb(dbName);
    }

    private static void validate(String dbName) {
        accessDb(dbName);
        accessDb(dbName);
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(new Date());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
