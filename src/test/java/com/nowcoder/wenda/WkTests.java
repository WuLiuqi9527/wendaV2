package com.nowcoder.wenda;

import java.io.IOException;

public class WkTests {

    public static void main(String[] args) {
        String cmd = "D:/Java/JavaWeb/wkhtmltox/bin/wkhtmltoimage --quality 75  https://www.nowcoder.com D:/Java/Java/Test_MSB/Projects/Wenda/wendaV2/wenda/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
