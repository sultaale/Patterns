package com.sultaale.patterns.decorator.inputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream
                    (new BufferedInputStream(
                        new FileInputStream("C:\\Users\\Imp10\\IdeaProjects\\Pattern\\pattern\\src\\com\\siltaale\\patterns\\decorator\\inputstream\\test.txt")
                    ));
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
