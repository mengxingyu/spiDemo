package spi;


import java.util.ServiceLoader;

public class Main {
        public static void main(String[] args) {
            ServiceLoader<Rebot> serviceLoader = ServiceLoader.load(Rebot.class);
            for (Rebot rebot : serviceLoader) {
                rebot.sayHello();
            }
        }
}
