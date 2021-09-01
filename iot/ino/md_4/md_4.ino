/*
    While Structure
*/

int count = 0;

void setup()
{
    Serial.beign(9600);
}

void loop()
{
    while (count < 10)
    {
        Serial.println(count);
        count = count + 1;
        delay(1000);
    }
    count = 0
}