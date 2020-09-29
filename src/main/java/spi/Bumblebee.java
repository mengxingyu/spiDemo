package spi;

/**
 * @Package: main.java.company
 * @ClassName: Bumblebee
 * @Author: mengxingyu
 * @Description:
 * @Date: 2020/9/29 9:43
 */
public class Bumblebee implements Rebot {
    @Override
    public void sayHello() {
        System.out.println("Hello, mxy 非常英俊.");
    }
}