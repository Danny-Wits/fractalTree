void setup(){
size(500,500);

fill(color(0));
noStroke();
rect(0,0,width,height);
translate(width/2,height);
drawFractalTree(height/4,PI/3);
}
void draw(){
}

void drawFractalTree(float len,float angle){
  if (len<1){
  return;
  }
  //init line
  stroke(255,255,255);
  line(0,0,0, -len);
  translate(0,-len);

  //childs
  push();
  rotate(angle);
  
  drawFractalTree(len*0.7,angle*0.9);
  pop();
  
  push();
  rotate(-angle);
  drawFractalTree(len*0.7,angle*0.9);
  pop();
}
