// var, const and defines
#define LED_1 9  //Red
#define LED_2 10 //Yellow
#define LED_3 11 //Green

#define ON HIGH
#define OFF LOW
#define DELAY 1000

int cond = 1;
bool reverse = false;
String type = "";

// Aux Fns
void sem()
/*
    Logic led on/off
*/
{

    int led = 1;
    int ledoff_1 = 0;
    int ledoff_2 = 0;

    if (cond == 1)
    {
        led = LED_1;
        ledoff_1 = LED_2;
        ledoff_2 = LED_3;
        type = "Red";
    }
    else if (cond == 2)
    {
        led = LED_2;
        ledoff_1 = LED_1;
        ledoff_2 = LED_3;
        type = "Yellow";
    }
    else
    {
        led = LED_3;
        ledoff_1 = LED_1;
        ledoff_2 = LED_2;
        type = "Green";
    }
    digitalWrite(led, ON);
    digitalWrite(ledoff_1, OFF);
    digitalWrite(ledoff_2, OFF);
    Serial.println(type);
}

void change()
/*
    Change logic function
*/
{
    if (!reverse)
    {
        cond = cond + 1;
        sem();
        if (cond == 3)
        {
            reverse = true;
        }
    }
    else if (reverse)
    {
        cond = cond - 1;
        sem();
        if (cond == 1)
        {
            reverse = false;
        }
    }
}

// Ppal Fns
void setup()
{
    pinMode(LED_1, OUTPUT);
    pinMode(LED_2, OUTPUT);
    pinMode(LED_3, OUTPUT);
    Serial.begin(9600);
}

void loop()
{
    change();
    delay(DELAY);
}