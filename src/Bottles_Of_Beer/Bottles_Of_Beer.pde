

void draw(){
  for(int i = 99; i >= 0; i--){
    String sentence = "";
    if(i == 0){
      sentence = "No more";
    }
    else{
    sentence = i + "";
    }
    sentence = sentence + " bottle";
    if(i != 1){
    sentence = sentence + "s";
    }
    sentence = sentence +  " of beer on the wall, ";
    if(i == 0){
    sentence = sentence + "no more";
    }
    else{
    sentence = sentence + i;
    }
    sentence = sentence + " bottle";
    if(i != 1){
    sentence = sentence + "s";
    }
    sentence = sentence + " of beer. ";
    if(i == 0){
    sentence = sentence + "Go to the store and buy some more, ";
    }
    else {
    sentence = sentence + "Take one down and pass it around, ";
    }
    if(i == 0){
    sentence = sentence + "99";
    }
    else{
    sentence = sentence + (i-1);
    }
    sentence = sentence + " bottle";
    if(i - 1 != 1){
      sentence = sentence + "s";
    }
    sentence = sentence +  " of beer on the wall. ";
  print(sentence);
  }
  
  stop();
  
  
}