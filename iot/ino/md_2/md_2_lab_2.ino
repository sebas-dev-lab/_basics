// var, const and defines
#define LED_1 9  //Red
#define LED_2 10 //Yellow
#define LED_3 11 //Green

#define ON HIGH
#define OFF LOW
#define DELAY_1 1000
#define DELAY_2 5000


int randomNumber;
String type;

// Auxiliar Functions
void setLed(int num)
{
    int led_on;
    int led_off_1;
    int led_off_2;

    if (num == 1)
    {
        led_on = LED_1;
        led_off_1 = LED_3;
        led_off_2 = LED_2;
        type = "Red";
    }
    else if (num == 2)
    {
        led_on = LED_2;
        led_off_1 = LED_1;
        led_off_2 = LED_3;
        type = "Yellow";
    }
    else
    {
        led_on = LED_3;
        led_off_1 = LED_2;
        led_off_2 = LED_1;
        type = "Green";
    }
    digitalWrite(led_on, ON);
    digitalWrite(led_off_1, OFF);
    digitalWrite(led_off_2, OFF);
    delay(DELAY_1);
    digitalWrite(led_on, OFF);

    Serial.println(type);
}

// Program

void setup()
{
    pinMode(LED_1, OUTPUT);
    pinMode(LED_2, OUTPUT);
    pinMode(LED_3, OUTPUT);
    Serial.begin(9600);
}

void loop()
{
    randomNumber = random(1, 4);
    setLed(randomNumber);
    delay(DELAY_2);
}