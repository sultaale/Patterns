package com.sultaale.patterns.proxy.virtualProxy;

import java.net.URL;
import javax.swing.*;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    URL initialURL = new URL("https://sun9-52.userapi.com/impg/PRaR4ZLEfPIY2jvVyZsApnqRmLmWIfgphjNPkw/5HYDxUL5_4w.jpg?size=1600x1600&quality=96&sign=e54ee9f66d9c8ad2944100aed966811b&type=album");

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception{
        JFrame frame = new JFrame("Pictures");
        frame.setSize(1500, 1900);
        JMenu menu = new JMenu("Pictures");

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
    }


}
