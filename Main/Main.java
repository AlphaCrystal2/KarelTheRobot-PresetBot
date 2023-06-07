import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
import java.util.*; 

public class Main implements Directions{
  public static void main(String[] args) {    
  
    World.setVisible(true);
    World.setDelay(10);
    World.readWorld("blank.kwld"); // Select a world from Main/Worlds!


  }
}
