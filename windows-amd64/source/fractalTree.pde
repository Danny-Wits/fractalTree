void setup(){
size(500,500);

fill(color(0));
noStroke();
rect(0,0,width,height);
translate(width/2,height);
drawFractalTree(height/5,PI/10);
}
void draw(){
}

void drawFractalTree(float len,float angle){
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
  drawFractalTree(len*0.8,angle/0.8);
  pop();
  
  push();
  rotate(-angle);
  stroke(0,255,255);
  drawFractalTree(len*0.8,angle/0.8);
  pop();
}
