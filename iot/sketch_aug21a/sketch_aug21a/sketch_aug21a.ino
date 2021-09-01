#include <Keypad.h>
#include <Wire.h>

const byte ROWS = 4;
const byte COLS = 4;

char keys[ROWS][COLS]={
    {'1','2','3','+'},
    {'4','5','6','-'},
    {'7','8','9','*'},
    {'=','0','.','/'}
  };

  byte rowPins[ROWS]={9,8,7,6};
  byte colPins[COLS]={5,4,3,2};

Keypad keypad = Keypad(makeKeymap(keys), rowPins, colPins, ROWS, COLS);

void setup(){
  Serial.begin(9600); 
}

void loop(){
  char key = keypad.getKey(); 
  if(key != NO_KEY){
    Serial.println(key);
  }
}
    
