void setup(){
  size(600,600);
}

void draw(){
  int base = 14;
  int width = 30;
  int height = 12;
  int adder = 0;
  for(int i = 0; i < base; i ++){
    rect(75+adder+15,587-(height*0), width,height);
    adder+=30;
  }
  int adder2 = 0;
  for(int i = 0; i < base-1; i ++){
    rect(90+adder2+15,587-(height*1),width,height);
    adder2+=30;
  }
  int adder3 = 0;
  for(int i = 0; i < base-2; i ++){
    rect(105+adder3+15,587-(height*2),width,height);
    adder3+=30;
  }
  int adder4 = 0;
  for(int i = 0; i < base-3; i ++){
    rect(120+adder4+15,587-(height*3),width,height);
    adder4+=30;
  }
  int adder5 = 0;
  for(int i = 0; i < base-4; i ++){
    rect(135+adder5+15,587-(height*4),width,height);
    adder5+=30;
  }
  int adder6 = 0;
  for(int i = 0; i < base-5; i ++){
    rect(150+adder6+15,587-(height*5),width,height);
    adder6+=30;
  }
  int adder7 = 0;
  for(int i = 0; i < base-6; i ++){
    rect(165+adder7+15,587-(height*6), width,height);
    adder7+=30;
  }
  int adder8 = 0;
  for(int i = 0; i < base-7; i ++){
    rect(180+adder8+15,587-(height*7), width,height);
    adder8+=30;
  }
  int adder9 = 0;
  for(int i = 0; i < base-8; i ++){
    rect(195+adder9+15,587-(height*8),width,height);
    adder9+=30;
  }
  int adder10 = 0;
  for(int i = 0; i < base-9; i ++){
    rect(210+adder10+15,587-(height*9),width,height);
    adder10+=30;
  }
  int adder11 = 0;
  for(int i = 0; i < base-10; i ++){
    rect(225+adder11+15,587-(height*10),width,height);
    adder11+=30;
  }
  int adder12 = 0;
  for(int i = 0; i < base-11; i ++){
    rect(240+adder12+15,587-(height*11),width,height);
    adder12+=30;
  }
  int adder13 = 0;
  for(int i = 0; i < base-12; i ++){
    rect(255+adder13+15,587-(height*12),width,height);
    adder13+=30;
  }
  int adder14 = 0;
  for(int i = 0; i < base-13; i ++){
    rect(270+adder14+15,587-(height*13), width,height);
    adder14+=30;
  }

}