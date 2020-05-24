package test.org.tanggc;

import java.util.Date;

/**
 * Auther: tanggc
 * Date: 2020/5/24 15:05
 * Description:
 */
public class Gittest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
