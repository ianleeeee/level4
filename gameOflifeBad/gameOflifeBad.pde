//use 1 for living cells
//use 0 for non living cells
int[][] cells;

void setup(){
  size(700,700);
  background(255,255,255);
  cells = new int[14][14];
  //initial cells alive or not
  cells[7][7] = 1;
  //setting up initial grid
  int yMod= -50;
  int xMod = 0;
  for(int []i : cells){
    yMod +=50;
    xMod = 0;
    for(int x: i){
      rect(0+xMod, 0+yMod, 50,50);
      xMod+=50;
    }
  }
}

void draw(){
  update(cells);
  //initial grid setup end
  
}

void update(int[][]cells){
  //check all cells if they die or not or come alive
  //redraws grid accordingly
  int yMod= -50;
  int xMod = 0;
  int oneCount = 0;
  int twoCount = 0;
  for(int []i : cells){
    yMod +=50;
    xMod = 0;
    oneCount+=1;
    for(int x: i){
      println(oneCount, twoCount);
      
      if(oneCount == 7 && twoCount == 7){
        fill(0,0,0);
        rect(0+xMod, 0+yMod, 50,50);
      }
      else{
      rect(0+xMod, 0+yMod, 50,50);
    }
      xMod+=50;
      twoCount+=1;
    }
  }
}