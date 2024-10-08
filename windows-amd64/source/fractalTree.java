/* autogenerated by Processing revision 1293 on 2024-05-27 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class fractalTree extends PApplet {

public void setup(){
/* size commented out by preprocessor */;

fill(color(0));
noStroke();
rect(0,0,width,height);
translate(width/2,height);
drawFractalTree(height/5,PI/10);
}
public void draw(){
}

public void drawFractalTree(float len,float angle){
  if (len<5){
  return;
  }
  //init line
  line(0,0,0, -len);
  translate(0,-len);

  //childs
  push();
  rotate(angle);
  stroke(255,255,0);
  drawFractalTree(len*0.8f,angle/0.8f);
  pop();
  
  push();
  rotate(-angle);
  stroke(0,255,255);
  drawFractalTree(len*0.8f,angle/0.8f);
  pop();
}


  public void settings() { size(500, 500); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "fractalTree" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
