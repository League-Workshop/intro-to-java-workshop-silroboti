// 1. Drag and drop an image with a face onto this sketch
//    a. First find the image (use google to search)
//    b. Right click on the image and select 'Save image As'
//    c. Rename the image something short (e.g. face.jpg)
//    d. Save the image to your computer's desktop
//    e. Drag and drop the image anywhere on this sketch


// These 2 lines of code create variables to hold your face picture and a mustache.
// You will use these later.
PImage face;
PImage mustache;


void setup() {
  

face = loadImage("face.jpg");
size(600,600);
mustache = (0, 0);

mustache = loadImage("mustache.png");
 face.resize(width, height);
  }

void draw() {
  image (face, 0, 0);

// 6. DRAW FACE.    Use the background() command to make the face the background of the sketch
//    Run the program to see if the face is drawn. Get this working before you go on.
  

// 7. DRAW MUSTACHE. Use the image() command to draw the mustache.  
//                  The image command looks like this:
image (mustache, mouseX-250, mouseY-100);

if (mouseButton == RIGHT){
  PImage mustache;

}
// OPTIONAL:
//     Add an if statement so the mustache is only drawn when the mouse is clicked.
//     Add or subtract from mouseX and mouseY when you draw the mustache,
//               so the mustache center appears where the mouse pointer is
//     Draw a hat on the sketch when the right mouse button is pressed. Use this code.
//               if (mouseButton == RIGHT)  {     }

}
