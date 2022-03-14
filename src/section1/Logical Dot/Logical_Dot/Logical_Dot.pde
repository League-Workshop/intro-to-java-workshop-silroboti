int fillcolor; 
void setup() {
  
size(600,600);
  fillcolor = 0; 

}

void draw() {
  ellipse(300,300,90,100);
  strokeWeight(3);
  stroke(#C7E5E8);
fill(fillcolor); 

  

}
 
void mouseReleased(){
  if(fillcolor == 0){
    fillcolor = 255;
  } else {
    fillcolor = 0;
  }
}
  
  
