void setup() {
  // put your setup code here, to run once:
  pinMode(13, OUTPUT);
  pinMode(9, OUTPUT);

}
  
void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(13, HIGH);
  digitalWrite(9, LOW);
  delay(1000);
  digitalWrite(13, LOW);
  digitalWrite(9, HIGH);
  delay(1000); 
}
