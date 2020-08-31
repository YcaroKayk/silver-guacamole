void setup() {
  size(800, 600, P3D);
  smooth(4);
}

void draw() {
  background(0);
  lightSpecular(255,255,255);
  ambientLight(32.0, 32.0, 32.0);
  directionalLight(64.0, 64.0, 64.0, 0, 1, -0.25);
  spotLight(232.0, 164.0, 75.0, 250, 100, 300, 1, 0, -1, PI/5.0, 5.0);
  pointLight(192.0, 192.0, 192.0, 100, 400, 120);

  pushMatrix();
    stroke(1);
    translate(400, 300, 0);
    ambient(#011883);
    box(200, 20, 150);
  popMatrix();
  
  pushMatrix();
    translate(315, 336, -60);
    box(20, 100, 20);
  popMatrix();

  pushMatrix();
    translate(480, 336, -60);
    box(20, 100, 20);
  popMatrix();
  
  pushMatrix();
    translate(315, 336, 60);
    box(20, 100, 20);
  popMatrix();
  
  pushMatrix();
    translate(480, 336, 60);
    box(20, 100, 20);
  popMatrix();
  
  pushMatrix();
   translate(270+(mouseX*0.17), 285, -50);
   rotateX(1.55);

   circle(60,60,60);
  popMatrix();
  
  pushMatrix();
  noStroke();
  translate(330+(mouseX*0.17), 270, 10);
  shininess(25.0);
  ambient(255,255,0);
  sphere(20);
  popMatrix();
  
  camera(200+(mouseY*0.5), 150.0, 150.0, 400.0, 300.0, 0.0, 0.0, 1.0, 0.0);
}
