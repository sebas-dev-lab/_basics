/*
    - Entrada digital

*/
#define PIN_1 2
#define PIN_2 11

int lec;

void setup()
{
    pinMode(PIN_1, INPUT);
    Serial.begin(9600);
}

void loop()
{
    lec = digitalRead(PIN_1);
    Serial.println(lec);
    delay(500);
}