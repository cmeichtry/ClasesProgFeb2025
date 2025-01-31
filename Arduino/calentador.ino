const int pinPotenciometro = A0; 
const int pinBotonUp = 3;        
const int pinBotonDown = 2;
const int pinLED = 12; 

int temperaturaDeseada = 25;
int temperaturaActual = 0;
const int pasoTemperatura = 1;

void lecturaBotones(void){
  if (digitalRead(pinBotonUp) == LOW) {
    temperaturaDeseada += pasoTemperatura;
    delay(100);
  }
  if (digitalRead(pinBotonDown) == LOW) {
    temperaturaDeseada -= pasoTemperatura;
    delay(100);
  }
}

void setup() {
  pinMode(pinPotenciometro, INPUT);
  pinMode(pinBotonUp, INPUT);
  pinMode(pinBotonDown, INPUT);
  pinMode(pinLED, OUTPUT);

  Serial.begin(9600);
}

void loop() {
  temperaturaActual = map(analogRead(pinPotenciometro), 0, 1023, 0, 100);
  lecturaBotones();
/*************************************************/

/*************************************************/

/*************************************************/
  if (temperaturaActual < temperaturaDeseada) {
    digitalWrite(pinLED, HIGH);
  } else {
    digitalWrite(pinLED, LOW);
  }
/*************************************************/

/*************************************************/
  Serial.print("Temperatura Actual: ");
  Serial.print(temperaturaActual);
  Serial.print(" °C | Temperatura Deseada: ");
  Serial.print(temperaturaDeseada);
  Serial.println(" °C");

  delay(100);
}
