package Botoes;

import Janela.Janela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

public class Ativar {

    public void Enable(){
        try{
            Thread.sleep(50);
            Robot mouse = new Robot();
            mouse.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            mouse.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Enable();
        }catch(AWTException e){
            e.printStackTrace();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
