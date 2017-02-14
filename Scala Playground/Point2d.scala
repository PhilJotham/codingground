package Phil.Point.Point2d;

class Point2d(val nc: String, val xc: Int, val yc: Int) {
   var c: String = nc        
   var x: Int = xc
   var y: Int = yc
   
   def position {
       "x:" + x + ", y:" + y;
   }
   
   def home {
       x = 0
       y = 0
   }
   
   def status {
       c + " is located at " + position;
   }
   
   def printStatus {
      println(status); 
   }
   
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      printStatus;
   }
}