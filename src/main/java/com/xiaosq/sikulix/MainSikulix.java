package com.xiaosq.sikulix;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class MainSikulix {

    static String imagePath = "D:/work/sikulix1.1.2/scriptA.sikuli/";

    public static void main(String[] args) {

        Screen s = new Screen();

        Region re = s.get(3);

        try {

            re.click(imagePath + "1531365514351.png");


        } catch (FindFailed ex) {

        }



    }
}
