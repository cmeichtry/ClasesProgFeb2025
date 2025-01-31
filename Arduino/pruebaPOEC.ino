const int ledRojo1 = 2;
const int ledRojo2 = 3;
const int ledVerde1 = 4;
const int ledVerde2 = 5;

const int motorBarrera1 = 6;
const int motorBarrera2 = 7;
const int motorPuente1 = 8;
const int motorPuente2 = 9;

const int sensorMovimiento = 10;
const int potenciometro = A0;

int valorPotenciometro;
bool movimientoDetectado = false;

void setup() {
  pinMode(ledRojo1, OUTPUT);
  pinMode(ledRojo2, OUTPUT);
  pinMode(ledVerde1, OUTPUT);
  pinMode(ledVerde2, OUTPUT);

  pinMode(motorBarrera1, OUTPUT);
  pinMode(motorBarrera2, OUTPUT);
  pinMode(motorPuente1, OUTPUT);
  pinMode(motorPuente2, OUTPUT);

  pinMode(sensorMovimiento, INPUT);
  Serial.begin(9600);

  apagarTodo();
}

void bajarBarreras() {
  Serial.println("Bajando barrera");
  digitalWrite(motorBarrera1, HIGH);
  digitalWrite(motorBarrera2, HIGH);
  delay(2000);
  digitalWrite(motorBarrera1, LOW);
  digitalWrite(motorBarrera2, LOW);
}

void subirBarreras() {
  Serial.println("Subiendo barrera");
  digitalWrite(motorBarrera1, HIGH);
  digitalWrite(motorBarrera2, HIGH);
  delay(2000);
  digitalWrite(motorBarrera1, LOW);
  digitalWrite(motorBarrera2, LOW);
}

void prenderRojo(void) {
  digitalWrite(ledRojo1, HIGH);
  digitalWrite(ledRojo2, HIGH);
  digitalWrite(ledVerde1, LOW);
  digitalWrite(ledVerde2, LOW);
}

void prenderVerde(void) {
  digitalWrite(ledRojo1, LOW);
  digitalWrite(ledRojo2, LOW);
  digitalWrite(ledVerde1, HIGH);
  digitalWrite(ledVerde2, HIGH);
}

void parpadearRojos() {
  for (int i = 0; i < 5; i++) {
    digitalWrite(ledRojo1, HIGH);
    digitalWrite(ledRojo2, HIGH);
    delay(500);
    digitalWrite(ledRojo1, LOW);
    digitalWrite(ledRojo2, LOW);
    delay(500);
  }
}

void apagarTodo() {
  digitalWrite(ledRojo1, LOW);
  digitalWrite(ledRojo2, LOW);
  digitalWrite(ledVerde1, LOW);
  digitalWrite(ledVerde2, LOW);
  
  digitalWrite(motorPuente1, LOW);
  digitalWrite(motorPuente2, LOW);
    
  digitalWrite(motorBarrera1, LOW);
  digitalWrite(motorBarrera2, LOW);
}

void loop() {
  valorPotenciometro = map(analogRead(potenciometro), 0, 1023, 1, 100);
  movimientoDetectado = digitalRead(sensorMovimiento);

  Serial.println(valorPotenciometro);

  if (movimientoDetectado == LOW) {
    digitalWrite(motorPuente1, LOW);
    digitalWrite(motorPuente2, LOW);
    bajarBarreras();
    parpadearRojos();
    digitalWrite(ledVerde1, LOW);
    digitalWrite(ledVerde2, LOW);
    Serial.println("Movimiento detectado");
  }

  if (valorPotenciometro >= 80 && movimientoDetectado == HIGH) {
    prenderRojo();
    bajarBarreras();
    delay(5000);
    digitalWrite(motorPuente1, HIGH); //Rosado
    digitalWrite(motorPuente2, HIGH); //Rosado
    delay(10000);
    digitalWrite(motorPuente1, LOW); //Rosado
    digitalWrite(motorPuente2, LOW); //Rosado
    prenderVerde();
    subirBarreras();
  } else if (valorPotenciometro < 80 && movimientoDetectado == HIGH) {
    apagarTodo();
  }
}
