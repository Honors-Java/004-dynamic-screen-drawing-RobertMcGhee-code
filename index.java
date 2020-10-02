void setup() {
	size(300, 300);
  background(255)
}

void draw(){
//Coordinates
//println(mouseX, mouseY)
//Gemstone
stroke(mouseX, mouseY, 100)
fill(0, 0, 255)
ellipse(150, 150, 100, 100)
fill(100,100,255)
triangle(120, 135, 150, 180, 180, 135)
line(120, 135, 106, 125)
line(150, 180, 150, 200)
line(180, 135, 194, 125)
//Cursor drawing
stroke(mouseX, mouseY, 255)
fill(mouseX, mouseY, 255)
ellipse(mouseX, mouseY, mouseX, mouseY)

}
void keyPressed(){
background(255)  
println("Wiped")
}
void mousePressed(){
stroke(mouseX-50, mouseY-50, 255)
fill(mouseX-50, mouseY-50, 255)
ellipse(mouseX-50, mouseY-50, mouseX, mouseY)
println("Upper left Offset")
}

//dont forget to add mouse and keypressed interaction functions